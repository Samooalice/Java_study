package day12;

public class Test01_overloading {
/*
 * 함수의 오버로딩(함수의 중첩)
 * 	=> 원직적으로 같은 클래스 내에서는 함수의 이름은 모두 달라야 함 이를 해결하기 위한 문법
 * 		-> 함수의 가독성에 문제가 있을 수있음
 * 			- 함수의 가독성 : 함수 이름을 봤을때 기능을 알 수 있어야 함
 *  	조건
 *			1. 함수의 이름이 같아야 한다.
 *			2. 매개변수리스트의 형태가 달라야 한다.
 *				==> 개수, 순서, 형태 중 하나라도 달라야 한다.
 *			3. 반환값과는 전혀 상관없다.
 *
 * 함수의 오버라이딩(함수의 재정의)
 *	=> 상속관계에 있는 하위클래스에서 상위클래스가 가진
 *		함수의 기능을 수정하는 기능 => 상위클래스의 함수를 재정의
 *
 *		방법
 *			0. 상속받아야 한다.
 *			1. 상위 클래스가 가진 함수의 원형과 동일한 형태로 만들어야 함
 *				함수의 원형(Prototype)
 *			2. 접근지정자는 같거나 넓은 방향으로
 *			3. 예외처리는 같거나 좁은 방향으로
 *
 *	***	클래스의 접근지정자는 public과 생략만 사용 가능하다.
 */
	public static void main(String[] args) {
		new Test01_overloading();
	}

	public Test01_overloading() {
		Test01_sub2 t1 = new Test01_sub2();
		System.out.println("Test01_Sub2.getNum() : "+ t1.getNum());
	}
}

class Test01_Sub{
	int no;
	public int getNum() {
		return 0;
	}
}

//Test01_sub2를 Test01_sub1을 상속받아서 만들고
//getNum()을 1 ~ 20 사이의 정수로 랜덤하게 반환해주는 기능으로 거쳐서 정의하시오

class Test01_sub2 extends Test01_Sub{
	@Override
	public int getNum() {
		int result = (int)(Math.random() * 20 + 1);
		return result;
	}
}
