package day07;
/* 피보나치 수열 배열 
 * 피보나치 수열 숫자 10개를 기억하는 배열을 출력하세요.
 */

public class Ex03_Fibonacci {
	public static void main(String[] args) {
		int[] array_Fibo = new int[10];
		
		array_Fibo[0] = 1;
		array_Fibo[1] = 1;
		
		for(int i = 2; i < array_Fibo.length; i++) {
			array_Fibo[i] = array_Fibo[i-2] + array_Fibo[i-1];
		}
		
		for(int out : array_Fibo) {
			System.out.print(out + " ");
		}
	}
}
