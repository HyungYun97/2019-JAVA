package ����;
import javax.swing.JFrame;

import javax.swing.JPanel;

import calculator.calculator;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;


public class Grid extends JFrame{
	
	public Grid() {
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("������");
		setVisible(true);
		
		JPanel panel = new JPanel();
		JLabel label = new JLabel("���� ���̺��Դϴ�");
		JButton but = new JButton("��ư�� Ŭ���ϼ���");
	
		panel.add(label);
		panel.add(but);
		add(panel);
		this.add(panel,BorderLayout.PAGE_END); //�̰� ���ָ� ��� ���
		
	}
	void grid() {
		setSize(700,700);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //�����찡 ����ǰ� ����� ��ɾ�
		setTitle("������ �׸���");
		setVisible(true);
		
		JPanel ab = new JPanel();
		ab.setLayout(new GridLayout(3,0));
		JButton but = new JButton("�׸��� ����");
		ab.add(but);
		JButton but1 = new JButton("�׸��� ���� 1");
		ab.add(but1);
		JButton but2 = new JButton("�׸��� ���� 2");
		ab.add(but2);
		add(ab);
		
	}
	
	public static void main(String[] args) {

		// TODO Auto-generated method stub

		Grid a = new Grid();
		a.grid();
	}
}
