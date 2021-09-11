package 상속연습문제;
//1.	Person 클래스는 이름, 주소, 전화번호를 필드로 가진다. 
//하나 이상의 생성자를 정의하고 각 필드에 대해 접근자와 생성자 메소드를 작성하라. 
//이어 Person을 상속받아서 Customer 클래스를 작성해보자. Customer는 고객번호와 마일리지를 필드로 가지고 있다. 
//한 개 이상의 생성자를 작성하고 적절한 접근자 메소드와 설정자 메소드를 작성한다. 
//이들 클래스들의 객체를 만들고 각 객체의 모든 정보를 출력하는 테스트 클래스를 작성하라.

public class person{ 
	public String name;
	public String address;
	public String telephone;
	
	public person(String name, String address, String telephone) {
		this.name = name;
		this.address = address;
		this.telephone = telephone;
	}
	void print() {
		System.out.println("이름 : "+name);
		System.out.println("주소 : "+address);
		System.out.println("전화번호 : "+telephone);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

}
