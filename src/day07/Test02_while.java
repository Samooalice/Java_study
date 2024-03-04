package day07;

/* 
 * 2x + 4y = 10
 * 을 만족하는 (x, y)의 조합들을
 * 출력하시오.
 */
public class Test02_while {
	public static void main(String[] args) {
		int x = 0;
		int right_side = 10;
		
		while (x < right_side) {
			int y = (10 - 2*x)/4;
			if(y<0) break;
			
			if(2*x + 4*y == right_side) {
				System.out.printf("(x : %d, y : %d)\n", x, y);
			}
			x++;
		}
	}

}
