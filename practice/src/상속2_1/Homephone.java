package ���2_1;

public class Homephone extends phone{
	
	private boolean WirelessFlag;
	private boolean LCDFlag;
	
	public Homephone(String make, String price, String comm_type) {
		super(make, price, comm_type);
		WirelessFlag = true;
		LCDFlag = true;
		// TODO Auto-generated constructor stub
	}

	@Override
	void print() {
		// TODO Auto-generated method stub
		super.print();
		System.out.println("��/���� : "+(WirelessFlag == true ? "����" : "����"));
		System.out.println("LCD ����ǥ�� ���� : "+(LCDFlag == true ? "��" : "��"));
	}

	@Override
	void Call_in() {
		// TODO Auto-generated method stub
		System.out.println("HomePhone ��ȭ �ɱ�");
	}

	@Override
	void Call_out() {
		// TODO Auto-generated method stub
		System.out.println("HomePhone ��ȭ �ޱ�");
	}
	

}
