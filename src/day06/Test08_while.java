package day06;

public class Test08_while {
	public static void main(String[] args) {
		// 구구단 5단을 출력해 봅시다.
		
		int dan = 5;
		int gop = 1;
		
		while(gop < 10) {
			System.out.printf("%2d X %2d = %2d \n", dan, gop, dan*gop);
			gop++;
		}
	}
}
