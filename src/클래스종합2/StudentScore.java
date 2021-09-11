package 클래스종합2;

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
			System.out.print("성적을 입력하세요 : ");
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
		System.out.println("인원수 : "+Students);
		System.out.println("총점 : "+totalScore);
		System.out.println("평균 : "+averageScore);
	}
}