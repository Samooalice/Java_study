package day09;
/*	[문제]
 * 		Nemo 클래스를 제작하고
 * 		10개의 정보를 기록할 배열을 만들어서 채우고
 * 		정보를 출력하세요.
 */
public class Ex03_nemo {
	public static void main(String[] args) {
		Nemo[] nemos = new Nemo[10];
		
		for(int i = 0; i < nemos.length; i++) {
			int row_1 = (int)(Math.random()*20 + 1);
			int length_1 = (int)(Math.random()*20 + 1);
			
			Nemo nemo = new Nemo(row_1, length_1);
			
			nemos[i] = nemo;
		}
		
		for(int i = 0; i < nemos.length; i++) {
			System.out.printf("%d 번째 사각형 정보\n"
							+ "가로 : %2d\n"
							+ "세로 : %2d\n"
							+ "넓이 : %2d\n", i+1, nemos[i].row, nemos[i].length, nemos[i].area);
			System.out.println();
		}
	}

}
