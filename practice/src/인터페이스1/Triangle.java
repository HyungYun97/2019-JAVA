package �������̽�1;

public class Triangle extends Shape implements Moveable,Drawable {

	private String base;
	private String form;
	
	public Triangle() {
		base = "50";
		form = "200";
	}

	@Override
	public void move(int dx, int dy) {
		// TODO Auto-generated method stub
		System.out.println("�̵��ϱ� �� �ﰢ���� ���� : ("+x+","+y+")");
		x += dx;
		y += dy;
		System.out.println("�̵� �� �� �ﰢ���� ���� : ("+x+","+y+")");
	}
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("�ﰢ�� �׸���");
	}
	public void print() {
		System.out.println("�ﰢ���� �غ� : "+base);
		System.out.println("�ﰢ���� �Ӽ� : "+form);
	}
}
