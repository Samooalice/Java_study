package day08;

//import java.util.Arrays;

/* 원 문제
 * 1.
 * 	반지름 5개를 기억할 배열을 만들고
 * 	1~20 사이에 랜덤하게 반지름을 채워서
 * 	원의 넓이, 둘레를 출력하는 프로그램을 작성하시오.
 * 
 * 2.
 * 	double[][] circle = new double[3][5];
 * 	circle[0] => 반지름
 * 	circle[1] => 둘레
 * 	circle[2] => 넓이
 * 	를 기억시키고, 출력하시오
 * 
 * 3.
 * 	double[3][5]로 되어있는 배열을
 * 	dongle[5][3]에 옮기시오
 */
public class Ex02_circleArray {
	final static double PI = 3.14;
	
	public static void main(String[] args) {
		double[] circle_Ra = new double[5];
		double[][] circle_Info = new double[3][5];
		
		loop:
		for(int i = 0; i < circle_Ra.length; i++) {
			circle_Ra[i] = (int)(Math.random() * (20 - 1 + 1) + 1);
			if( i == 0 ) {continue;}
			
			for(int j = 0; j < i; j++) {
				if(circle_Ra[i] == circle_Ra[j]) {
					i--;
					continue loop;
				}
			}
		}
		
		//반지름 출력 확인 코드
//		for(double out : circle_Ra) {
//			System.out.print(out +" ");
//		}
		
		for(int i = 0; i < circle_Ra.length; i++) {
			System.out.printf("[ %d ]번 반지름 길이 : %.0f\n둘레 : %.0f\n넓이 : %.2f\n", i+1, circle_Ra[i],2*circle_Ra[i]*PI, 
																				circle_Ra[i]*circle_Ra[i]*PI);
		}
		
//		System.out.println(circle_Info[1].length);
		System.out.println();
		
		for(int i = 0; i < circle_Info.length; i++) {
			switch (i) {
			case 0:
				circle_Info[i] = circle_Ra;
				break;
			case 1:
				for(int j = 0; j < circle_Info[i].length; j++){
					circle_Info[i][j] = 2*circle_Ra[j]*PI;
//					System.out.println("in");
				}
				break;
			case 2:
				for(int j = 0; j < circle_Info[i].length; j++){
					circle_Info[i][j] = circle_Ra[j]*circle_Ra[j]*PI;
				}
				break;
			}
		}

		
		System.out.print("원의 반지름 : ");
		for(Object out : circle_Info[0]) {
			System.out.printf("%.0f ", out);
		}
		
		System.out.println();
		
		System.out.print("원의 둘레 : ");
		for(Object out : circle_Info[1]) {
			System.out.printf("%.2f ", out);
		}
		
		System.out.println();
		
		System.out.print("원의 넓이 : ");
		for(Object out : circle_Info[2]) {
			System.out.printf("%.2f ", out);
		}
		
		double[][] dongle = new double[5][3];
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 5; j++) {
				dongle[j][i] = circle_Info[i][j];
			}
		}
		System.out.println();
		System.out.println();
//		System.out.println(dongle[0][0]);
		
		
		for(int i = 0; i < dongle.length; i++) {
			System.out.printf("%d번째 반지름 / 둘레 / 넓이 : \n", i+1);
			for(int j = 0; j < dongle[i].length; j++) {
				if(j == 0) { 
					System.out.printf("%.0f / ",dongle[i][j]); 
				}
				else {	
					System.out.printf("%.2f / ",dongle[i][j]);
				}
			}
			System.out.println();
		}
	}
}
