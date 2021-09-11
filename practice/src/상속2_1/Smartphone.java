package 상속2_1;

public class Smartphone extends phone {
	
	private String os_type;
	private String os_ver;
	private String memory;
	private boolean bluetooth;
	private boolean camera;

	public Smartphone(String make, String price, String comm_type) {
		super(make, price, comm_type);
		// TODO Auto-generated constructor stub
		os_type = "안드로이드";
		os_ver = "9.15";
		memory = "64GB";
		bluetooth = true;
		camera = true;
	}

	@Override
	void print() {
		// TODO Auto-generated method stub
		super.print();
		System.out.println("운영체제 타입 : "+os_type);
		System.out.println("운영체제 버전 : "+os_ver);
		System.out.println("메모리 : "+memory);
		System.out.println("블루투스 지원 : "+(bluetooth == true ? "가능" : "불가능"));
		System.out.println("카메라 지원 : "+(camera == true ? "가능" : "불가능"));
		System.out.println("");
	}

	@Override
	void Call_in() {
		// TODO Auto-generated method stub
		System.out.println("스마트폰 전화 걸기");
	}

	@Override
	void Call_out() {
		// TODO Auto-generated method stub
		System.out.println("스마트폰 전화 받기");
	}
	

}
