package �����������Ŭ��������;

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
		System.out.println("�̸� : "+name);
		System.out.println("�ּ� : "+add);
		System.out.println("��ȭ��ȣ : "+tele);
		
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
