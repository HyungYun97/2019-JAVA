package ���2_1;

public class phone {
	private String make;
	private String price;
	private String comm_type;
	
	public phone(String make, String price, String comm_type) {
		this.make = make;
		this.price = price;
		this.comm_type = comm_type;
	}
	
	void print() {
		System.out.println("������ : "+ make);
		System.out.println("���� : "+ price);
		System.out.println("��� Ÿ�� : "+ comm_type);
		
	}
	void Call_in() {
	
	}
	void Call_out(){
		
	}
}