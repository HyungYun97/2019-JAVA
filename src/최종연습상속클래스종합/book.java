package �����������Ŭ��������;

public class book {
	private String name;
	private String page;
	private String author;
	
	public book(String name, String page, String author) { //���ڰ� ������ String name, �� ����
		this.name = name;
		this.page = page;
		this.author = author;
	}
	public void print() {
		System.out.println("å ���� : "+name);
		System.out.println("������ �� : "+page);
		System.out.println("���� : "+author);
	}

}
