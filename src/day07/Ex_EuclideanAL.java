package day07;
import java.util.*;
/* 뉴클리드 호제법을 활용해서 최대공약수를 구하여라
 * 
 */
public class Ex_EuclideanAL {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("숫자를 입력해주세요.");
		System.out.print("1번째 숫자 : ");
		int max = scanner.nextInt();
		
		System.out.print("2번째 숫자 : ");
		int min = scanner.nextInt();
		
		int cnt = 0;
		int great_D = 0;
		
		System.out.printf("max : %d // min : %d\n\n", max, min);
		while (true) {
			int remain = max % min;
			
			if(remain == 0) {
				great_D = min;
				System.out.printf("구하는 최대공약수는 : %d 입니다.\n", great_D);
				System.out.printf("진행 횟수는 %d 회 입니다.\n", cnt);
				scanner.close();
				break;
			}
			cnt++;
			max = min;
			min = remain;
		}
		
		System.out.printf("최소 공배수는 %2d 입니다.\n", max*min/great_D);
	}
}
