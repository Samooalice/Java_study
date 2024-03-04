package day03;

/* 문제3
 * 1~10까지의 랜덤한 정수 2개(밑변, 높이)를 만들어서
 * 삼각형의 넓이를 출력하는 프로그램을 작성하시오.
 */

public class Ex03 {
	public static void main(String[] args) {
		int ran_num_1 = (int)(Math.random() * (10 - 1 + 1) + 1);
		int ran_num_2 = (int)(Math.random() * (10 - 1 + 1) + 1);
		
		System.out.println(ran_num_1);
		System.out.println(ran_num_2);
		
		float area_T = (float)(ran_num_1 * ran_num_2) / 2f;
		
		System.out.printf("밑변이 %2d 이고 높이가 높이가 %2d 인 삼각형의 넓이는 %4.1f입니다", 
									ran_num_1, ran_num_2, area_T);
	}
}
