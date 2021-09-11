package 클래스종합2;

public class ReverseString {
	private String a;
	private int cnt;
	
	public ReverseString(String a) {
		
	this.a = a;
	
	}
	void PrintReverse() {
		
		System.out.println("Original : "+a);
		cnt = a.length();
		System.out.print("Reverse : ");
		for(int i = cnt-1; i >= 0; i--) {
			System.out.print(a.charAt(i));
		}
	}
	
}
