package day13;

public class Semo extends Figure {
	private int width, height;
	private double area;
	
	public Semo() {
		// TODO Auto-generated constructor stub
	}
	
	public Semo(int width, int height) {
//		this.width = width;
//		this.height = height;
		setWidth(width);
		setHeight(height);
		setArea();
	}
	
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	

	@Override
	public void setArea() {
		area = width * height * 0.5;
	}

	@Override
	public double getArea() {
		return area;
	}
	
	@Override
	public String toString() {
		return "*** 세모 *** \n\t밑변 : " + width +", 높이 :" + height +", 면적 : " + area;
	}
}
