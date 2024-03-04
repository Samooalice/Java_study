package day07;
/* do - While 
 * 후 조건 처리 명령
 */
public class Test01_doWhile {
	public static void main(String[] args) {
		//2단 구구단을 출력하세요.
		
		int dan = 2;
		int gop = 1;
		
		do {
			System.out.printf("%d X %d = %2d\n", dan, gop, dan*gop);
			gop++;
		}while(gop < 10);
	}

}
