package 클래스종합;


public class test {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub	

		
		StudentScore b = new StudentScore();
		b.getScore();
		b.totalScore();
		b.calcAverage();
		b.printResult();
		
		SalaryMan c = new SalaryMan();
		c.getAnnualGross();
		
		SalaryMan d = new SalaryMan(50000);
		d.getAnnualGross();

	}

}
