package 상속2_1;

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
		System.out.println("유/무선 : "+(WirelessFlag == true ? "유선" : "무선"));
		System.out.println("LCD 액정표시 유무 : "+(LCDFlag == true ? "유" : "무"));
	}

	@Override
	void Call_in() {
		// TODO Auto-generated method stub
		System.out.println("HomePhone 전화 걸기");
	}

	@Override
	void Call_out() {
		// TODO Auto-generated method stub
		System.out.println("HomePhone 전화 받기");
	}
	

}
