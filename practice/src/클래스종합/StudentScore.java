package 클래스종합;

import java.util.Scanner;

public class StudentScore {
	private int Students = 5;
	int score[] = new int [Students];
	private double totalScore;
	private double calcAverage; // 평균은 소수점으로 나올수도 있다 ! 
	private Scanner a;
	
	void getScore() {
		a = new Scanner(System.in); //따로 필드를 설정해줄 필요 없이 메소드값으로 입력받은값 출력
		
		for(int i = 0; i < Students; i++) { // i가 Students에 저장된 값보다 클때까지
			System.out.print("점수를 입력하세요 : ");
			score[i] = a.nextInt(); //nextInt로 정수열 입력 후 score[i]에 값 저장
		};
	}
	void totalScore() {
		for(int i = 0; i < Students; i++) {
			totalScore += score[i]; //totalScore에 score[i]값들이 students 만큼 출력되어서 저장
		};
	}
	void calcAverage() {
		calcAverage = (double)totalScore / Students;
	}
	void printResult() {
		System.out.println("인원수 : "+Students);
		System.out.println("총점 : "+totalScore);
		System.out.println("평균 : "+calcAverage);
	}
}

