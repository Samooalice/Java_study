package day16;

import java.util.Scanner;

/*	사용자 예외 클래스 만들기
 * 		예외 클래스는 예외의 발생 원인을 알려주는 담당
 * 		강제 예외 던지기 => 자바가 미리 정의해 놓은 예외가 아님
 * 								-> 예외의 원인을 파악하기 힘듦.
 * 
 * 		예외의 원인을 파악하기 힘들기 때문에,
 * 		사용자가 예외정보를 만들어주는 클래스를 따로 만들어서 처리
 * 
 * 		방법
 * 			1. Exception 클래스를 상속 받는 클래스를 만든다.
 * 			2. toString() 오버라이드 해서 예외의 원인을
 * 				문자열로 반환하도록 한다.
 * 			3. 
 */
public class Test03_Exception {
	Scanner scanner;
	
	public Test03_Exception() {
		// TODO Auto-generated constructor stub
		scanner = new Scanner(System.in);
		try {
			while (true) {
				System.out.print("나이를 입력 하세요 : ");
				int age = scanner.nextInt();
				
				//input값이 음수일 경우 강제로 예외처리 발생
				if(age < 0) {
					throw new AgeException();
				}
				
				//예외가 없을 경우
				System.out.println("입력 나이 : " + age);
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		} finally{
			try {
				scanner.close();
			} catch (Exception e) {
				// TODO: handle exception
				
			}
		}
		
		System.out.println("프로그램 종료");
	}

	public static void main(String[] args) {
		new Test03_Exception();
	}

}

class AgeException extends Exception{
	@Override
	public String toString() {
		return "Input Age Error : 나이가 음수로 입력되었습니다.";
	}
}