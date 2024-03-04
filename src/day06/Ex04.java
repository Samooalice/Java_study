package day06;

/* 1. 계단 별찍기
 *      *
 *     **
 *    ***
 *   ****
 *  *****  
 */

/* 1~5 별찍기
 * 11111
 * 22222
 * 33333
 * 44444
 * 55555
 */
public class Ex04 {
	public static void main(String[] args) {
		
		int turn = 0;
		
		while(turn < 5){
			int i = 4 - turn;	// i : 공백
			int j = 0;
			
			while ( i > 0 ) {
				System.out.print(" ");
				i--;
			}
			
			while(j <= turn) {
				System.out.print("*");
				j++;
			}
			
			turn++;
			System.out.println();
		}
		
		System.out.println();
		
		int i, j;
		i = j = 0;
		
		while(i < 5) {
			j = 0;
			while(j < 5) {
				char ch = ' ';
				if(j >= 4-i) {
					ch = '*';
				}
				j++;
				System.out.print(ch);
			}
			i++;
			System.out.println();
		}
		
	}
}
