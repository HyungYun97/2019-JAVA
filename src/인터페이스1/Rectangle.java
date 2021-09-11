package 인터페이스1;

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
		System.out.println("이동하기 전 사각형의 중심의 좌표 : ("+x+","+y+")");
		x += dx;
		y += dy;
		System.out.println("이동 한 후 사각형의 중심의 좌표 : ("+x+","+y+")");
	}
	
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("사각형그리기");
	}
	public void print() {
		System.out.println("사각형의 넓이 : "+width);
		System.out.println("사각형의 속성 : "+form);
	}
}
