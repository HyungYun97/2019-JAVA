package 클래스종합2;

public class Employee {
	private String name;
	private String age;
	private String add;
	private String part;
	protected String info;

	
	public Employee(String name, String age, String add, String part) {
		this.name = name;
		this.age = age;
		this.add = add;
		this.part = part;
	}
	void printinfo() {
		System.out.println("이름 : "+name);
		System.out.println("나이 : "+age);
		System.out.println("주소 : "+add);
		System.out.println("부서 : "+part);
		
	}
}
