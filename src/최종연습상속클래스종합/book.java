package 최종연습상속클래스종합;

public class book {
	private String name;
	private String page;
	private String author;
	
	public book(String name, String page, String author) { //인자가 없을시 String name, 등 없음
		this.name = name;
		this.page = page;
		this.author = author;
	}
	public void print() {
		System.out.println("책 제목 : "+name);
		System.out.println("페이지 수 : "+page);
		System.out.println("저자 : "+author);
	}

}
