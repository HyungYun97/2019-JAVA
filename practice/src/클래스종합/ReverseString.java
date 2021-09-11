package 클래스종합;

public class ReverseString {
	private String a;
	private int cnt;
	
	public ReverseString(String a) {
	this.a = a;
	cnt = a.length();
}
	void PrintReverse() {
		System.out.println("Original : "+a);
		
		System.out.print("Reverse : ");
		for(int i = cnt-1; i >=0; i--) {
			System.out.print(a.charAt(i));
		}
	}
}
