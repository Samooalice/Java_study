package day14;

public class Nemo implements Figure {
	private int width, height;
	private double area;
	
	public Nemo(int width, int height) {
		// TODO Auto-generated constructor stub
		setWidth(width);
		setHeight(height);
		
	}

	@Override
	public void setArea() {
		area = width * height;
	}
	
	public void setArea(double area) {
		this.area = area;
	}
	
	@Override
	public double getArea() {
		return area;
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
	public String toString() {
		return "Nemo : \n\t밑변 : " + width + ", 높이 : " + height + ", 넓이 : " + area;
	}

}
