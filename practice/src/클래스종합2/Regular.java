package 클래스종합2;

public class Regular extends Employee{

	public Regular(String name, String age, String add, String part) {
		super(name, age, add, part);
		// TODO Auto-generated constructor stub
	}
	
	void SetSalary(String info) {
		this.info = info;
	}

	@Override
	void printinfo() {
		// TODO Auto-generated method stub
		super.printinfo();
		System.out.println("정규직 : "+info);
		
	}

}
