package 상속연습문제;

public class Customer extends person{
	
	
	public Customer(String name, String address, String telephone) {
		super(telephone, address, name);

	}
	public int Mileage = 5200;
	public int CustomerNumber = 1234;
	
	public int getMileage() {
		return Mileage;
	}
	public void setMileage(int mileage) {
		Mileage = mileage;
	}
	public int getCustomerNumber() {
		return CustomerNumber;
	}
	public void setCustomerNumber(int customerNumber) {
		CustomerNumber = customerNumber;
	}
	//void print1()
	//	System.out.println(""+getName()+"   "+getAddress()+"   "+getTelephone()+"   "
	//			+getMileage()+"   "+getCustomerNumber()+".");
	@Override
	void print() {
		// TODO Auto-generated method stub
		super.print();
		System.out.println("마일리지 : "+Mileage);
		System.out.println("고객번호 : "+CustomerNumber);
	}
		

		// TODO Auto-generated constructor stub

	
	
	
}
