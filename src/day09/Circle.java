package day09;

public class Circle {
	//본 클래스는 원의 정보를 기억하는 클래스
	/*
	 * VO클래스를 제작할 때
	 * 변수는 은닉화가 원칙
	 * 
	 * 	 - 함수 : 프로그램 제작의 최소 단위
	 * 				=> 특정 기능을 코드화 한 것
	 * 				=> 자바에서는 Method라 부름(Method : 클래스 안에 있는 함수)
	 * 					이때, 자바는 클래스 밖에서 함수 생성이 안됨.
	 * 
	 * 					자바에서는 프로그램 제작의 기본 단위가 클래스이기 때문
	 * 		형식 : 
	 * 		[접근 지정자] [속성] 반환값타입 함수이름( 매개변수리스트 ) { 
	 * 			실행 내용... ;	
	 * 			return;
	 *		}
	 *
	 *	생성자 함수
	 *		: 	클래스가 실행되기 위해서는
	 *			클래스의 내용이 메모리에 올려져야 실행될 수 있다.
	 *			이때 메모리에 클래스의 내용을 올려주는 명령이
	 *			new 라는 명령이다.
	 *			
	 *			new라는 명령에 의해서 만들어진 것은
	 *			Heap 영역에 기록되고, 기록된 곳의 주소를 모르면 사용할 수 없음
	 *			사용하려고 만들어진 것(Instance)의 주소를 기억해야 함
	 *			기억하는 것을 감당하는 것이 변수(Reference).
	 *				Object = Reference + Instance
	 *			힙 영역에 올려진 것들은 자동 초기화 진행.
	 *
	 *			기본데이터타입의 변수들은 모두 0, 0.0, false로 초기화
	 *			참조형 타입의 경우는 null로 초기화
	 *
	 *			본 클래스처럼 객체가 만들어지는 순간 특정한 작업이 이미 처리되어야 하는 경우도 존재
	 *			Ex) 본 클래스의 반지름 세팅
	 *			같은 작업.
	 *
	 * 			클래스가 객체가 되는 순간, 해줘야 하는 작업들을 실행해주는 함수 : 생성자 함수
	 * 		ㄴ 변수의 초기화, 목적에 따라서 기본적으로 준비해야하는 작업들을 해주는 역할.
	 * 		
	 * 		*** 생성자 타입은 반환값을 적지 않는다.
	 * 			생성자는 일반적인 함수처럼 호출할 수 없다.
	 * 			new라는 명령과 함께 호출이 가능.
	 * 
	 * 		형식 :
	 * 			public 클래스이름() { } ==> 기본 생성자
	 * 			 => 기본 생성자는 정의하지 않으면 JVM(자바가상머신)이 만들어서 호출
	 * 				생성자를 하나라도 만들면, JVM은 기본 생성자를 만드는 작업을 하지 않음
	 * 				
	 * 				기본 생성자는 내용이 없더라도 작정하는 습관을 가지면 좋음
	 * 
	 * 			public 클래스이름(매개변수 리스트){
	 * 				실행내용...	
	 * 			}
	 * 
	 * this : 현재 실행중인 객체 자기자신의 주소를 기억하고 있는 약속된 변수
	 */
	
	//반지름 기억할 변수
	int rad;
	//둘레 기억할 변수
	double arround;
	//넓이 기억할 변수
	double area;
	
	public Circle() {}	//생성자 함수
	
	public Circle(int rad) {
		this.rad = rad;
	}
	
	//둘레 계산해서 세팅해주는 기능
	public void setArround() {
		// 계산에 필요한 반지름은 이미 세팅 되어 있음
		arround = 2 * 3.14 * rad;
	}
	
	public void setArea() {
		area = rad * rad * 3.14;
	}
}
