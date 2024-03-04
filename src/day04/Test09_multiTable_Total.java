package day04;

/*
 * 구구단 3단을 출력해보자.
 */
public class Test09_multiTable_Total {
final static int TABLE_START = 1;
final static int TABLE_END = 9;
final static int START_NUM = 1;
final static int END_NUM = 9;
	
	public static void main(String[] args) {
		for(int i = START_NUM; i<=END_NUM; i++){
			for(int j = TABLE_START; j<=TABLE_END ; j++) {
				System.out.printf("%d * %d = %2d | ", j, i, j*i);
			}
			System.out.println();
		}
		
//		for(int dan = 2; dan <10; dan++) {
//			for(int gop = 1; gop<10; gop++) {
//				System.out.println(dan+" X "+ gop +" = "+ dan*gop);
//			}
//			System.out.println();
//		}
	}
}
