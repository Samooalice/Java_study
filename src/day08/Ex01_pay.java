package day08;

import java.util.Arrays;

/* 배열 문제
 * 
 * 1.
 * 79456원을 지불하려고 하는데,
 * 준비된 coin배열의 화폐단위로 몇장씩 지불해야 하는지
 * 계산해서 출력하시오.
 * 
 * 2.
 * 지불된 화폐 장수를 기억할 배열을 만들어서
 * 채우고 내용을 출력하세요. 
 */
public class Ex01_pay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] coin = {10000, 5000, 500, 100, 50, 10, 1};
		int[] pay = new int[coin.length]; 
		
		int payed_Money = 79456;
		
		for(int i = 0; i < coin.length; i++) {
			pay[i] = payed_Money / coin[i];
			
			payed_Money -= coin[i] * pay[i];
			System.out.printf("필요한 %5d권 : %d\n", coin[i], pay[i]);
		}
		
		System.out.println();
		System.out.println(Arrays.toString(pay));
		
		int[][] info = new int[2][coin.length];
//		//얕은 복사
//		info[0] = coin;
//		info[1] = pay;
//		coin[0] = 2;
		
//		//깊은 복사
		for(int i = 0; i < coin.length; i++) {
			for(int j = 0; j < coin.length; j++) {
				info[0][i] = coin[i];
				info[1][i] = pay[i];
			}
		}
		
		
//		System.arraycopy(coin, 0, info[0], 0, coin.length);
//		System.arraycopy(pay, 0, info[1], 0, coin.length);
		
		for(int i = 0; i < coin.length; i++) {
			System.out.printf("%6d : %d - ",info[0][i], info[1][i]);
			for(int j = 0; j < info[1][i]; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}
}
