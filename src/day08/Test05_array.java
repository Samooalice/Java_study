package day08;

//import java.util.ArrayList;
import java.util.Arrays;

public class Test05_array {
/*<배열>
 * 같은 형태의 데이터 여러개를 모아서 한꺼번에 관리
 * 데이터가 많은 경우 각각의 변수에 기억시켜야 한다.
 * 
 * 많은 변수가 필요해서 제어하기 어려울때 배열을 활용
 * 
 * 배열 형태
 * 	- 기본형 => 변수에 기억된 내용이 데이터의 주소
 * 
 * 	- 참조형 => 변수에 기억된 내용이 주소인 경우
 * 
 * 선언한 배열은 '힙'에 저장됨
 * '힙'
 *  주소를 알아야 사용할 수 있는 영역
 *  가장 큰 영역이고, 확장이 가능하다.
 *  원칙적으로 한번 만들어지고, 프로그램이 종료될까지 사라지지 않는 영역
 *  힙 영역에 들어오는 것들은 자동 초기화가 된다.
 *  	- 기본형 : 0
 *  	- 참조형 : null
 *  
 *  new 명령 : 인스턴스를 힙에 만들기 / 만들어져 있는 인스턴스의 주소를 알려줌
 *  
 *  String str(Reference) = new String( );
 *  	str : Reference // new String() : Instance
 *  
 *  Object => Reference + Instance
 *  
 * 배열 선언하기
 * 	- 데이터가 기억될 공간은 힙에 저장됨
 *  	데이터타입[] 변수이름;
 *  	데이터타입 변수이름[];
 *  
 *  	데이터타입에 따라서 힙에 저장되는 데이터의 타입이 바뀐다.
 *  	
 *  	힙에 들어갈 레퍼런스를 선언 int[] num;
 *  	레퍼런스에 넣을 인스턴스 선언 num = new int[10];
 *  	레퍼런스 주소에 들어갈 데이터 저장 num[0] = (int)1;
 *  	
 *  배열 사용방법
 *  	배열변수[위치값]; => 자바에서 위치값은 항상 0부터
 *  
 *  	배열변수.length => 배열이 관리할 곳에 있는 메모리의 갯수를 기억하는 변수
 *  
 *  배열 초기화
 *  	배열은 힙 영역에 만들어지므로 자동으로 초기화가 이루어진다.
 * 		정수 -> 0
 * 		실수 -> 0.0
 * 		논리 -> false
 * 		문자 -> "0"
 * 		클래스타입 -> null
 * 
 *  	경우에 따라서 배열을 강제로 특정 값을 입력할 필요가 있음
 *  	 => 배열 초기화
 *  		int[] num = {1, 2, 3, 4};
 *  		int[] num = new int[]{1, 2, 3, 4};
 *  		*** 배열을 초기화 할 경우는, 배열의 크기를 규정할 수 없다.
 *  			(데이터의 개수에 의해서 크기 결정)
 *  
 *  	Arrays.toString(배열) => 배열을 출력하기 위해서는 반복문을 이요해서 출력
 *  							 but, 단순히 채워진 데이터 확인을 위해서 반복문 사용이 불편
 *  							 불편함을 해결하기 위해 제공해주는 함수
 *  
 *  	ㄴ 배열에 기억된 모든 데이터를 '문자열'로 만들어서 반환해주는 기능.
 *  		(데이터 확인 용도로만 활용)
 */
	public static void main(String[] args) {
//		String blackPink[] = {"제니", "리사", "로제", "지수"};
//		ArrayList[] lsitArrayLists = new ArrayList[5];
//		
//		Samgak[] semo = new Samgak[10];
		
		int[] no1 = new int[10];
		int[] no2 = {1, 2, 3};
		int[] num;
//		for(int i = 0; i < 10; i++) {
//			num[i] = i;
//		}
		num = no1;
		num = no2;
		
		System.out.println(Arrays.toString(num)); 			// "[1, 2, 3]" 이기 때문에 문자열은 9개
		System.out.println(Arrays.toString(num).length());	// 출력 문자열은 9개
	}
}

class Samgak{
	int width;
	int height;
	
	public double greatArea() {
		return width * height / 2;
	}
}
