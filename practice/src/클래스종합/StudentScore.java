package Ŭ��������;

import java.util.Scanner;

public class StudentScore {
	private int Students = 5;
	int score[] = new int [Students];
	private double totalScore;
	private double calcAverage; // ����� �Ҽ������� ���ü��� �ִ� ! 
	private Scanner a;
	
	void getScore() {
		a = new Scanner(System.in); //���� �ʵ带 �������� �ʿ� ���� �޼ҵ尪���� �Է¹����� ���
		
		for(int i = 0; i < Students; i++) { // i�� Students�� ����� ������ Ŭ������
			System.out.print("������ �Է��ϼ��� : ");
			score[i] = a.nextInt(); //nextInt�� ������ �Է� �� score[i]�� �� ����
		};
	}
	void totalScore() {
		for(int i = 0; i < Students; i++) {
			totalScore += score[i]; //totalScore�� score[i]������ students ��ŭ ��µǾ ����
		};
	}
	void calcAverage() {
		calcAverage = (double)totalScore / Students;
	}
	void printResult() {
		System.out.println("�ο��� : "+Students);
		System.out.println("���� : "+totalScore);
		System.out.println("��� : "+calcAverage);
	}
}

