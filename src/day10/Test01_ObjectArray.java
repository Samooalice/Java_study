package day10;

import day09.Student;

public class Test01_ObjectArray {
/*
 * 	함수 : 기능의 기본단위 => 프로그램의 최소단위
 * 		형식 : [접근지정자] [속성] 반환값타입 함수이름(매개변수리스트){
 * 					처리내요... 
 * 				}
 * 
 * 		반환값타입 : 함수가 처리한 결과 값을 내보낼 타입
 * 					 반환값이 없을때는 생략하는 것이 아닌, void타입으로 정의
 * 
 * 		return :
 * 			1. 현재 실행중인 함수를 즉시 종료
 * 			2. 반환값이 있으면 반환해주고 실행 중인 함수 종료
 */
	public static void main(String[] args) {
		Student jennie = new Student("제니", 100, 100, 95);
		Student kwang = new Student("광섭", 100, 100, 95);
		
		System.out.println("이름 : " + jennie.getName());
		System.out.println("이름 : " + kwang.getName());
	}

}
