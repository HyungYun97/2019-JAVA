package ���2;

public class homephone extends phone
//�Ϲ���ȭ��(HomePhone) �� ��/���� ����, LCD ����ǥ�� ���� ���� �ʵ尡 �ִ�
{

	private String line = "have";
	private String lcd = "lce";
	
	public homephone(String made, String price, String comm_type) {
		super(made, price, comm_type);
	}
	
	public String getLine() {
		return line;
	}
	public void setLine(String line) {
		this.line = line;
	}
	public String getLcd() {
		return lcd;
	}
	public void setLcd(String lcd) {
		this.lcd = lcd;
	}
	@Override
	void print() {
		// TODO Auto-generated method stub
		super.print();
		System.out.println("���� ���� : "+line);
		System.out.println("lcd���� : "+lcd);
	}
	@Override
	void call_in() {
		// TODO Auto-generated method stub
	System.out.println("HOMEPHONE CALL IN");
	}
	@Override
	void call_out() {
		// TODO Auto-generated method stub
		System.out.println("HOMEPHONE CALL OUT");
	}

	
}
