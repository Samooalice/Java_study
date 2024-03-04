package day13;

public class Nemo extends Figure {
	private int width, height;
	private double area;

	public Nemo() {
		// TODO Auto-generated constructor stub
	}
	
	public Nemo(int width, int height) {
		// TODO Auto-generated constructor stub
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
		area = width * height;
	}

	@Override
	public double getArea() {
		return area;
	}
	
	@Override
	public String toString() {
		return "### 네모 ###\n\t가로 : " + width +", 세로 :" + height +", 면적 : " + area;
	}
}
