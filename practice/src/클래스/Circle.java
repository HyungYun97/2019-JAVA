package Å¬·¡½º;

public class Circle {
	private double r;
	private int cx;
	private int cy;
	private double c_area;
	
	void area() {
		r = 3.141592;
		cx = 5;
		cy = 5;
		c_area = r*cx*cy;
		System.out.println(""+c_area);
	}

	public double getR() {
		return r;
	}

	public void setR(double r) {
		this.r = r;
	}

	public int getCx() {
		return cx;
	}

	public void setCx(int cx) {
		this.cx = cx;
	}

	public int getCy() {
		return cy;
	}

	public void setCy(int cy) {
		this.cy = cy;
	}

	public double getC_area() {
		return c_area;
	}

	public void setC_area(int c_area) {
		this.c_area = c_area;
	}
}
