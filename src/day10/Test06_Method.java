package day10;

import java.util.Arrays;

/* 가변인자
 * 함수를 제작할 때 입력해야할 데이터의 갯수에 따라
 * 매개변수리스트의 형태가 달라진다
 * 
 * 형태 :
 * 		[접근지정자] [속성] 반환값타입 함수이름(매개변수리스트){
 * 
 * 
 * 		}
 * 
 * 그 함수가 가지고 있는 매개변수와 동일한 갯수, 형태, 순서를 이용해서
 * 합수를 호출해야 한다.
 * 
 * 데이터의 갯수를 정할 수 없는 경우에는
 * 		==> 이런 상황에서 사용할 수 있는 문법
 * 	형식 :
 * 		[접근지정자] [속성] 반환값타입 함수이름(데이터타입 ... 변수이름){
 * 			실행내용...
 * 		}
 * 		==> 매개변수로 만들어진 no는 배열변수가 된다. 
 */
public class Test06_Method {

	public static void main(String[] args) {
		Test06_Method t1 = new Test06_Method();
		
		t1.abc(28, "제니");
		
		System.out.println(t1.sum(1, 1, 1, 2, 3));
	}

	public void abc(int age, String name) {
		System.out.println("이름 : " + name +", 나이 : "+ age);
	}
	
	public int sum(int ... no) {
		//no는 배열변수 => 개수만큼 꺼내서 입력
		int result = 0;
		System.out.println(Arrays.toString(no));
		for(int out : no) {
			result += out;
		}
		
		return result;
	}
}
