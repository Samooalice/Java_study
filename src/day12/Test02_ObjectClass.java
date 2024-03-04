package day12;

public class Test02_ObjectClass {
/* Object 클래스
 * 	=> 자바로 만들어진 클래스의 최상위 super 클래스의 역할을 하는 클래스
 * 		자바로 만들어진 모든 클래스는 Object클래스가 제공하는
 * 		모든 기능(멤버 : 변수, 함수)를 자동적으로 사용할 수 있다.
 * 
 * 	참고 :
 * 		1. 최상위 클래스를 만들어 놓은 이유
 * 			=>  계층 추적을 원할히 하도록 하기 위함
 * 				각각의 클래스의 족보를 정확히 따질 수 있도록 하기 위함
 * 		2. 자바로 만든 모든 클래스는 반드시 상위 클래스를 가지고 있음
 * 			extends 키워드를 활용한 강제적으로 상위 클래스를 만들지 않으면
 * 			묵시적으로 Object 클래스를 상속받아서 만들게 된다.
 * 
 * instanceof
 * 	=> 특정 클래스를 new 키워드를 활용해서 생성하면 힙에 주소가 만들어짐
 * 		그때 생성된 주소가 어떤 클래스의 주소인지 알아내는 연산자.
 * 			- 연산결과 : bool 형
 * 
 * 		형식
 * 			주소(1) instanceof 클래스이름(2)
 * 				ㄴ (1)이 가리키고 있는 곳의 내용이 (2)의 소속인지 확인
 * 	참고
 * 		1. 소속이라는 개념은 is a 관계를 따지는 것
 * 
 */
	public static void main(String[] args) {
		new Test02_ObjectClass();
	}

	public Test02_ObjectClass() {
		Test02_B b1 = new Test02_B();
		System.out.println("b1 instanceof Test_02_A :" + (b1 instanceof Test02_A));
		System.out.println("b1 instanceof Test_02_B :" + (b1 instanceof Test02_B));
	}
	
class Test02_A{
	
}

class Test02_B extends Test02_A{
	
}

}
