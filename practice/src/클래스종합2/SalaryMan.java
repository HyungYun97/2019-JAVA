package Ŭ��������2;

public class SalaryMan {
	private int Salary; //���޿��� ���� int ������ �ʱⰪ �� ����
	private int getAnnualGross;
	
	public SalaryMan() { // �⺻ �����ڿ��� �ʵ� salary�� �ʱⰪ ���
		Salary=10000;
	}
	public SalaryMan(int Salary) {
		this.Salary = Salary; // ������ ������ ������
	}
	int getAnnualGross() { //������ ��ȯ�ϴ� �޼ҵ� ���޺��ʽ� + ���� ����
		
		getAnnualGross = (Salary*12) + (Salary*5);
		return getAnnualGross; //private int ����� ���ֱ����� 
	}
}