package 최종연습상속클래스종합;

public class person {
	private String name;
	private String add;
	private String tele;
	
	public person(String name, String add, String tele) {
		this.name = name;
		this.add = add;
		this.tele = tele;
	}
	
	public void print() {
		System.out.println("이름 : "+name);
		System.out.println("주소 : "+add);
		System.out.println("전화번호 : "+tele);
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdd() {
		return add;
	}

	public void setAdd(String add) {
		this.add = add;
	}

	public String getTele() {
		return tele;
	}

	public void setTele(String tele) {
		this.tele = tele;
	}
	
	
}
