package day04;
import java.util.*;
/*
 * 1000 ~ 3000 사이의 숫자를 입력받아서
 * 이 숫자를 년도로 하는 해가
 * 윤년인지 평년인지 판별해주는 프로그램을 작성하시오.
 * 
 * 윤년 -> 4로 나누어 떨어지고, 100으로 나누어 떨어지지 않고
 * 			400으로 나누어 떨어지지 않는 해.
 */
public class Ex04 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			
			System.out.printf("1000~3000 사이의 년도를 입력해 주세요.(시스템 종료는 0) : ");
			int input_year = scanner.nextInt();
//			scanner.close();
			
			if(input_year == 0) {
				System.out.printf("시스템을 종료합니다.\n");
				break;
			}
			if(input_year < 1000 || input_year > 3000) {
				System.out.printf("잘못 입력 하셨습니다(1000~3000사이로 입력해주세요.)\n");
			}
			else {
				if(input_year % 4 == 0 && input_year % 100 != 0 && input_year % 400 != 0) {
				System.out.printf("%d년은(는) 윤년입니다.\n", input_year);
				}
				else {
					System.out.printf("%d년은(는) 윤년이 아닙니다.\n", input_year);
				}
			}			
		}
	}
}
