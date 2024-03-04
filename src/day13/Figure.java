package day13;
/*
 * 클래스를 상속받아서 만들어지는 하위 클래스는
 * 클래스 내에서 함수의 내용을 정의하지 않고
 * 클래스를 상속 받아서 만들어지지는 내용들에서
 * 함수의 내용을 정의해서 써야한다.
 */

public abstract class Figure {
	public abstract void setArea();
	public abstract double getArea();
	
	@Override
	public String toString() {
		return "이 클래스는 Figure 클래스!";
	}
}
