package day03;
import java.util.*;

public class Test09 {
	public static void main(String[] args) {
		//별로 삼각형 출력
		System.out.println("*");
		System.out.println("**");
		System.out.println("***");
		System.out.println("****");
		System.out.println("*****");
		System.out.println("******");
		System.out.println("*******");
		
		Scanner sc = new Scanner(System.in);
		
//region 예제1. 정수를 입력받아서 짝수인지 홀수인지 판별해주는 프로그램
		while(true){
			System.out.print("짝수 홀수 판별을 위한 숫자를 입력해 주세요(프로그램 종료 : 0) : ");
			int num = sc.nextInt();
			
			if(num == 0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			
			String result = "";
			result = (num % 2 == 0) ? "짝수" : "홀수";
			System.out.println("입력받은 정수"+ num +"은(는)"+ result +"입니다.\n");
			
//			if(num%2 == 0) {
//				System.out.println(num+"은(는) 짝수입니다.\n");
//			}
//			else {
//				System.out.println(num+"은(는) 홀수입니다.\n");
//			}
		}
//endregion
		
//region 별찍기 벽삼각형
		for(int i = 1; i<7 ; i++) {
				System.out.println(" ");
			for(int j = 0; j<i-1; j++) {
				System.out.print("*");
			}
		}
//endregion
	}
}
