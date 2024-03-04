package day11;

public class Nemo extends Figure {

	public int width, height;
	
	public Nemo(int width, int height) {
		this.width = width;
		this.height = height;
		
		setArea();
	}
	
	
	public void setArea() {
		area = width * height;
	}
	
	@Override
	public String toString() {
		String result = "가로 : "+ width +"/ 세로 : " + height +"/ 넓이 : " + area;
		
		return result;
	}

}
