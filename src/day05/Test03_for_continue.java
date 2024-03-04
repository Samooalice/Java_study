package day05;

/*
 * 구구단을 출력하는데
 * 7단을 제외하고 출려하시오.
 */
public class Test03_for_continue {
	public static void main(String[] args) {
		
		for(int dan = 2; dan < 10; dan++) {
			if(dan == 7) continue;
			for(int gop = 1; gop < 10; gop++) {				
				System.out.printf("%d x %d = %2d\n",dan, gop, dan*gop);
			}
			System.out.println();
		}
	}
}
