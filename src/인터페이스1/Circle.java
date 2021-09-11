package 인터페이스1;

public class Circle extends Shape implements Moveable, Drawable{
	
	public String radius;
	
	public Circle() {
		radius = "10";
	}
	

	@Override
	public void move(int dx, int dy) {
		// TODO Auto-generated method stub
		System.out.println("이동하기 전 원의 기준점 : ("+x+","+y+")");
		x += dx;
		y += dy;
		System.out.println("이동한 후 원의 기준점 : ("+x+","+y+")");
		
	}
	
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("원그리기");
	}
	public void print() {
		System.out.println("원의 반지름 : "+radius+"cm");
	}
	
}
