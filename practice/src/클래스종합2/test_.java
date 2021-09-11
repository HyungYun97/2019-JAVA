package 클래스종합2;

public class test_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SalaryMan a = new SalaryMan();
		a.getAnnualGross();
		System.out.println(a.getAnnualGross()); //return 값 반환
		
		SalaryMan b = new SalaryMan(50000);
		b.getAnnualGross();
		System.out.println(b.getAnnualGross()); //return 값 반환 
		
	}
}