package day05;
import java.util.*;
/*
 * 연산식을 입력하면
 * 연산식의 결과를 출력해주는 계산기를 제작하시오.
 * 
 * 단, Q가 입력되면 프로그램을 종료되게 하시오.
 */

public class Test04_for_break {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		for(;;){
			System.out.print("계산식 입력 : ");
			String math_String = scanner.nextLine();
			
			if(math_String.equals("Q") || math_String.equals("q")){
				System.out.println("프로그램을 종료합니다.");
				scanner.close();
				break;
			}
			
			int sign_Check = 0;
			
			for(int i = 0; i < math_String.length(); i++) {
				char ch = math_String.charAt(i);
				
				if(ch < '0' || ch > '9') {
					sign_Check = i;
					break;
				}
			}
			
			//문자열 잘라내기
			//	substring(int beginIndex, int endIndex) => begin포함 ~ end이전까지 출력
			//	substring(int beginIndex) => beginIndex포함 이후만 출력
			String input_num_S1 = math_String.substring(0, sign_Check);
			int input_num_I1 = Integer.parseInt(input_num_S1);
			
			String input_num_S2 = math_String.substring(sign_Check+1);
			int input_num_I2 = Integer.parseInt(input_num_S2);
			
			char sigh = math_String.charAt(sign_Check);
			
			double result = 0;
			
			switch (sigh) {
			case '+':
				result = input_num_I1 + input_num_I2;
				break;
			case '-':
				result = input_num_I1 - input_num_I2;
				break;
			case '*':
				result = input_num_I1 * input_num_I2;
				break;
			case '/':
				result = (double)input_num_I1 / input_num_I2;
				break;
			case '%':
				result = input_num_I1 % input_num_I2;
				break;
			}
			System.out.printf("%d %c %d = %10.2f\n\n", input_num_I1, sigh, input_num_I2, result);
		}
	}
}
