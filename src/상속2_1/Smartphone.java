package ���2_1;

public class Smartphone extends phone {
	
	private String os_type;
	private String os_ver;
	private String memory;
	private boolean bluetooth;
	private boolean camera;

	public Smartphone(String make, String price, String comm_type) {
		super(make, price, comm_type);
		// TODO Auto-generated constructor stub
		os_type = "�ȵ���̵�";
		os_ver = "9.15";
		memory = "64GB";
		bluetooth = true;
		camera = true;
	}

	@Override
	void print() {
		// TODO Auto-generated method stub
		super.print();
		System.out.println("�ü�� Ÿ�� : "+os_type);
		System.out.println("�ü�� ���� : "+os_ver);
		System.out.println("�޸� : "+memory);
		System.out.println("������� ���� : "+(bluetooth == true ? "����" : "�Ұ���"));
		System.out.println("ī�޶� ���� : "+(camera == true ? "����" : "�Ұ���"));
		System.out.println("");
	}

	@Override
	void Call_in() {
		// TODO Auto-generated method stub
		System.out.println("����Ʈ�� ��ȭ �ɱ�");
	}

	@Override
	void Call_out() {
		// TODO Auto-generated method stub
		System.out.println("����Ʈ�� ��ȭ �ޱ�");
	}
	

}
