package project;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.Border;

public class example extends JFrame {

	public example() {
		this.setTitle("Swing Test");
		this.setSize(400,400);
		this.setLayout(new FlowLayout());
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		dispImageIcon();
//		dispCheck();
		dispRadio();
		this.setVisible(true);	
	}
	
	void dispImageIcon() {
		JPanel mainP = new JPanel();
		mainP.setBackground(Color.BLUE);		
		JLabel imgLab = new JLabel("image icon");	
		imgLab.setForeground(Color.RED);
		ImageIcon labelImg = new ImageIcon("sunrise.png");
		imgLab.setIcon(labelImg);
		mainP.add(imgLab);
		
		JPanel subP = new JPanel();
		subP.setBackground(Color.YELLOW);		
		JLabel imgLab1 = new JLabel("image icon");	
		imgLab1.setForeground(Color.RED);
		ImageIcon labelImg1 = new ImageIcon("sunrise.png");
		imgLab1.setIcon(labelImg1);
		subP.add(imgLab1);
		
		this.add(mainP);
		this.add(subP);
	}
	
	void dispCheck() {
		JPanel checkP = new JPanel();
		checkP.setLayout(new BoxLayout(checkP, BoxLayout.Y_AXIS));
		Border border = BorderFactory.createTitledBorder("Range");
		checkP.setBorder(border);
		JCheckBox check1 = new JCheckBox();
		check1.setText("Suwon");
		checkP.add(check1);
		check1.setSelected(true);
		JCheckBox check2 = new JCheckBox("Busan",true);
		checkP.add(check2);
		this.add(checkP);
		
		JPanel check2P = new JPanel();
		check2P.setLayout(new BoxLayout(check2P, BoxLayout.Y_AXIS));
		Border border2 = BorderFactory.createTitledBorder("Food");
		check2P.setBorder(border2);
		JCheckBox check12 = new JCheckBox();
		check12.setText("Apple");
		check2P.add(check12);
		check12.setSelected(true);
		JCheckBox check22 = new JCheckBox("Orange",true);
		check2P.add(check22);
		JCheckBox check23 = new JCheckBox("Grape");
		check2P.add(check23);
		this.add(check2P);
	}
	
	void dispRadio() {
		JPanel radioP = new JPanel();
		radioP.setLayout(new BoxLayout(radioP, BoxLayout.Y_AXIS));
		Border border2 = BorderFactory.createTitledBorder("Gender");
		radioP.setBorder(border2);
		JRadioButton male = new JRadioButton("male");
		radioP.add(male);
		JRadioButton female = new JRadioButton("female");
		radioP.add(female);		
		ButtonGroup gender = new ButtonGroup();
		gender.add(male);
		gender.add(female);
		this.add(radioP);

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		example a = new example();
		a.dispCheck();
		a.dispImageIcon();
		a.dispRadio();
	}

}
