package 상속2;

public class smartphone extends phone 
//운영체제타입, 운영체제 버전, 내부 메모리크기, 카메라 장착여부, 블루투스 지원 여부 등의 필드가 있고 
{
	public smartphone(String made, String price, String comm_type) {
		super(made, price, comm_type);
	}
	private String OS_type = "SUPER";
	private String OS_version = "3.12";
	private String memory = "64G";
	private boolean Camera = true;
	private boolean Bluetooth = true;
	
	
	public String getOS_type() {
		return OS_type;
	}
	public void setOS_type(String oS_type) {
		OS_type = oS_type;
	}
	public String getOS_version() {
		return OS_version;
	}
	public void setOS_version(String oS_version) {
		OS_version = oS_version;
	}
	public String getMemory() {
		return memory;
	}
	public void setMemory(String memory) {
		this.memory = memory;
	}

	public boolean isCamera() {
		return Camera;
	}
	public void setCamera(boolean camera) {
		Camera = camera;
	}
	public boolean isBluetooth() {
		return Bluetooth;
	}
	public void setBluetooth(boolean bluetooth) {
		Bluetooth = bluetooth;
	}
	@Override
	void print() {
		// TODO Auto-generated method stub
		super.print();
		System.out.println("운영체제 타입 : "+OS_type);
		System.out.println("운영체제 버전 : "+OS_version);
		System.out.println("메모리 : "+memory);
		System.out.println("카메라 : "+(Camera == true ? "있음" : "없음"));
		System.out.println("블루투스 : "+(Bluetooth == true ? "있음" : "없음"));
	
	}
	@Override
	void call_in() {
		// TODO Auto-generated method stub
		System.out.println("SMARTPHONE CALL IN");
	}
	@Override
	void call_out() {
		// TODO Auto-generated method stub
		System.out.println("SMARTPHONE CALL OUT");	
		}
	
}
