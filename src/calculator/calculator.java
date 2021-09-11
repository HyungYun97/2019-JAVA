package calculator;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class calculator extends JFrame{

		public calculator(){
			this.setTitle("계산기");
			this.setSize(380,700);
			
			text();
			GridTest();
			GridTest1();
			pack();
			this.setVisible(true);
		}
		
		void text() {
			JPanel panel = new JPanel();
			JTextField text = new JTextField(30);
			panel.add(text);
			text.setPreferredSize(new Dimension(380,80));
			this.add(panel,BorderLayout.PAGE_START);
		}

		void GridTest1() {
			
			JPanel grid2 = new JPanel();
			grid2.setLayout(new GridLayout(1,6));
			JButton bnt1 = new JButton("MC");
			grid2.add(bnt1);
			JButton bnt2 = new JButton("MR");
			grid2.add(bnt2);
			JButton bnt3 = new JButton("M+");
			grid2.add(bnt3);
			JButton bnt4 = new JButton("M-");
			grid2.add(bnt4);
			JButton bnt5 = new JButton("MS");
			grid2.add(bnt5);
			JButton bnt6 = new JButton("M^");
			grid2.add(bnt6);
			this.add(grid2,BorderLayout.CENTER);
			
			
		}
		
		void GridTest() {
			JPanel grid1 = new JPanel();
			
			grid1.setLayout(new GridLayout(6,4));
			JButton bnt1 = new JButton("%");
			grid1.add(bnt1);
			JButton bnt2 = new JButton("2루트x");
			grid1.add(bnt2);
			JButton bnt3 = new JButton("x^2");
			grid1.add(bnt3);
			JButton bnt4 = new JButton("1/x");
			grid1.add(bnt4);
			JButton bnt5 = new JButton("CE");
			grid1.add(bnt5);
			JButton bnt6 = new JButton("C");
			grid1.add(bnt6);
			JButton bnt8 = new JButton("지우기");
			grid1.add(bnt8);
			JButton bnt9 = new JButton("나누기");
			grid1.add(bnt9);
			JButton bnt10 = new JButton("7");
			grid1.add(bnt10);
			JButton bnt12 = new JButton("8");
			grid1.add(bnt12);
			JButton bnt11 = new JButton("9");
			grid1.add(bnt11);
			JButton bnt13 = new JButton("X");
			grid1.add(bnt13);
			JButton bnt14 = new JButton("4");
			grid1.add(bnt14);
			JButton bnt15 = new JButton("5");
			grid1.add(bnt15);
			JButton bnt16 = new JButton("6");
			grid1.add(bnt16);
			JButton bnt17 = new JButton("-");
			grid1.add(bnt17);
			JButton bnt18 = new JButton("1");
			grid1.add(bnt18);
			JButton bnt19 = new JButton("2");
			grid1.add(bnt19);
			JButton bnt20 = new JButton("3");
			grid1.add(bnt20);
			JButton bnt21 = new JButton("+");
			grid1.add(bnt21);
			JButton bnt22 = new JButton("+/-");
			grid1.add(bnt22);
			JButton bnt23 = new JButton("0");
			grid1.add(bnt23);
			JButton bnt24 = new JButton(".");
			grid1.add(bnt24);
			JButton bnt25 = new JButton("=");
			grid1.add(bnt25);
			this.add(grid1,BorderLayout.PAGE_END);

		}

	 

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		calculator a = new calculator();

	}

	}
