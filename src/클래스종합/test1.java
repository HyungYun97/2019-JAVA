package 클래스종합;

import java.util.Scanner;

public class test1 {

	private static Scanner sc;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		sc = new Scanner(System.in);
		String str;
		str = sc.nextLine();
		
		ReverseString abc = new ReverseString(str);
		abc.PrintReverse();
		
	}

}
