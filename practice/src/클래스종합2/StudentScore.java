package Ŭ��������2;

import java.util.Scanner;

public class StudentScore {
	private int Students = 5;
	int score[] = new int[Students];
	private int totalScore;
	private double averageScore;
	private Scanner s;
	
	void getScore() {
		s = new Scanner(System.in);
		
		for(int i = 0; i < Students; i++) {
			System.out.print("������ �Է��ϼ��� : ");
			score[i] = s.nextInt();
		};
	}
	void totalScore() {
		for(int i = 0; i < Students; i++) {
			totalScore += score[i];
		};
	}
	void calcAverage() {
		averageScore = totalScore / Students;
	}
	void printResult() {
		System.out.println("�ο��� : "+Students);
		System.out.println("���� : "+totalScore);
		System.out.println("��� : "+averageScore);
	}
}