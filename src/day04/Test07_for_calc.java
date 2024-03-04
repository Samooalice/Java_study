package day04;
import java.util.*;
/*
 * 정수 연산식을 입력하면 계산해서 출력해주는 프로그램을 작성하시오
 * 100-10 ==> 90
 */

public class Test07_for_calc {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 연산식을 입력해 주세요 : ");
		String math_ex = sc.nextLine();
		
		int idx = 0;
		for(int i = 0; i<math_ex.length(); i++) {
			char ch = math_ex.charAt(i);
			if(ch < '0' || ch > '9') {
				idx = i;
				break;
			}
		}
		
		String sno1 = "";
		for(int i = 0; i<idx ; i++) {
			sno1 += math_ex.charAt(i);
		}
		
		String sno2 = "";
		for(int i = idx+1; i<math_ex.length() ; i++) {
			sno2 += math_ex.charAt(i);
		}
		
		System.out.println("연산식 : "+ math_ex);
		System.out.println("sno1 : "+ sno1);
		System.out.println("sno2 : "+ sno2);
		System.out.println("연산기호 : "+ math_ex.charAt(idx));
		
		int sno1_int = Integer.parseInt(sno1);
		int sno2_int = Integer.parseInt(sno2);
		float result = 0;
		
		switch (math_ex.charAt(idx)) {
		case '+':
			result = sno1_int + sno2_int;
			System.out.println(math_ex +" = "+(int)result);
			break;
		case '-':
			result = sno1_int - sno2_int;
			System.out.println(math_ex +" = "+(int)result);
			break;
		case '/':
			result = (float)sno1_int / (float)sno2_int;
			System.out.println(math_ex +" = "+result);
			break;
		case '*':
			result = sno1_int * sno2_int;
			System.out.println(math_ex +" = "+(int)result);
			break;
		case '%':
			result = sno1_int % sno2_int;
			System.out.println(math_ex +" = "+(int)result);
			break;
		default:
			break;
		}
	}
}
