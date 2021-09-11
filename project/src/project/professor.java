package project;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
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
import javax.swing.JTextField;

public class professor extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JTextField price;
	private int[] typePrice = {10000,15000,20000 };
	private int[] sizePrice = {0,5000,10000};
	private int f_typePrice = 0;
	private int f_toppingPrice = 0;
	private int f_sizePrice = 0;
	private int totalPrice = 0;
	private JCheckBox pimang;
	private JCheckBox cheese;
	private JCheckBox peperoni;
	private JCheckBox bacon;
	
	public professor() {
		this.setTitle("Pizza Order");
		this.setSize(600,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBackground(Color.GREEN);
		UImanager();
		this.pack();
		this.setVisible(true);
	}
	
	void UImanager() {
		JPanel mainP = new JPanel();
		mainP.setLayout(new BorderLayout());
		mainP.add(titlePanel(),BorderLayout.NORTH);
		mainP.add(typePanel(),BorderLayout.WEST);
		mainP.add(addToppingPanel(),BorderLayout.CENTER);
		mainP.add(sizePanel(),BorderLayout.EAST);
		mainP.add(orderPanel(),BorderLayout.SOUTH);
		this.add(mainP);
	}
	
	JPanel titlePanel() {
		JPanel tPanel = new JPanel();
		tPanel.setLayout(new FlowLayout());
		tPanel.setBackground(Color.GREEN);
		JLabel orderTitle = new JLabel("Welcome to Java Pizza");
		tPanel.add(orderTitle);
		return tPanel;
	}
	
	JPanel typePanel() {	
		JPanel tPanel = new JPanel();
		tPanel.setBackground(Color.YELLOW);
		tPanel.setLayout(new GridLayout(3,1));
		tPanel.setPreferredSize(new Dimension(200,150));		
		JRadioButton combo = new JRadioButton("combo",true);
		combo.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				f_typePrice = typePrice[0];
			}	
		});
		combo.setBackground(Color.YELLOW);
		JRadioButton potato = new JRadioButton("potato");
		potato.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				f_typePrice = typePrice[1];
			}	
		});
		potato.setBackground(Color.YELLOW);
		JRadioButton bulgogi = new JRadioButton("bulgogi");
		bulgogi.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				f_typePrice = typePrice[2];
			}	
		});
		bulgogi.setBackground(Color.YELLOW);
		ButtonGroup bg = new ButtonGroup();
		bg.add(combo);
		bg.add(potato);
		bg.add(bulgogi);
		tPanel.setBorder( BorderFactory.createTitledBorder("TYPE"));
		tPanel.add(combo);
		tPanel.add(potato);
		tPanel.add(bulgogi);
		return tPanel;
	}
	
	JPanel addToppingPanel() {	
		JPanel tPanel = new JPanel();
		tPanel.setBackground(Color.CYAN);
		tPanel.setLayout(new BoxLayout(tPanel,BoxLayout.Y_AXIS));
		tPanel.setPreferredSize(new Dimension(200,150));		
		pimang = new JCheckBox("pimang",true);
		pimang.setBackground(Color.CYAN);
		cheese = new JCheckBox("cheese");
		cheese.setBackground(Color.CYAN);
		peperoni = new JCheckBox("peperoni");
		peperoni.setBackground(Color.CYAN);
		bacon = new JCheckBox("bacon");
		bacon.setBackground(Color.CYAN);
		tPanel.setBorder( BorderFactory.createTitledBorder("Additional Topping"));
		tPanel.add(pimang);
		tPanel.add(cheese);
		tPanel.add(peperoni);
		tPanel.add(bacon);
		return tPanel;
	}
	
	JPanel sizePanel() {	
		JPanel tPanel = new JPanel();
		tPanel.setBackground(Color.MAGENTA);
		tPanel.setLayout(new GridLayout(3,1));
		tPanel.setPreferredSize(new Dimension(200,150));		
		JRadioButton small = new JRadioButton("small",true);
		small.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				f_sizePrice = sizePrice[0];
			}	
		});
		small.setBackground(Color.MAGENTA);
		JRadioButton medium = new JRadioButton("medium");
		medium.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				f_sizePrice = sizePrice[1];
			}	
		});
		medium.setBackground(Color.MAGENTA);
		JRadioButton large = new JRadioButton("large");
		large.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				f_sizePrice = sizePrice[2];
			}	
		});
		large.setBackground(Color.MAGENTA);
		ButtonGroup bg = new ButtonGroup();
		bg.add(small);
		bg.add(medium);
		bg.add(large);
		tPanel.setBorder( BorderFactory.createTitledBorder("SIZE"));
		tPanel.add(small);
		tPanel.add(medium);
		tPanel.add(large);
		return tPanel;
	}
	
	JPanel orderPanel() {
		JPanel tPanel = new JPanel();
		tPanel.setBackground(Color.ORANGE);
		tPanel.setLayout(new FlowLayout());
		price = new JTextField(10);		
		JButton order = new JButton("Order");
		order.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if ( pimang.isSelected() ) {
					f_toppingPrice += 1000;
				}
				if ( cheese.isSelected() ) {
					f_toppingPrice += 1000;
				}
				if ( peperoni.isSelected() ) {
					f_toppingPrice += 1000;
				}
				if ( bacon.isSelected() ) {
					f_toppingPrice += 1000;
				}
				totalPrice = f_typePrice + f_toppingPrice + 
						f_sizePrice;
				price.setText(String.valueOf(totalPrice));
			}	
		});
		JButton cancel = new JButton("Cancel");
		cancel.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}	
		});
		tPanel.add(order);
		tPanel.add(price);
		tPanel.add(cancel);
		return tPanel;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		professor st = new professor();
	}

}
