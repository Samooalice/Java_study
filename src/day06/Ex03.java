package day06;
import java.util.*;
/* 문제 3
 * 두 정수를 입력받아서
 * 두 수의 최대 공약수를 구해서 출력하세요
 * 
 * 최대공약수 : 두 수의 약수 중 제일 큰 수
 */
public class Ex03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("최대공약수를 구할 2개의 숫자를 입력해 주세요.");
		
		System.out.print("num 1 : ");
		int max = scanner.nextInt();
		
		System.out.print("num 2 : ");
		int min = scanner.nextInt();
		scanner.close();
		
		int great_D = (max < min) ? max : min;
		
		while (true) {
			if(max % great_D == 0 && min % great_D == 0){
				System.out.printf("최대공약수는 [ %d ] 입니다.\n", great_D);
				break;
			}
			great_D--;
		}
	}

}
