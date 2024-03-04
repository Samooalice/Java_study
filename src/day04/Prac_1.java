package day04;

public class Prac_1 {
	final static int LINE = 6;
	
	public static void main(String[] args) {
		for(int i = 0; i<LINE; i++){					// 줄
			for(int j = LINE; j>i+1; j--) {				// 공백
				System.out.print(" ");
			}
			
		for(int k= LINE; k>=LINE-i; k--) {				// *찍기
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
