package 복습;
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
		setTitle("연습용");
		setVisible(true);
		
		JPanel panel = new JPanel();
		JLabel label = new JLabel("나는 레이블입니다");
		JButton but = new JButton("버튼을 클릭하세요");
	
		panel.add(label);
		panel.add(but);
		add(panel);
		this.add(panel,BorderLayout.PAGE_END); //이걸 써주면 모두 출력
		
	}
	void grid() {
		setSize(700,700);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //윈도우가 종료되게 만드는 명령어
		setTitle("연습용 그리드");
		setVisible(true);
		
		JPanel ab = new JPanel();
		ab.setLayout(new GridLayout(3,0));
		JButton but = new JButton("그리드 연습");
		ab.add(but);
		JButton but1 = new JButton("그리드 연습 1");
		ab.add(but1);
		JButton but2 = new JButton("그리드 연습 2");
		ab.add(but2);
		add(ab);
		
	}
	
	public static void main(String[] args) {

		// TODO Auto-generated method stub

		Grid a = new Grid();
		a.grid();
	}
}
