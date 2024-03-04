package day05;
import java.util.*;
/* 1. 계단식 별찍기
 * *
 * **
 * ***
 * ****
 * *****	출력
 */

/* 2. 계단식 별찍기(역)
 * *****
 * ****
 * ***
 * **
 * *		출력
 */

/* 3. 계단식 별찍기(반)
 *      *
 *     **
 *    ***
 *   ****
 *  *****
 */

/* 4. 피라미드 별찍기
 *      *
 *     ***
 *    *****
 *   *******
 *  *********
 */

/* 5. 숫자열 찍기
 * 11111
 * 22222
 * 33333
 * 44444
 * 55555
 */

/* 6. 연속숫자 찍기
 * 01234
 * 12345
 * 23456
 * 34567
 * 45678
 */

/* 7. 달력 찍기
 *  1  2  3  4  5
 *  6  7  8  9 10
 * 11 12 13 14 15
 * 16 17 18 19 20
 * 21 22 23 24 25 
 */

/* 8. 숫자 찍기
 *   5  4  3  2  1
 *  10  9  8  7  6
 *  15 14 13 12 11
 *  20 19 18 17 16
 *  25 24 23 22 21
 */

public class Ex01_star {
	public static void main(String[] args) {
//region 1. 계산식
//		for(int i = 0; i < 5; i++){
//			for(int j = 0; j < i+1; j++){
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
//		System.out.println();
//endregion
		
//region 2. 계단식 별찍기(역)
//		for(int i = 0; i < 5; i++){
//			for(int j = i; j < 5; j++){
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//endregion
		
//region 3. 계단식 별찍기(반)
//		for(int i = 0; i < 6; i++){
//			for(int j = 6-1; j > i; j-- ){
//				System.out.print(" ");
//			}
//			
//			for(int j = 0; j < i; j++ ){
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//endregion
				
//region 4. 피라미드 식
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("숫자를 입력해 주세요 : ");
//		int line = scanner.nextInt();
//		
//		System.out.printf("\b");
//		
//		for(int i = 0; i < line+1; i++){
//			for(int j = line; j > i; j-- ){
//				System.out.print(" ");
//			}
//			
//			for(int j = 0; j < i; j++ ){
//				System.out.print("*");
//			}
//			
//			for(int j = 1; j < i; j++){
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//endregion
		
//region 5. 숫자 찍기
//		for(int i = 0; i < 5; i++)
//		{
//			for(int j = 0; j < 5; j++)
//			{
//				System.out.print(i+1);
//			}
//			System.out.println();
//		}
//endregion

//region 6. 숫자 찍기
//		for(int i = 0; i < 5; i++)
//		{
//			for(int j = i; j < 5+i; j++)
//			{
//				System.out.print(j);
//			}
//			System.out.println();
//		}
//endregion

//region 7. 달력 찍기
//		for(int i = 0; i < 5; i++)
//		{
//			for(int j = 0; j < 5; j++)
//			{
//				System.out.printf("%2d ", i*5+j+1);
//			}
//			System.out.println();
//		}
//endregion
		
//region 8. 숫자 찍기
//		for(int i = 1; i < 6; i++)
//		{
//			for(int j = 0; j < 5; j++)
//			{
//				System.out.printf("%2d ", i*5 - j);
//			}
//			System.out.println();
//		}
//endregion

//region 9. 숫자 계단 찍기
		for(int i = 0; i < 5; i++)
		{
			for(int j = 0; j < i+1; j++)
			{
				System.out.printf("%2d ", i*(i+1)/2 + 1 + j);
			}
			System.out.println();
		}
//endregion
	}
}
