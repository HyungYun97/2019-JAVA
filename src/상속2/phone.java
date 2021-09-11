package 상속2;

public class phone 
//제조사, 가격, 통신타입
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
		System.out.println("PHONE의 가격: "+price);
		System.out.println("PHONE의 제조사: "+made);
		System.out.println("PHONE의 통신타입: "+comm_type);

	}
	void call_in() {
		System.out.println("전화걸기기능");
	}
	void call_out() {
		System.out.println("전화받기");
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
