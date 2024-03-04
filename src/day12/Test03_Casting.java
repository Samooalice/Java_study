package day12;
/* 다형성
 * 	=> 하나의 변수를 이용해서 여러 형태의 클래스를 사용할 수 있도록
 * 		하는 방법
 * 
 * 	주소의 형변환(Casting)
 * 		=> 원칙적으로 주소는 다른 형태로 형변환이 불가능
 * 			ㄴ 주소는 Heap 형태에 따라 주소가 결정되므로
 * 				Heap 형태가 다르면 주소를 저장할 수 없기 때문
 * 
 * 			Ex) int[] no = new float[] => 타입이 다르기 때문
 * 
 * 		***
 * 		한가지 경우에 한해서 주소의 형변환이 가능한데,
 * 		상속 관계에 있는 클래스 끼리는 형변환이 가능하다. => is a 관계이기 때문
 * 		
 * 			- 자동형변환 : 하위클래스의 주소가 상위클래스의 변수에 기억되는 상황
 * 				Ex)
 * 					class Father{}
 * 					class Son extends Father{}
 *						Father f = new Son(); => 가능 
 * 
 * 			- 강제형변환 : 상위 클래스의 주소가 하위클래스의 변수에 기억되는 것은 불가능
 * 							강제로 형변환은 가능하다
 * 
 * 				Ex)
 * 					Son s = (Son)(new Father());
 * 
 * 	참고
 * 		1. 상속받은 클래스는 상위 클래스의 함수를 오버라이딩 하는 경우
 * 			하위클래스의 인스턴스를 상위 클래스의 변수에 기억시켜서 사용할 때
 * 			오버로딩된 함수는 하위클래스의 오버로딩된 함수가 호출 됨.
 * 
 * 		2. 어떤 함수의 반환값이 상위 클래스 형태로 되어있으면,
 * 			그 반환값
 */
public class Test03_Casting {

	public static void main(String[] args) {
		new Test03_Casting();
	}
	
	public Test03_Casting() {
		Father father = new Son();
//		Son son = (Son)(new Father());
		father.toString();
		System.out.println(father);
		System.out.println((Son)father);
		System.out.println((int)abc(10)+1);
		
		
		String no = (String)abc() + 1;
		System.out.println(no);
	}

	public Object abc(Object o) {	// Object : 모든것을 다 받을 수 있는 타입
		int no = (int) o + 10;
		return no;
	}
	
	public Object abc() {
		return "3.14";
	}
	
}

class Father{
	@Override
	public String toString() {
		return "Father";
	}
}

class Son extends Father{
	@Override
	public String toString() {
		return "Son";
	}
}
