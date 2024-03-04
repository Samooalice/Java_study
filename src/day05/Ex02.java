package day05;

/*
 * 주사위 두개를 던져서
 * 합이 7이 되는 경우를 모두 출력하시오.
 */
public class Ex02 {

	public static void main(String[] args) {
		for(int i = 1; i <= 6; i++)
		{
			for(int j = 1; j <= 6; j++)
			{
				if(i + j == 7) {
					System.out.printf("(%d, %d)\n", i, j);
				}
			}
		}
	}

}
