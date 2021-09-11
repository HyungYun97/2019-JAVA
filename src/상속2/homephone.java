package 상속2;

public class homephone extends phone
//일반전화기(HomePhone) 는 유/무선 형식, LCD 액정표시 유무 등의 필드가 있다
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
		System.out.println("선의 유무 : "+line);
		System.out.println("lcd유무 : "+lcd);
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
