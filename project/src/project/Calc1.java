package project;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calc1 extends JFrame implements ActionListener{
	
	
	JTextField text;
	JButton a;
	JButton b;
	JButton c;
	JButton d;
	JButton e1;
	JButton f;
	JButton g;
	JButton h;
	JButton i;
	JButton j;
	JButton k;
	JButton l;
	int va1,va2; //입력된 숫자 저장할 수 있는 변수
	int result = 0; //결과가 출력될 변수 
	String op; // 연산이 저장될 변수 
	
	public Calc1() {
		this.setVisible(true);
		this.setTitle("Calculator");
		this.setSize(new Dimension(500,500));
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		main();
		this.pack();
		
	}
	
	void main() {
		JPanel mainp = new JPanel();
		mainp.setLayout(new BorderLayout());
		mainp.add(tx(), BorderLayout.NORTH);
		mainp.add(first(), BorderLayout.CENTER);
		mainp.add(second(), BorderLayout.PAGE_END);
		
		this.add(mainp);
	}
	
	JPanel tx() {
		JPanel text1 = new JPanel();
		text1.setPreferredSize(new Dimension(200,100));
		text = new JTextField(40);
		text.setPreferredSize(new Dimension(50,70));
		text.setText("  ");
		
		text1.add(text);
		this.add(text1);
		return text1;
	}
	JPanel first() {
		JPanel tx1 = new JPanel();
		tx1.setPreferredSize(new Dimension(500,50));
		tx1.setLayout(new GridLayout(1,6));
		JButton mc = new JButton("MC");
		tx1.add(mc);
		JButton mr = new JButton("MR");
		tx1.add(mr);
		JButton mp = new JButton("M+");
		tx1.add(mp);
		JButton mm = new JButton("M-");
		tx1.add(mm);
		JButton ms = new JButton("MS");
		tx1.add(ms);
		JButton m = new JButton("M*");
		tx1.add(m);
		
		this.add(tx1);
		return tx1;
	}
	JPanel second() {
		JPanel calc = new JPanel();
		calc.setPreferredSize(new Dimension(500,300));
		calc.setLayout(new GridLayout(3,4));
		a = new JButton("7");
		a.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(e.getSource() == a) {
					text.setText("7");
				}
			}
			
		});
		calc.add(a);
		b = new JButton("8");
		b.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(e.getSource() == b) {
					text.setText("8");
				}
			}
			
		});
		calc.add(b);
		c = new JButton("9");
		c.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(e.getSource() == c) {
					text.setText("9");
				}
			}
			
		});
		calc.add(c);
		d = new JButton("지우기");
		d.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(e.getSource() == d) {
					text.setText(" ");
				}
			}
			
		});
		calc.add(d);
		e1 = new JButton("4");
		e1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(e.getSource() == e1) {
					text.setText("4");
				}
			}
			
		});
		calc.add(e1);
		f = new JButton("5");
		f.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(e.getSource() == f) {
					text.setText("5");
				}
			}
			
		});
		calc.add(f);
		g = new JButton("6");
		g.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(e.getSource() == g) {
					text.setText("6");
				}
			}
			
		});
		calc.add(g);
		h = new JButton("-");
		h.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(e.getSource() == h) {
					va1 = Integer.parseInt(text.getText());
					op = "-";
				}
			}
			
		});
		calc.add(h);
		i = new JButton("1");
		calc.add(i);
		j = new JButton("2");
		calc.add(j);
		k = new JButton("3");
		calc.add(k);
		l = new JButton("=");
		l.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(op.equals("-")) {
					va2 = Integer.parseInt(text.getText());
					result = va1 - va2;
					text.setText(String.valueOf(result));
					
				}
			}
			
		});
		calc.add(l);
		
		
		this.add(calc);
		return calc;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calc1 a = new Calc1();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
