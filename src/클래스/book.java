package Ŭ����;

public class book {
	
	private String title;
	private String author;
	
	void book1() {
		title = "�±��̴� ������";
		author = "���±�";
		System.out.println("���� : "+title);
		System.out.println("���� : "+author);
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
