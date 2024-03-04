package day15;
/*	내부클래스(Inner Class)
 * 		클래스 내부에서 다시 클래스를 만들 수 있다
 * 
 * 		1. Top Level Inner Class
 * 			=> 형식은 내부 클래스이지만,
 * 				독립적으로 활동하는 클래스
 * 
 * 			형식
 * 				static class 클래스이름 {
 * 						
 * 				}
 * 				=> 내부에 만들면서 static이 붙으면 Top Level Inner Class가 된다.
 * 		
 * 		***
 * 		2. 전역 inner Class(Global Inner Class)
 * 			=> 일반 클래스를 내부 클래스로 만든 것.
 * 				(일반적으로 내부클래스라고 부르는 것의 90%)
 * 							
 * 			형식
 * 				class 클래스이름{
 * 				}
 * 		
 * 		3. 지역 Inner Class(지역 내부 클래스)
 * 			=> 내부 클래스를 만드는 위치가 바깥 클래스의 함수 안에서 만들게 된다.
 * 
 * 			class Test{
 * 				class GlobInnerClass{	// 전역 내부 클래스
 * 				}
 * 		
 * 				int a;
 * 				void abc(){
 * 					class Inner{
 * 						//지역 내부 클래스	
 * 					}
 * 				}
 * 			
 * 				void xyz(){
 * 					abc();
 * 					System.out.println(a);
 * 				}
 * 			}
 * 
 * 		***
 * 		4. 무명 내부 클래스
 * 			=> 이름이 없는 내부 클래스
 * 
 * 			프로그램을 만들다 보면 클래스 기능의 수정을 위해서
 * 			오버라이딩을 해야하는 경우가 발생
 * 			(어쩔 수 없이 오버라이딩 해야하는 경우)
 * 				ㄴ 인터페이스나 추상클래스를 상속받아서 활용할 경우
 * 			
 * 			원칙적인 규칙은 하위 클래스를 별도로 만들고,
 * 			해당 클래스를 new시켜서 사용해야 함.
 * 			간단한 오버라이딩을 위해서 클래스를 별도로
 * 			클래스를 만드는것은 비효율적이기에, 해당 상황을 위한 클래스
 * 
 * 			클래스를 new 시키는 순간 필요한 기능을 오버라이딩 해서 사용하는 방법
 * 			
 * 			
 * 
 * 		참고
 * 			1. 클래스 이름은 일반 클래스와는 달리, 
 * 					바깥클래스이름.내부클래스이름 의 형식으로 선언
 * 
 * 			2. 외부클래스의 모든 멤버는 자동적으로 내부클래스에서 활용 가능
 * 			3. 반드시 외부 클래스가 new가 된 이후에 전역 내부클래스를 new시킬 수 있음
 * 			4. 외부 클래스는 내부클래스의 변수를 사용할 수 없다.
 * 				=> 사용하기 위해서는 new시켜서 주소로 접근해서 사용해야 함.
 * 
 * 			5. 주로 외부 클래스와 관련된 기능을 가진 클래스를 만들고 싶을때
 * 				활용되는 기법
 * 			6. 전역 내부 클래스와 유사하게 바깥 클래스의 멤버를 사용할 수 없다
 * 			7. 해당 클래스는 다른곳에서는 new 시킬 수 없다.
 * 				오직 외부 함수 내에서만 new 시킬 수 있다.
 * 
 * 
 */

public class Test01_InnerClass {
	public int no;
	
	public Test01_InnerClass() {
		// TODO Auto-generated constructor stub
		Test01_InnerClass.TopLev a = new Test01_InnerClass.TopLev();
		a.abc();
		
		GlobClass g1 = this.new GlobClass();	// 해당클래스가 객체가 되어야 GlobClass를 new시킬 수 있음
		g1.ch = 'Z';
		g1.xyz();
	}

	public static void main(String[] args) {
		new Test01_InnerClass();
	}
	
	static class TopLev{
		public void abc() {
			System.out.println("top Level inner class . abc()");
		}
	}
	
	public void xy() {
		int num = 100;
	}
	
	public class GlobClass{
		char ch = 'A';
		public void xyz() {
			no = 10;
			System.out.println(ch);
		}
	}
}

class OuterClass{

}
