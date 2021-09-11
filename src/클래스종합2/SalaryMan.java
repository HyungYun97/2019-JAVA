package 클래스종합2;

public class SalaryMan {
	private int Salary; //월급여액 저장 int 형으로 초기값 만 저장
	private int getAnnualGross;
	
	public SalaryMan() { // 기본 생성자에서 필드 salary의 초기값 사용
		Salary=10000;
	}
	public SalaryMan(int Salary) {
		this.Salary = Salary; // 정수형 인자인 생성자
	}
	int getAnnualGross() { //연봉을 반환하는 메소드 월급보너스 + 연봉 리턴
		
		getAnnualGross = (Salary*12) + (Salary*5);
		return getAnnualGross; //private int 노란불 없애기위함 
	}
}