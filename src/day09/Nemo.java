package day09;

public class Nemo {
	int row;
	int length;
	int arround;
	int area;
	
	public Nemo(int row, int length) {
		this.row = row;
		this.length = length;
		
		setArround();
		setArea();
	}
	
	public void setArround() {
		arround = 2 * (row + length);
	}
	
	public void setArea() {
		area = row * length;
	}
}
