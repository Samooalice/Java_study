package day03;
/*
 * 3자리 숫자를 랜덤하게 발생시켜서
 * 백자리 미만은 버리는 백단위 숫자를 만들고
 * 출력하시오
 * 
 * 	(예) 999 => 900
 */
public class Ex04 {
	public static void main(String[] args) {
		int ran_num_1 = (int)(Math.random() * (999 - 100 + 1) + 100);
		
		int first_vel = ran_num_1 % 100;
		int result = ran_num_1 - first_vel;
		
		System.out.println(ran_num_1);
		System.out.println(first_vel);
		System.out.println(result);
	}
}
