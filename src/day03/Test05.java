package day03;

public class Test05 {
	public static void main(String[] args) {
		/*
		 * 비교 연산자
		 * 	크기를 비교하는 연산자
		 * 	비교연산자의 결과는 논리형태의 데이터가 만들어진다.
		 */
		
		int no_1 = 10;
		int no_2 = 11;
		
		System.out.println("no_1 < no_2 : " + (no_1 < no_2));
		System.out.println("no_1 > no_2 : " + (no_1 > no_2));
		System.out.println("no_1 <= no_2 : " + (no_1 <= no_2));
		System.out.println("no_1 >= no_2 : " + (no_1 >= no_2));
		System.out.println("no_1 == no_2 : " + (no_1 == no_2));
		System.out.println("no_1 != no_2 : " + (no_1 != no_2));
		
		//==연산자는 문자열도 확인 가능
		String jeenie = "제니";
		String name = "제니";
		
		System.out.println(jeenie == name);
		
		String irum = new String("제니");
		System.out.println(irum);
		System.out.println("irum == name : "+ (irum == name)); 
			// irum이 가르키는 주소와 name이 가르키는 주소가 다르기 때문에 false 반환

		System.out.println("irum == name : "+ name.equals(irum)); 
			// .equals => 주소를 비교하는 것이 아니기 때문에 true 반환
		
//		String a = "abc";
//		String b = "bcd";
//		
//		System.out.println("a < b : "+ (a > b));
		// string은 대소비교 연산자 정의가 되어있지 않기때문에 사용할 수 없다.
	}
}
