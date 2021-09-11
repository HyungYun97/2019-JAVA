package project;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.Border;

 

public class example1 extends JFrame implements ActionListener {
 

	public example1() {
		this.setTitle("Pizza Order");
		this.setSize(650,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout()); // 설정해주지 않으면 한장소에 오버라이드 
		this.setVisible(true);
		
		box();
		type();
		At();
		Sz();
		bt();

	}
	void box() {
		JPanel bg = new JPanel();
		bg.setBackground(Color.GREEN);
		bg.setPreferredSize(new Dimension(610,30));
		JLabel bg1 = new JLabel();
		this.add(bg1, BorderLayout.NORTH);
		bg1.setText("Welcome to Java Pizza");
		bg.add(bg1);
		this.add(bg);
		
	}
	void type() {
		
		JPanel p1 = new JPanel();
		p1.setPreferredSize(new Dimension(200,150));
		p1.setLayout(new BoxLayout(p1, BoxLayout.Y_AXIS));
		Border border = BorderFactory.createTitledBorder("Type");
		p1.setBorder(border);
		p1.setBackground(Color.YELLOW);
		JRadioButton combo = new JRadioButton("combo");
		p1.add(combo);
		combo.setBackground(Color.yellow);
		combo.setSelected(true);
		JRadioButton potato = new JRadioButton("potato");
		p1.add(potato);
		potato.setBackground(Color.yellow);// 하나하나 설정 해줘야함 개노가다
		JRadioButton bulgogi = new JRadioButton("bulgogi");
		p1.add(bulgogi);
		bulgogi.setBackground(Color.YELLOW);
		
		ButtonGroup Type = new ButtonGroup();

		Type.add(combo);
		Type.add(potato);
		Type.add(bulgogi);
		this.add(p1);
	}
	void At() {
		JPanel p2 = new JPanel();
		
		p2.setPreferredSize(new Dimension(200,150));
		p2.setLayout(new BoxLayout(p2, BoxLayout.Y_AXIS));
		Border border = BorderFactory.createTitledBorder("Additional Topping");
		p2.setBorder(border);
		p2.setBackground(Color.CYAN);
		JCheckBox pimang = new JCheckBox("pimang");
		p2.add(pimang);
		pimang.setBackground(Color.CYAN);
		pimang.setSelected(true);
		JCheckBox cheese = new JCheckBox("cheese");
		p2.add(cheese);
		cheese.setBackground(Color.CYAN);
		JCheckBox peperoni = new JCheckBox("peperoni");
		p2.add(peperoni);
		peperoni.setBackground(Color.CYAN);
		JCheckBox bacon = new JCheckBox("bacon");
		p2.add(bacon);
		bacon.setBackground(Color.CYAN);
		
		ButtonGroup Type = new ButtonGroup();
		Type.add(pimang);
		Type.add(cheese);
		Type.add(peperoni);
		Type.add(bacon);
		this.add(p2);
	}
	void Sz() {
		JPanel p3 = new JPanel();
		
		p3.setPreferredSize(new Dimension(200,150));
		p3.setLayout(new BoxLayout(p3, BoxLayout.Y_AXIS));
		Border border = BorderFactory.createTitledBorder("SIZE");
		p3.setBorder(border);
		p3.setBackground(Color.MAGENTA);
		JRadioButton small = new JRadioButton("small");
		p3.add(small);
		small.setBackground(Color.magenta);
		small.setSelected(true);
		JRadioButton medium = new JRadioButton("medium");
		p3.add(medium);
		medium.setBackground(Color.magenta);
		JRadioButton large = new JRadioButton("large");
		p3.add(large);
		large.setBackground(Color.magenta);
		this.add(p3);
	}

	void bt() {
		JPanel bt = new JPanel();
		bt.setPreferredSize(new Dimension(610,40));
		bt.setBackground(Color.orange);
		
		JButton btn = new JButton("ORDER");
		bt.add(btn);
		btn.addActionListener(this);
		JButton btn1 = new JButton("CANCEL");
		bt.add(btn1);
		this.add(bt, BorderLayout.NORTH);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		example1 a = new example1();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton bt = (JButton) e.getSource();
	bt.setText("주문이 완료 되었습니다.");	
	}

}