package day08;
import java.util.*;
/* [문제]
 * 연산식을 입력하면 계산해서 결과를 출력해주는
 * 프로그램을 작성하세요.
 * 
 * 단, 연산식의 내용을 문자 배열로 변환해서 처리하세요.
 */
public class Ex05_calculator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("문자식을 입력해 주세요 : ");
		String formula = scanner.nextLine();
		char[] formula_char = formula.toCharArray();
		int sign_pose = 0;
		
		for(int i = 0; i < formula.length(); i++) {
			if(formula_char[i] < '0' || formula_char[i] > '9') {
				sign_pose = i;
				break;
			}
		}
		System.out.println(sign_pose);
		int num_right = 0;
		int num_left = 0;
		
		System.out.println(formula_char[0] + 0);
		for(int i = 0; i < sign_pose; i++) {
			num_left = num_left * 10 + (formula_char[i] - '0');
		}
		
		for(int i = sign_pose+1; i < formula.length(); i++) {
			num_right = num_right * 10 + (formula_char[i] - '0');
		}
		
		System.out.println(num_right);
		System.out.println(num_left);
		
		double result = 0;
		switch (formula_char[sign_pose]) {
		case '+':
			result = num_left + num_right;
			System.out.printf("%s = %.0f", formula, result);
			break;
		case '-':
			result = num_left - num_right;
			System.out.printf("%s = %.0f", formula, result);
			break;
		case '*':
			result = num_left * num_right;
			System.out.printf("%s = %.0f", formula, result);
			break;
		case '%':
			result = num_left % num_right;
			System.out.printf("%s = %.0f", formula, result);
			break;
		case '/':
			result = (double)num_left / num_right;
			System.out.printf("%s = %.2f", formula, result);
			break;
		default:
			break;
		}
		
		scanner.close();
	}
}
