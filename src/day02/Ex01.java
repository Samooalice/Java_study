package day02;

/*
 * main 함수를 작성하고
 * 실행내용 : 
 * 날짜, 수업 시작 일 수, 수업 시간 수, 요일, 출석일수 변수를 만들고
 * 출력하시오.
 * 비고 : 날짜 - 문자열 / 수업일수 - 정수 / 수업시간 - 정수 / 요일 - 문자 / 여부 - 논리
 */
public class Ex01 {
	public static void main(String[] args) {
		String date = "24.01.30";
		int during_date = 2;
		int class_time = 8;
		char day = '화';
		boolean attend = true;
		
		System.out.println("오  늘  날  짜 : "+ date);
		System.out.println("수 업 시 작 일 : "+ during_date);
		System.out.println("수업 진행 시간 : "+ class_time);
		System.out.println("오 늘 의 요 일 : "+ day);
		System.out.println("출  석  여  부 : "+ attend);
	}
}
