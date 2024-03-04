package day16;

import java.util.Arrays;

/*	Object 클래스
 * 		자바에서 최상위 클래스
 * 		
 * 		소속함수
 * 			equals() 	: 주소를 비교하는 함수
 * 			toString()	: 주소를 문자열로 반환하는 함수
 */
public class Test04_Object {

	public Test04_Object() {
		// TODO Auto-generated constructor stub
		int[] arr = new int[5];
		System.out.println(arr);
		System.out.println(Arrays.toString(arr));
		
		Object object = new Object();
		System.out.println(object);
		
		Cba cba = new Cba();
		System.out.println(cba);
		
		Box box1 = new Box(2, 5);
		Box box2 = new Box(1, 10);
		Box box3 = new Box(2, 10);
		
		System.out.println("box1과 box2는" + ((box1.equals(box2)) ? " 같다" : " 다르다"));
		System.out.println("box1과 box3는" + ((box1.equals(box3)) ? " 같다" : " 다르다"));
	}

	public static void main(String[] args) {
		new Test04_Object();
	}

}

class Cba{
	
}

class Box{
	int num1;
	int num2;
	int area;
	public Box() {};
	
	public Box(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	
		getArea();
	} 
	@Override
	public boolean equals(Object o) {
		Box box = (Box) o;
		
		double bArea = box.getArea();
		boolean result = area == bArea;
		
		return result;
	}
	public void setArea() {
		area = num1 * num2;
	}
	
	public int getArea() {
		setArea();
		return area;
	}

}
