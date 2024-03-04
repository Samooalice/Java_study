package day14;

public interface Figure {
	String original = "Figure";		// 변수는 자동적으로 public static final변수
	void setArea();					// 자동적으로 public abstract 생략된 추상함수
	double getArea();				// 자동적으로 public abstract 생략된 추상함수
}
