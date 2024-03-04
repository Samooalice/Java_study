package day06;
/*
 * while 반복문을 써서
 * 구구단 전체 출력
 */
public class Test09_while_multiTable {
	public static void main(String[] args) {
		int dan = 2;
		int gop = 1;
		
		while (dan < 10) {
			System.out.printf("%2d X %2d = %2d\n", dan, gop, dan*gop);
			gop++;
			if(gop == 10) {
				System.out.println();
				dan++;
				gop = 1;
			}
		}
	}
}
