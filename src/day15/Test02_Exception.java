package day15;
/*	예외처리
 * 		예외가 발생했을 경우 대처하는 방식의 프로그램
 * 
 * 		(1)
 *	 	try{
 * 				(2)
 *	 		----------	예외발생 가능 위치
 * 				(3)
 * 		} catch(?1){
 * 				(4)
 * 			?1 예외발생시 문제점 해결 부분
 *  	} catch(?2){
 *  			(4-1)
 *  		?2 예외발생시 문제점 해결 부분
 *  	} finally{
 *  			(5)
 *  	}
 *  	(6)
 *  
 *  	예외 발생 안하는 경우
 *  		(1) -> (2) -> (3) -> (5) -> (6)
 *  	?1 발생하는 경우
 *  		(1) -> (2) -> (4) -> (5) -> (6)
 *		?2 발생하는 경우
 *			(1) -> (2) -> (4-1) -> (5) -> (6)
 *
 *		(3)의 경우는 예외가 발생하지 않는 경우에만 실행
 *		try{}의 범위에 따라서 실행이 안될수도 있음
 *		때문에 반드시 실행되어야 하는 구간은 (3)에 있으면 안됨
 *
 *	예외처리 원리
 *		예외가 발생하면 JVM은 발생한 예외의 종류를 분석한 뒤
 *		예외에 대한 정보를 자바답게 클래스로 만들어서
 *		catch부분에 그 클래스의 주소를 전달
 *
 *	catch의 의미
 *		예외가 발생하면, 예외의 정보를 받아서 개발자가
 *		정보를 이용해서 원하는 처리를 해주어야 한다는 의미
 *
 *	다중 catch
 *		try{} 안에 예외 발생 요소가 여러가지로 복합적이게 발생할 수 있음
 *		여러가지 예외상황이 발생했을 경우, 좁은 것부터 기술하는 것이 원칙
 *
 *	finally{}
 *		예외 발생 여부와 상관없이 반드시 실행되어야 하는 명령들이 존재할 경우
 *		담아두는 블럭
 */

import java.util.Scanner;

public class Test02_Exception {
	Scanner scanner;
	public static void main(String[] args) {
		new Test02_Exception();
	}
	
	public Test02_Exception() {
		// TODO Auto-generated constructor stub
		scanner = new Scanner(System.in);
		
		int no = 0;
		
		try {
			System.out.print("정수 입력 : ");
			no = scanner.nextInt();
			
			System.out.println("1. no : " + no);
		}	catch (Exception e) {
			// TODO: handle exception
			System.out.println("2. 프로그램 이상으로 프로그램을 종료합니다");
		}
	}
}
