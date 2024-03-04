package day18;

import java.util.*;

/*	Collection
 * 		많은 양의 데이터를 손쉽게 보관할 수 있는 클래스들을 부르는 단어
 * 		유사품 : 배열의 단점을 보완
 * 			배열 단점
 * 				1. 크기 수정 불가능
 * 				2. 데이터의 입출력에 제약사항이 많음
 * 
 * 		종류 
 * 			1. LIST
 * 				- 입력순서를 보장한다.
 * 				- 처리속도는 느린편
 * 				- 중복데이터의 입력을 허용한다.
 * 
 * 				해당 내용
 * 					(1). Vector		: 내부적으로 배열의 형태를 만들고 데이터를 보관함
 * 										입력과 검색은 빠르나,
 * 										데이터를 추가하거나 삭제하는 속도가 느림
 * 						==> 데이터 변화가 많이 없는 프로그램에서 유리함
 * 
 * 						해당 내용
 * 					 - 데이터 추가
 * 						add(Object o)
 * 						add(int index, Object element)
 * 						addAll(Collection c)
 * 						addAll(int index, Collection c)
 * 						addElement(Obect o)
 * 						insertElementAt(Object o, int index)
 * 
 * 					 - 데이터 수정
 * 						set(int index, object element)
 * 						setElementAt(Object element, int index)
 * 							==> 지정한 위치의 데이터를 입력데이터로 수정
 * 
 * 
 * 					 - 데이터 꺼내오기
 * 						get(int index)			= 위치값 지정해서 데이터 추출
 * 						elementAt(int index)	= 위치값 지정해서 데이터 추출
 * 						firstElement()			= 처음 데이터 추출
 * 						lastElement()			= 마지막 데잍 추출
 * 						elements()				= 모든 데이터 추출
 * 
 * 							E, V, K라고 표현된 타입들 => object를 의미하는 제네릭
 * 	
 * 					(2). ArrayList	: Vector의 신버젼
 * 										배열의 형태로 데이터를 관리하기 때문에
 * 										Vector의 특징은 모두 가지고 있음
 * 										쓰레드나 동기화를 자동으로 해주고 있어서
 * 										ArrayList를 더 선호함	
 * 
 * 					(3). LinkedList	: 내부적으로 이중 연결 리스트 방식으로 데이터를 보관함
 * 						
 * 					참고
 * 						- list계열의 번수를 출력하면 데이터가 추출된것처럼 착각할 수있음
 * 						- Iterator : 컬렉션은 많은 클래스들의 집합이고 형태도 모두 다르다.
 * 									 때문에 데이터를 꺼내는 방식이 서로 다를 수 있음.
 * 									 해당 불편함을 해결하기 위해서 만들어진 클래스
 * 									 List든 Set이든 Iterator타입으로 만들면 꺼내는 함수는
 * 									 Iterator 멤버 함수를 사용할 수 있음.
 * 
 * 			2. SET
 * 				- 입력순서를 보장하지 않음
 * 				- 자체적인 규칙에 의해서 데이터를 보관함
 * 				- 처리속도는 빠른 편
 * 				- 중복데이터가 중복이 되면, 먼저 저장된 데이터는 삭제하고 저장함
 * 					==> 중복데이터는 한번만 저장
 * 
 * 				
 * 			3. MAP 계열
 * 				- 데이터를 구분하는 "키값"과 한쌍으로 만들어서 저장
 * 				- 입력순서는 보장하지 않는다.
 * 				- 같은 키값으로 데이터가 입력되면, 먼저 입력된 데이터는 삭제됨
 * 					==> 데이터는 같아도 되지만, 키값은 같으면 안됨
 * 
 * 	정리 : List와 Set계열은 상위클래스가 같지만, MAP계열은 list와 set과는 다른 상위 클래스를
 * 			상속받는다. => List와 Set은 다형성 처리가 가능하지만, MAP은 불가능
 */
public class Test01_Collection {

	public Test01_Collection() {
		// TODO Auto-generated constructor stub
		Vector vector = new Vector(); // 데이터 기억공간 10개 확보
		System.out.println("vec capacity : " + vector.capacity());
		System.out.println();
		
		//데이터를 11개 추가하고, 추가할때마다 저장공간 출력
		for(int i = 0; i < 11; i++) {
			vector.add(i);
			System.out.println("vec capacity : " + vector.capacity());
		}
		System.out.println();
		
		for(int i = 0; i < 10; i++) {
			vector.add(i);
			System.out.println("vec capacity : " + vector.capacity());
		}
		System.out.println();
		
		//데이터를 꺼내는 함수
		// .size() 저장된 데이터의 갯수를 반환해주는 함수
		// .capacity() 저장할 수 있는 공간의 수를 반환 해주는 함수
		for(int i = 0; i < vector.size(); i++) {
			Object object = vector.get(i);
			System.out.println((int)object);
		}
		
		System.out.println(vector);
		
	}

	public static void main(String[] args) {
		new Test01_Collection(); 
	}

}
