package day13;

public abstract class Miwansong extends Figure {
	/*
	 * Figure 클래스가 가지고 있는 추상함수 중
	 * setArea()를 재정의 하지 않았으므로,
	 * 추상함수를 1개 가지고 있는 클래스 임.
	 * 
	 * 추상 함수가 1개 이상이 존재하면,
	 * 반드시 추상클래스로 생성해야 한다.
	 * 
	 * 추상클래스는 미완성 기능이 있기 때문에
	 * new 시켜서 객체를 만들 수 없다.
	 */
	
	private int width, height;
	private double area;
	
	public Miwansong() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getArea() {
		return area;
	}

}
