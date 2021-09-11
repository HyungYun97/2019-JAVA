package project;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ex extends JFrame implements ActionListener{
	
	JButton yellow;
	JButton green;
	
	public ex() {
		this.setVisible(true);
		this.setSize(new Dimension(300,300));
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("이벤트 연습");
		main();
		this.pack();
	}
	void main() {
		JPanel event = new JPanel();
		event.setPreferredSize(new Dimension(200,200));
		yellow = new JButton("노란색");
		yellow.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(e.getSource() == yellow) {
					event.setBackground(Color.YELLOW);
				}
			}
			
		});
		green = new JButton("초록색");
		green.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(e.getSource() == green) {
					event.setBackground(Color.GREEN);
				}
			}
			
		});
		event.add(yellow);
		event.add(green);
		this.add(event);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ex a = new ex();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
