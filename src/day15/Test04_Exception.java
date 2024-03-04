package day15;
/*	예외 정보 출력하기
 * 		1. 예외정보클래스 변수를 출력하면 정보를 출력할 수 있다.
 * 		2. 변수.printStackTrace()를 통해서
 * 			예외정보 + 예외가 발생된 위치와 경로를 출력할 수 있다.
 * 
 * 		예외가 발생하는 위치를 찾아야 사용자에게 어느 부분에서
 * 		예외가 발생되고 있는지 전달할 수 있기 때문
 */
import java.util.Scanner;

public class Test04_Exception {
	Scanner scanner;
	
	public Test04_Exception() {
		// TODO Auto-generated constructor stub
		scanner = new Scanner(System.in);
		
		try {
			System.out.print("정수 입력 : ");
			int no = scanner.nextInt();
			int result = 10 / no;
			System.out.println(10 +" / " + no + " = " + result);
		} catch (NumberFormatException e) {
			// TODO: handle exception
			System.out.println(e);
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				scanner.close();
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}

	public static void main(String[] args) {
		new Test04_Exception();
	}

}
