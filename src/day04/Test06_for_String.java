package day04;

public class Test06_for_String {
	public static void main(String[] args) {
		String str = "Black Pink!";
		/*
		 * 문자열 관련 함수들
		 * 	- length() : 문자열의 길이
		 *  - equals() : 해당 문자열의 데이터를 비교하는 함수
		 *  - charAT() : 문자열중 특정 위치의 문자를 알려주는 함수
		 *  - indexOf() : 문자열에 포함된 특정문자 또는 문자열의 시작 위치
		 *  				ㄴ 위치값이 0부터 시작
		 */
		
		//str의 길이
		System.out.println("str 길이 : "+ str.length());
		
		//'P'의 위치값 출력
		System.out.println("'P'의 위치값 : "+ str.indexOf('P'));
		
		//6위치에 있는 글자 꺼내기
		System.out.println("6위치의 글자 : "+ str.charAt(6));
		
		/*
		 * ""안에 ""을 넣고 싶은 경우, \"를 입력
		 */
		System.out.println("\"P\"의 위치값 : "+ str.indexOf('P'));
		
		//모든 문자를 하나씩 뽑아서 출력
		
		for(int i = 0 ; i < str.length() ; i++) {
			System.out.println((i+1)+ "번째 문자 : "+ str.charAt(i));
		}
		
	}
}
