package 상속2_1;

public class test_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Smartphone a = new Smartphone("삼성", "600,000", "5G");
		a.print();
		a.Call_in();
		a.Call_out();
		Homephone b = new Homephone("애플", "700,000", "4G");
		b.print();
		b.Call_in();
		b.Call_out();
	}

}
