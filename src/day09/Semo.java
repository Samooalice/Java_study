package day09;

public class Semo {
	
	
	int width;
	int hight;
	double area;
	
	public Semo() { }
	
	public Semo(int width, int hight) {
		this.width = width;
		this.hight = hight;
		
		setArea();
	}
	
	public void setArea() {
		this.area = (double)width * hight / 2;
	}
}
