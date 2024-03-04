package day13;

public abstract class Moyang {
	public abstract void setArea();
	public abstract double getArea();
	
	public static Moyang getInstance() {
		Moyang moyang = new M1();
		return moyang;	// 반환값은 Moyang 타입으로 자동형변환
	}
}
class M1 extends Moyang{
	
	@Override
	public void setArea() {
	}

	@Override
	public double getArea() {
		return 0;
	}
	
}
