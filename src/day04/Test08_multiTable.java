package day04;

/*
 * 구구단 전체를 출력해보자.
 */
public class Test08_multiTable {
	final static int TABLE = 3;
	
	public static void main(String[] args) {
		for(int i = 1; i<10; i++)
		{
			System.out.printf("%d * %d = %2d\n",TABLE, i, TABLE*i);
		}
	}
}
