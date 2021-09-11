package project;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class calc extends JFrame implements ActionListener {
	JTextField numView;
	JButton[] nBtn;
	int va1,va2;
	String op = "";
	int result = 0;
	
	public calc() {
		this.setTitle("Calculator");
		this.setSize(400,500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MainPanel();
		this.setVisible(true);
	}
	
	void MainPanel() {
		JPanel mainPanel = new JPanel();
		mainPanel.setPreferredSize(new Dimension(380,480));
		mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
		mainPanel.add(textPanel());
		mainPanel.add(funcPanel());
		mainPanel.add(numPanel());
		this.add(mainPanel);
	}
	
	JPanel textPanel() {
		JPanel tPanel = new JPanel();
		tPanel.setPreferredSize(new Dimension(380,100));
		numView = new JTextField("0");
		numView.setPreferredSize(new Dimension(380,95));
		numView.setHorizontalAlignment(JTextField.RIGHT);
		tPanel.add(numView);
		return tPanel;
	}
	
	JPanel funcPanel() {
		final int cnt = 6;
		String[] text = {"MC","MR","M+","M-","MS","M*"};
		JPanel fPanel = new JPanel();
		fPanel.setLayout(new GridLayout(1,6));
		fPanel.setPreferredSize(new Dimension(380,80));
		JButton[] fBtn = new JButton[cnt];
		for ( int i = 0; i < cnt; i++) {
			fBtn[i] = new JButton(text[i]);
			fPanel.add(fBtn[i]);
		}
		return fPanel;
	}
	
	JPanel numPanel() {
		final int cnt = 24;
		String[] text = {"%","XR","XS","1/x","CE","C","BS","/","7","8","9","X",
				"4","5","6","-","1","2","3","+","+/-","0",".","="};
		JPanel nPanel = new JPanel();
		nPanel.setPreferredSize(new Dimension(380,280));
		nPanel.setLayout(new GridLayout(6,4));
		nBtn = new JButton[cnt];
		int ptr = 0;
		for ( int i = 0; i < 6; i++) {
			for ( int j = 0; j < 4; j++ ) {
				nBtn[ptr] = new JButton(text[ptr]);
				nBtn[ptr].addActionListener(this);
				nPanel.add(nBtn[ptr]);
				ptr++;
			}			
		}	
		return nPanel;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if ( e.getSource() == nBtn[8] ) {
			numView.setText("7");
		}
		else if ( e.getSource() == nBtn[9] ) {
			numView.setText("8");
		}
		else if ( e.getSource() == nBtn[10] ) {
			numView.setText("9");
		}
		else if ( e.getSource() == nBtn[12] ) {
			numView.setText("4");
		}
		else if ( e.getSource() == nBtn[13] ) {
			numView.setText("5");
		}
		else if ( e.getSource() == nBtn[14] ) {
			numView.setText("6");
		}
		else if ( e.getSource() == nBtn[16] ) {
			numView.setText("1");
		}
		else if ( e.getSource() == nBtn[17] ) {
			numView.setText("2");
		}
		else if ( e.getSource() == nBtn[18] ) {
			numView.setText("3");
		}
		else if ( e.getSource() == nBtn[21] ) {
			numView.setText("0");
		}
		else if ( e.getSource() == nBtn[7] ) {	//	"/"
			va1 = Integer.parseInt(numView.getText());
			op = "/";
		}
		else if ( e.getSource() == nBtn[11] ) {	//	"X"
			va1 = Integer.parseInt(numView.getText());
			op = "X";
		}
		else if ( e.getSource() == nBtn[15] ) {	//	"-"
			va1 = Integer.parseInt(numView.getText());
			op = "-";
		}
		else if ( e.getSource() == nBtn[19] ) {	//	"+"
			va1 = Integer.parseInt(numView.getText());
			op = "+";
		}
		else if ( e.getSource() == nBtn[5] ) {	//	clear
			numView.setText("0");
		}	
		else if ( e.getSource() == nBtn[23] ) {	//	"="
			if ( op.equals("+") ) {
				va2 = Integer.parseInt(numView.getText());
				result = va1 + va2;
				numView.setText(String.valueOf(result));
			}
			else if ( op.equals("-") ) {
				va2 = Integer.parseInt(numView.getText());
				result = va1 - va2;
				numView.setText(String.valueOf(result));
			}
			else if ( op.equals("X") ) {
				va2 = Integer.parseInt(numView.getText());
				result = va1 * va2;
				numView.setText(String.valueOf(result));
			}
			else if ( op.equals("/") ) {
				va2 = Integer.parseInt(numView.getText());
				if ( va2 != 0 ) {
					result = va1 / va2;
					numView.setText(String.valueOf(result));
				}
				else {
					System.out.println("Warning. divide by 0");
				}
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calc cg = new calc();
	}


}
