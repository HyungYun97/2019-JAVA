package project;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.Border;

 

public class project extends JFrame implements ActionListener{
	
	JTextField textField;
	JButton btn;
	JButton btn1;
	JRadioButton combo;
	JRadioButton bulgogi;
	JRadioButton potato;
	JRadioButton small;
	JRadioButton medium;
	JRadioButton large;
	JCheckBox pimang;
	JCheckBox cheese;
	JCheckBox peperoni;
	JCheckBox bacon;
	int totalPrice = 0;
	int typePrice = 0;
	int toppingPrice = 0;
	int sizePrice = 0;
	int va1 = 10000;
	int va2 = 15000;
	int va3 = 20000;
	int va4 = 3000;
	int va5 = 5000;
	int va6 = 8000;
	int va7 = 5000;


	public project() {
		this.setTitle("Pizza Order");
		this.setSize(600,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout()); // 설정해주지 않으면 한장소에 오버라이드 
		this.setVisible(true);
		main();
		this.pack();
	}
	void main() {
		JPanel mainp = new JPanel();
		mainp.setLayout(new BorderLayout());
		mainp.add(box(), BorderLayout.NORTH);
		mainp.add(type(), BorderLayout.WEST);
		mainp.add(At(), BorderLayout.CENTER);
		mainp.add(Sz(), BorderLayout.EAST);
		mainp.add(bt(), BorderLayout.SOUTH);
		this.add(mainp);
	}
	JPanel box() {
		JPanel bg = new JPanel();
		bg.setBackground(Color.GREEN);
		bg.setPreferredSize(new Dimension(600,40));
		JLabel bg1 = new JLabel();
		bg1.setText("Welcome to ParkVill Pizza");
		bg.add(bg1);
		this.add(bg);
		return bg;
		
	}
	JPanel type() {
		
		JPanel p1 = new JPanel();
		p1.setPreferredSize(new Dimension(200,150));
		p1.setLayout(new GridLayout(3,1)); //
		Border border = BorderFactory.createTitledBorder("Type");
		p1.setBorder(border);
		p1.setBackground(Color.YELLOW);
		combo = new JRadioButton("combo");
		combo.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				typePrice = va4;
			}
			
		});
		p1.add(combo);
		combo.setBackground(Color.yellow);
		potato = new JRadioButton("potato");
		p1.add(potato);
		potato.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				typePrice = va5;
			}
			
		});
		potato.setBackground(Color.yellow);// 하나하나 설정 해줘야함 개노가다
		bulgogi = new JRadioButton("bulgogi");
		p1.add(bulgogi);
		bulgogi.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				typePrice = va6;
			}
			
		});
		bulgogi.setBackground(Color.YELLOW);
		
		ButtonGroup Type = new ButtonGroup();

		Type.add(combo);
		Type.add(potato);
		Type.add(bulgogi);
		this.add(p1);
		return p1;
	}
	JPanel At() {
		JPanel p2 = new JPanel();
		p2.setPreferredSize(new Dimension(200,150));
		p2.setLayout(new GridLayout(4,1)); //가운데 정렬을 시켜주려면 GridLayout 사용
		Border border = BorderFactory.createTitledBorder("Additional Topping");
		p2.setBorder(border);
		p2.setBackground(Color.CYAN);
		pimang = new JCheckBox("pimang");
		p2.add(pimang);
		pimang.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				toppingPrice = va7;
			}
			
		});
		
		pimang.setBackground(Color.CYAN);
		cheese = new JCheckBox("cheese");
		cheese.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				toppingPrice = va7;
			}
			
		});
		p2.add(cheese);
		cheese.setBackground(Color.CYAN);
		peperoni = new JCheckBox("peperoni");
		peperoni.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				toppingPrice = va7;
			}
			
		});
		p2.add(peperoni);
		peperoni.setBackground(Color.CYAN);
		bacon = new JCheckBox("bacon");
		bacon.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				toppingPrice = va7;
			}
			
		});
		p2.add(bacon);
		bacon.setBackground(Color.CYAN);
		
		ButtonGroup to = new ButtonGroup();
		to.add(pimang);
		to.add(cheese);
		to.add(peperoni);
		to.add(bacon);
		this.add(p2);
		return p2;
	}
	
	JPanel Sz() {
		JPanel p3 = new JPanel();
		
		p3.setPreferredSize(new Dimension(200,150));
		p3.setLayout(new GridLayout(3,1));
		Border border = BorderFactory.createTitledBorder("SIZE");
		p3.setBorder(border);
		p3.setBackground(Color.MAGENTA);
		small = new JRadioButton("small");
		p3.add(small);
		small.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				sizePrice = va1;
			}
			
		});
		small.setBackground(Color.magenta);
		medium = new JRadioButton("medium");
		p3.add(medium);
		medium.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				sizePrice = va2;
			}
			
		});
		medium.setBackground(Color.magenta);
		large = new JRadioButton("large");
		p3.add(large);
		large.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				sizePrice = va3;
			}
		});
		large.setBackground(Color.magenta);
		
		ButtonGroup Type = new ButtonGroup();
		Type.add(small);
		Type.add(medium);
		Type.add(large);
		
		this.add(p3);
		return p3;
	}

	JPanel bt() {
		JPanel bt = new JPanel();
		bt.setPreferredSize(new Dimension(600,50));
		bt.setBackground(Color.orange);
		textField = new JTextField(10);
		btn = new JButton("ORDER");
		bt.add(btn);
		btn.addActionListener(this);
		bt.add(textField);
		btn1 = new JButton("CANCEL");
		bt.add(btn1);
		btn1.addActionListener(this);
		return bt;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		project a = new project();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == btn) {
			totalPrice = sizePrice + toppingPrice + typePrice;
			textField.setText(String.valueOf(totalPrice));
		}
		else if (e.getSource() == btn1){
			textField.setText("");
		}
		}
	}