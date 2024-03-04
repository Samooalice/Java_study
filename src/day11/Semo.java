package day11;

public class Semo extends Figure{
	public Semo() { }
	
	public int width, height;
	
	public void setArea() {
		area = width * height * 0.5;	//area : 상위 클래스 변수
	}
	
	public Semo(int width, int height) {
		this.width = width;
		this.height = height;
		setArea();
	}
	
	@Override
	public String toString() {
		String result = "밑변이 " + width + "이고, 높이가 "+ height +"인 삼각형의 면적 : "+ area;
		return result;
	}
}
