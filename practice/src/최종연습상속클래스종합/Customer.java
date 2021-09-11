package 최종연습상속클래스종합;

public class Customer extends person{

	private String Mile;
	private String Cus_no;
	
	public Customer(String name, String add, String tele) {
		super(name, add, tele);
		Mile = "100";
		Cus_no = "16039015";
	
		// TODO Auto-generated constructor stub
		
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		super.print();
		System.out.println("마일리지 : "+getMile());
		System.out.println("고객번호 : "+getCus_no());
	}

	public String getMile() {
		return Mile;
	}

	public void setMile(String mile) {
		Mile = mile;
	}

	public String getCus_no() {
		return Cus_no;
	}

	public void setCus_no(String cus_no) {
		Cus_no = cus_no;
	}
	

}
