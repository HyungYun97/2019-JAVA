package ��ӿ�������;
//1.	Person Ŭ������ �̸�, �ּ�, ��ȭ��ȣ�� �ʵ�� ������. 
//�ϳ� �̻��� �����ڸ� �����ϰ� �� �ʵ忡 ���� �����ڿ� ������ �޼ҵ带 �ۼ��϶�. 
//�̾� Person�� ��ӹ޾Ƽ� Customer Ŭ������ �ۼ��غ���. Customer�� ����ȣ�� ���ϸ����� �ʵ�� ������ �ִ�. 
//�� �� �̻��� �����ڸ� �ۼ��ϰ� ������ ������ �޼ҵ�� ������ �޼ҵ带 �ۼ��Ѵ�. 
//�̵� Ŭ�������� ��ü�� ����� �� ��ü�� ��� ������ ����ϴ� �׽�Ʈ Ŭ������ �ۼ��϶�.

public class person{ 
	public String name;
	public String address;
	public String telephone;
	
	public person(String name, String address, String telephone) {
		this.name = name;
		this.address = address;
		this.telephone = telephone;
	}
	void print() {
		System.out.println("�̸� : "+name);
		System.out.println("�ּ� : "+address);
		System.out.println("��ȭ��ȣ : "+telephone);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

}
