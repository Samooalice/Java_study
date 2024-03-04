package day07;
/* 피보나치 수열
 * 10개의 피보나치 수열을 출력하세요.
 */
public class Test04_PibonacciNum {
	public static void main(String[] args) {
		int first_Num = 1;
		int second_Num = 1;
		int next_Num = 0;
		
		System.out.print(first_Num + " "+ second_Num + " ");
		for(int i = 0; i < 8; i++) {
			next_Num = first_Num + second_Num;
			System.out.print(next_Num + " ");
			first_Num = second_Num;
			second_Num = next_Num;
		}
		
	}
}
