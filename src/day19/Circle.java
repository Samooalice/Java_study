package day19;

public class Circle implements Comparable{
	private int rad;
	private double area, arround;
	
	public Circle() {
		// TODO Auto-generated constructor stub
	}
	
	public Circle(int rad) {
		// TODO Auto-generated constructor stub
		setRad(rad);
		setArea();
		setArround();
	}
	
	public int getRad() {
		return rad;
	}

	public void setRad(int rad) {
		this.rad = rad;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}
	public void setArea() {
		area = rad * rad * 3.14;
	}
	
	public double getArround() {
		return arround;
	}

	public void setArround(double arround) {
		this.arround = arround;
	}
	
	public void setArround() {
		arround = 2 * rad * 3.14;
	}
	
	@Override
	public String toString() {
		return "반지름 : " + rad
					+"\n\t 둘레 : " + arround
					+"\n\t 넓이 : " + area;
	}
	
	@Override
	public boolean equals(Object o) {
		Circle prepared_circle = (Circle) o;
		
		return (this.rad == prepared_circle.getRad());
	}

	@Override
	public int compareTo(Object o) {
		Circle prepared_circle = (Circle) o;
		return rad - prepared_circle.getRad();
	}
}
