package day14;
/*	인터페이스
 * 		=> 클래스의 한 종류이긴 하지만,
 * 			약간은 그 형태나 의미가 다소 다르다
 * 
 * 		1. 인터페이스의 최상위 클래스가 Object 클래스가 아니다
 * 			=> 인터페이스는 다른 클래스를 상속받아서 만들어진 클래스가 아님
 * 		2. 내부에 100% 추상함수가 존재한다.
 * 			=> 원칙은 일반함수(기능이 구현된 함수)는 존재하면 안된다.
 * 		3. 인터페이스는 다른 클래스에 상속할 수 있다.
 * 			다중 상속 가능
 * 			class 클래스이름 implements 인터페이스1, 인터페이스2, ...{
 * 				모든 추상함수 오버라이딩..
 * 			}
 * 		***
 * 		4. 변수를 가질 수 있다.
 * 			인터페이스의 변수는 묵시적으로 public static final 변수가 된다.(수정 불가능)
 * 
 * 		5. 인터페이스 소속 함수는 묵시적으로 public함수가 된다.
 * 			
 * 		2+5
 * 			=> 인터페이스 소속함수는 묵시적으로
 * 				public abstract가 생략된 함수 형태로 작성될 수 있다.
 * 
 * 		형식
 * 			[접근지정자] interface 인터페이스이름{
 * 				변수		=> public static final 변수
 * 				추상함수	=> public abstract 함수
 * 			}
 * 		존재이유
 * 			=>  JVM에 의해서 자동 호출되어야 하는 함수가 필요.
 * 				해당 함수가 해야할 일이 개발자의 몫인 경우가 있는데,
 * 				이 기능을 인터페이스를 통해서 구현
 * 
 * 		사용방법
 * 			1. 인터페이스는 스스로 new안됨.
 * 				일반클래스에 상속해서 활용
 * 				
 * 				상속방법
 * 					class 클래스이름 implements 인터페이스{
 * 						추상함수 오버라이딩
 * 					}
 * 					=> 클래스는 "상속"이라고 표현
 * 						인터페이스는 "구현"이라고 표현
 * 
 * 		참고
 * 			1. 추상함수
 * 				=> abstract 속성을 하지 않아도 인터페이스 안에서는
 * 					자동적으로 몸체가 존재하지 않는 추상함수가 된다.
 * 			2. final
 * 				=>  클래스  : 더 이상 상속해줄 수 없는 클래스
 * 					함수 	: 더 이상 오버라이딩 할 수 없는 함수
 * 					변수 	: 더 이상 데이터를 수정할 수 없는 변수
 * 			3. 자바에서 이벤트를 처리하는 순서
 * 				- 사용자가 버튼을 클릭하면 이벤트가 발생
 * 					발생된 이벤트를 OS가 인지
 * 				- 운영체제는 자신이 인지한 이벤트가 발생한
 * 					프로그램을 구분하여 그 프로그램을 담당하는
 * 					플랫폼(JVM)에게 알려줌.			
 * 				- JVM은 통보받은 이벤트의 정보를 분석하여
 * 					함당한 함수를 호출하여 이벤트 처리를 함.
 * 						=> 정보에 합당안 함수를 호출한다는 것은 의미가 크다
 * 						=> 이벤트가 발생하면 무엇을 처리할지는 JVM이 결정
 * 			
 * 			4. 클래스는 상위클래스와 함께 인터페이스 상속을 받을 수 있다.
 * 					class 클래스이름 extends 상속할클래스 implements 인터페이스1, 인터페이스2, ... {
 * 						모든 추상함수 오버라이딩...
 * 					}
 * 				=> 클래스 상속 -> 인터페이스 구현
 * 			5. 인터페이스는 인터페이스를 상속받을 수 있다.
 * 				interface 상속받을인테페이스이름 extends 상소해줄인터페이스{
 * 					상위인터페이스 함수 + 하위인터페이스 함수
 * 				}
 * 
 * 			6. 인터페이스 내에도 일반함수가 있을 수 있음
 * 				함수 속성에 default라고 밝혀야 쓸 수 있음
 * 					default 함수이름(){
 * 						실행내용
 * 					}
 * 
 */	
public class Test01_interface {

	public Test01_interface() {
		// TODO Auto-generated constructor stub
		//Figure를 상속받은 클래스 10개
		Figure[] fig = new Figure[10];
		
		for(int i = 0; i < fig.length; i++) {
			int type = (int)(Math.random() * (4 - 3 + 1) + 3);
			int width = (int)(Math.random() * 20 + 1);
			int height = (int)(Math.random() * 20 + 1);
			fig[i] = type == 3 ? new Semo(width, height) : new Nemo(width, height);
			
			}
		
		for(Figure out : fig) {
			System.out.println(out);
		}
	}
	

	public static void main(String[] args) {
		new Test01_interface();
	}

}
