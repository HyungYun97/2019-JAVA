package �������̽�1;

public class Rectangle extends Shape implements Moveable, Drawable{
	private String width;
	private String form;
	
	public Rectangle() {
		width = "100";
		form = "50";
	}
	@Override
	public void move(int dx, int dy) {
		// TODO Auto-generated method stub
		System.out.println("�̵��ϱ� �� �簢���� �߽��� ��ǥ : ("+x+","+y+")");
		x += dx;
		y += dy;
		System.out.println("�̵� �� �� �簢���� �߽��� ��ǥ : ("+x+","+y+")");
	}
	
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("�簢���׸���");
	}
	public void print() {
		System.out.println("�簢���� ���� : "+width);
		System.out.println("�簢���� �Ӽ� : "+form);
	}
}
