package ���2;

public class phone 
//������, ����, ���Ÿ��
{
	private String made;
	private String price;
	private String comm_type;
	
	public phone(String made, String price, String comm_type) {
	this.made = made;
	this.comm_type = comm_type;
	this.price = price;
	}
	void print() {
		System.out.println("PHONE�� ����: "+price);
		System.out.println("PHONE�� ������: "+made);
		System.out.println("PHONE�� ���Ÿ��: "+comm_type);

	}
	void call_in() {
		System.out.println("��ȭ�ɱ���");
	}
	void call_out() {
		System.out.println("��ȭ�ޱ�");
	}

	public String getMade() {
		return made;
	}

	public void setMade(String made) {
		this.made = made;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getComm_type() {
		return comm_type;
	}

	public void setComm_type(String comm_type) {
		this.comm_type = comm_type;
	}
	
}
