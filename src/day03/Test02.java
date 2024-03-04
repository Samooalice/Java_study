package day03;
import java.util.Scanner;
/* - java 변수 입력 받기 - 
 * import ~ : java 폴더 안의 util에서 Scanner 클래스 준비
 * 
 * main함수에서 
 * 	Scanner sc = new Scanner(System.in); 
 * 통해 입력받을 도구 준비
 * 
 * 변수 = sc.next~();
 * 	~는 입력받을 종류에 따라서 달라진다.(Ex. 문자열을 입력받을 경우 - nextLine();)
 * 
 * 문자열을 숫자로 받아서
 * 문자열을 정수로 변환해서
 * 연산을 하고, 그 결과를 출력
 */


/* 예제 문제
 * 두개의 숫자를 입력받아서
 * 첫번째 숫자를 가로로 하고
 * 두번째 숫자를 세로로 하는
 * 사각형의 넓이를 출력해주는 프로그램을 작성하세요
 */

public class Test02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String sno_1, sno_2;
		
		System.out.print("가로를 입력해주세요 : ");
		sno_1 = sc.nextLine();
		
		System.out.print("세로를 입력해주세요 : ");
		sno_2 = sc.nextLine();
		
		/* - 문자열 주의사항 -
		 * 문자열에서 사용 가능한 연산자는 '+'가 유일하다.
		 * 
		 * 문자열 -> int형으로 변환
		 * String str;
		 * 정수 : int a = Integer.parseInt(str);
		 * 실수 : double b = Double.parseDouble(str);
		 */
		int sno_1_Int = Integer.parseInt(sno_1);
		int sno_2_Int = Integer.parseInt(sno_2);
		System.out.print("사각형의 넓이는 : "+ (sno_1_Int * sno_2_Int) +" 입니다.");
		
		
	}
}
