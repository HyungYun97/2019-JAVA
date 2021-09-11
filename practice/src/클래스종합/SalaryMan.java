package 클래스종합;

public class SalaryMan {
	private int Salary;
	private int getAnnualGross;
	
	public SalaryMan(int Salary) {
		this.Salary = Salary;
	}
	
	public SalaryMan() {
		Salary = 10000;
	}
	
	public int getAnnualGross() {
		getAnnualGross = (Salary *5) + Salary;
		System.out.println("연봉 : "+getAnnualGross);
		return Salary;
	}
}