package day20;

public class Nemo implements Comparable{
	private int width, hight, area;
	
	public Nemo() {
		// TODO Auto-generated constructor stub
	}
	public Nemo(int width, int hight) {
		// TODO Auto-generated constructor stub
		this.width = width;
		this.hight = hight;
		
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
	
	public int getArea() {
		return area;
	}
	public void setArea(int area) {
		this.area = area;
	}
	public void setArea() {
		this.area = width * hight;
	}
	
	@Override
	public int compareTo(Object o) {
		Nemo comparedNemo = (Nemo) o;
		return 0;
	}
	@Override
	public String toString() {
		return "가로 : " + width
				+"\n\t세로 : " + hight
				+"\n넓이 : " + area;
	}
}
