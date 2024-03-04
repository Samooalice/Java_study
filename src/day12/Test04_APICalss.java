package day12;

public class Test04_APICalss {
/*	API제공 클래스
 * 		1. String : 문자열을 관리하는 클래스
 * 			주의 - String클래스는 내용이 변경되면
 * 					변경된 내용을 별도로 메모리에 다시 저장한다.
 * 									=> 메모리 낭비가 심해질 수 있음.
 * 					변경이 심한 문자열은 String 클래스 활용보다는
 * 										 StringBuffer 클래스를 활용
 * 					문자열 데이터는 많이 사용됨으로 
 * 					클래스 중 유일하게 new키워드를 활용하지 않아도 됨.
 * 					(Ex. String abc = "abc";)
 * 						Stirng def = new String("abc");
 * 							=>  abc : 리터럴 풀의 주소 기억
 * 								def : 힙의 주소 기억
 * 								abc == def -> false 반환
 * 
 * 						String 클래스는 유일하게 '+'연산자 활용 가능
 * 
 * 		2. StringBuffer : String과 유사하게 문자열을 관리하는 클래스
 * 			차이점
 * 				- 	String클래스는 문자열이 변화되면 별도로 다시 저장
 * 					Buffer는 기존 데이터를 수정해서 보관
 * 						=> 메모리 관리 차원에서는 Buffer활용이 더 유리함.
 * 
 * 			참고
 * 				- 문자열 처리가 끝난시점에서는
 * 					String 형태로 다시 변환해줘야 한다.
 * 
 * 			사용법
 * 				- StringBuffer buff = new StringBuffer();
 * 				- StringBuffer buff = new StringBuffer("abc");
 * 			
 * 			다시 String 형으로 변환해주는 방법
 * 				- buff.toString();
 * 			
 * 			실무에서 활용방법
 *				(1). String이 편하므로 먼저 String 타입으로 변수 생성
 *					String str = "Jennie";
 *				(2). 문자열의 변환이 필요한 시점에 StringBuffer로 변환
 *					StringBuffer buffer = new StringBuffer(str);
 *				(3). 문자열 결합을 해준다. 
 *					buff.append(", lisa");
 *					buff.append(", rose");
 *					buff.append(", jisoo");
 *				(4). 문자열 처리가 끝나면 다시 String 형태로 변환
 *					buffer.toString();
 *
 *		3. Math
 *			=> 수학적인 기능을 처리하는 함수로 구성된 클래스
 *				멤버들이 보두 static 이므로 별도로 new를 활용하지 않아도 활용 가능
 *				new 시키지 못하도록 막아둔 클래스
 *			=> 기본생성자의 접근지정자를 private로 정의해놔서
 *				다른 클래스에서 new시키지 못하도록 조치해놓은 클래스이다.
 *
 *		4. Wrapper Class
 *			=> 참조형 타입의 변수에는 기본형 타입의 데이터를 사용하지 못하는 문제가 생길 수 있다.
 *				이런 문제를 해결하기 위해 제공되는 클래스
 *				Ex). int형태의 데이터는 참조형이 아님으로 객체가 될 수 없음.
 *					객체형태로 사용해야될 필요가 있을경우 문제가 생길 수 있음
 *					위의 문제를 해결하기 위해 제공되는 클래스
 *			=> Boxing과 UnBoxing을 도와주기 위한 클래스
 *
 *			참고
 *				- Boxing : Value Type을 주소타입으로 변환하는 것
 *					ㄴ 기본형타입 -> 참조형타입으로 변환
 *
 *				- UnBoxing : 주소타입의 변수를 Value Type으로 변환하는 것
 *					ㄴ 참조형타입 -> 기본형타입으로 변환				
 *			Integer no = 10;	// 자동 박싱
 *			int num = no;		// 자동 언박싱
 *
 *			주의
 *				- 유틸리티적인 함수들은 아직도 사용가능하므로
 *					완전히 버려진 클래스는 아님
 *					Ex). Integer.ParseInt();
 */
	public Test04_APICalss() {
		// TODO Auto-generated constructor stub
		StringBuffer buff = new StringBuffer();
		//append : 덧붙인다는 의미 -> 끝에는 공백을 넣어주는 것이 좋다
		
	}

	public static void main(String[] args) {
		new Test04_APICalss();
	}

}
