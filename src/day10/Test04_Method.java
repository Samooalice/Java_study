package day10;
import java.util.*;
/*
 * 랜덤하게 숫자 두개를 발생시켜서
 * 두수의 계산결과를 반환해주는 프로그램을 작성하시오
 * 처리는 함수를 제작해서 처리하는 것으로
 * 
 * 랜덤하게 두 정수를 발생
 * 발생된 두수의 연산기호를 입력해주면 결과 반환
 * 
 */
public class Test04_Method {
	public static void main(String[] args) {
		//작성된 함수들이 Static멤버가 아니기 때문에 함수 호출을 위한 방법
		Test04_Method t1 = new Test04_Method();
		
//		System.out.println(t1.plus(3, 4));
		
		
		int[] num = t1.getNums();
		char sign = t1.getSign();
		System.out.println("연산기호 : " + sign);
		
		double result = t1.calc(num, sign);
		System.out.printf("%2d %s %2d = %2f", num[0], sign, num[1], result);
		
		System.out.println();
		//-----------------입력받고 출력----------------------------//
		Scanner scanner = new Scanner(System.in);
		System.out.print("첫번째 숫자 : ");
		int no1 = scanner.nextInt();
		
		System.out.print("두번째 숫자 : ");
		int no2 = scanner.nextInt();
		
		scanner.nextLine();	// 버퍼 지우기
		
		System.out.print("기호 입력 : ");
		char sign_sc = scanner.nextLine().charAt(0);
		
		double result1 = t1.calc(no1, sign_sc, no2);
		
		System.out.printf("%2d %s %2d = %2.2f", no1, sign_sc, no2, result1);
		scanner.close();
	}
	
	public int[] getNums() {
		int[] result = new int[2];
		for(int i = 0; i < result.length; i++) {
			result[i] = (int)(Math.random()*20 + 1);
		}
		
		return result;
	}
	
	public char getSign() {
		char[] sign = {'+', '-', '*', '/', '%'} ;
		char result = 0;
		
		int idx = (int)(Math.random() * 5);
		
		result = sign[idx];
		return result;
	}
	public int plus(int no1, int no2) {
		return no1 + no2;
	}
	
	public int minus(int no1, int no2) {
		return no1 - no2;
	}
	
	public int multi(int no1, int no2) {
		return no1 * no2;
	}
	
	public double div(int no1, int no2) {
		return no1 / no2;
	}
	
	public int remain(int no1, int no2) {
		return no1 % no2;
	}
	
	//숫자2개와 기호를 통한 계산
	public double calc(int no1, char sign, int no2) {
		double result = 0f;
		
		switch (sign) {
		case '+':
			result = plus(no1, no2);
			break;
		case '-':
			result = minus(no1, no2);
			break;
		case '*':
			result = multi(no1, no2);
			break;
		case '/':
			result = div(no1, no2);
			break;
		case '%':
			result = remain(no1, no2);
			break;
		}
		
		return result;
	}

	//배열과 기호를 통한 계산
	public double calc(int[] no, char sign) {// 오버로드
		double result = 0f;
		
		switch (sign) {
		case '+':
			result = plus(no[0], no[1]);
			break;
		case '-':
			result = minus(no[0], no[1]);
			break;
		case '*':
			result = multi(no[0], no[1]);
			break;
		case '/':
			result = div(no[0], no[1]);
			break;
		case '%':
			result = remain(no[0], no[1]);
			break;
		}
		
		return result;
	}
}
