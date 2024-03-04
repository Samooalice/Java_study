package day14;

public class Semo implements Figure {
	private int width, height;
	private double area;
	
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getheight() {
		return height;
	}

	public void setheight(int height) {
		this.height = height;
	}


	@Override
	public void setArea() {
		this.area = width * height;
	}

	@Override
	public double getArea() {
		return area;
	}
	@Override
	public String toString() {
		return "Semo : \n\t밑변 : " + width + ", 높이 : " + height + ", 넓이 : " + area;
	}
	
	public Semo(int width, int height) {
		// TODO Auto-generated constructor stub
		setWidth(width);
		setheight(height);
		setArea();
	}
}
