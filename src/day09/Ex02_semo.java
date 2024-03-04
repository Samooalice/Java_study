package day09;
/*	[문제]
 * 		삼각형의 정보를 기억할
 * 		Semo클래스를 제작하고
 * 		이 클래스를 이용해서
 * 		10개의 삼각형의 랜덤으로 생성된
 * 		데이터를 기억하고 정보를 출력하세요.
 */
public class Ex02_semo {
	public static void main(String[] args) {
		Semo[] semos = new Semo[10];
		
		for(int i = 0; i< semos.length; i++) {
			int hight = (int)(Math.random()*20 + 1);
			int wigth = (int)(Math.random()*20 + 1);
			
			Semo semo = new Semo(hight, wigth);
			
			semos[i] = semo;
		}
		
		for(int i = 0; i < semos.length; i++) {
			System.out.printf("%d 번째 삼각형 정보\n"
							+ "높이 : %2d\n"
							+ "너비 : %2d\n"
							+ "넓이 : %.2f\n", i+1, semos[i].hight, semos[i].width, semos[i].area);
			System.out.println();
		}
	}

}
