package 인터페이스1;

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
		System.out.println("이동하기 전 삼각형의 원점 : ("+x+","+y+")");
		x += dx;
		y += dy;
		System.out.println("이동 한 후 삼각형의 원점 : ("+x+","+y+")");
	}
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("삼각형 그리기");
	}
	public void print() {
		System.out.println("삼각형의 밑변 : "+base);
		System.out.println("삼각형의 속성 : "+form);
	}
}
