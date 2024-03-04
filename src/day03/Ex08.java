package day03;
/*
 * 랜덤하게 두개의 숫자를 발생시켜서
 * 작은 숫자부터 출력하는 프로그램을 작성하세요.
 */
public class Ex08 {
	public static void main(String[] args) {
		int ran_num_1 = (int)(Math.random() * (100 - 1 + 1) + 1);
		int ran_num_2 = (int)(Math.random() * (100 - 1 + 1) + 1);
		
		if(ran_num_1 >= ran_num_2) {
			System.out.println(ran_num_2 +", "+ ran_num_1);
		}
		else {
			System.out.println(ran_num_1 +", "+ ran_num_2);
		}
			
	}
}
