package Ŭ��������2;

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
		System.out.println("�̸� : "+name);
		System.out.println("���� : "+age);
		System.out.println("�ּ� : "+add);
		System.out.println("�μ� : "+part);
		
	}
}
