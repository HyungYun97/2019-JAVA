package 최종연습상속클래스종합;

public class magazine extends book{
	private String announce;
	
	public magazine(String name, String page, String author) {
		super(name, page, author);
		announce = "2016.01.02";
		// TODO Auto-generated constructor stub
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		super.print();
		System.out.println("발매일 : "+announce);
	}
	
	
	
	
	
}
