package �������̽�1;

public class Circle extends Shape implements Moveable, Drawable{
	
	public String radius;
	
	public Circle() {
		radius = "10";
	}
	

	@Override
	public void move(int dx, int dy) {
		// TODO Auto-generated method stub
		System.out.println("�̵��ϱ� �� ���� ������ : ("+x+","+y+")");
		x += dx;
		y += dy;
		System.out.println("�̵��� �� ���� ������ : ("+x+","+y+")");
		
	}
	
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("���׸���");
	}
	public void print() {
		System.out.println("���� ������ : "+radius+"cm");
	}
	
}
