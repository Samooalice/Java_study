package day19;

public class Semo {
	private int width, hight;
	private double area;
	
	
	public Semo() {
		// TODO Auto-generated constructor stub
	}
	
	public Semo(int width, int hight) {
		setWidth(width);
		setHight(hight);
		
		setArea();
	}
	
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHight() {
		return hight;
	}

	public void setHight(int hight) {
		this.hight = hight;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}
	public void setArea() {
		area = width * hight * 0.5f;
	}
	
	@Override
	public String toString() {
		return 	  "\t밑변 : " + width
				+ "\n\t높이 : " + hight
				+ "\n\t넓이 : " + Math.round(area * 10) / 10f;
	}
}
