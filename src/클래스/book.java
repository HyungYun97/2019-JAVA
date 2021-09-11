package 클래스;

public class book {
	
	private String title;
	private String author;
	
	void book1() {
		title = "승권이는 똥쟁이";
		author = "강승권";
		System.out.println("제목 : "+title);
		System.out.println("저자 : "+author);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
}
