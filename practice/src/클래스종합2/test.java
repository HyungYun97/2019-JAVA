package 클래스종합2;

import java.util.Scanner;


public class test {

	private static Scanner sc;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sc = new Scanner(System.in);
		String str;
		System.out.print("값을 입력하세요 : ");
		str = sc.nextLine();
	
		
		ReverseString b = new ReverseString(str);
		b.PrintReverse();
		
		
	}
}
