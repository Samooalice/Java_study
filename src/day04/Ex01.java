package day04;
/*
 * 랜덤하게 0~100사이에 숫자를 세개 발생시켜서
 * 큰 숫자만 출력해주는 프로그램을 작성하시오
 * 
 * + 숫자를 순서대로 나열해서 출력하시오
 */
public class Ex01 {
	public static void main(String[] args) {
		int ran_num_1 = (int)(Math.random()*(100 - 0 + 1) + 0);
		int ran_num_2 = (int)(Math.random()*(100 - 0 + 1) + 0);
		int ran_num_3 = (int)(Math.random()*(100 - 0 + 1) + 0);
		int first_num;
		int second_num;
		int third_num;
		
		System.out.println("생성된 랜덤 숫자 1 : "+ ran_num_1);
		System.out.println("생성된 랜덤 숫자 2 : "+ ran_num_2);
		System.out.println("생성된 랜덤 숫자 3 : "+ ran_num_3);
		if(ran_num_1 >= ran_num_2) {
			first_num = ran_num_1;
			third_num = ran_num_2;
		}
		else {
			first_num = ran_num_2;
			third_num = ran_num_1;
		}
		
		if(first_num > ran_num_3) {
			System.out.println("가장 큰 수 : "+ first_num);
			if(third_num > ran_num_3) {
				second_num = third_num;
				third_num = ran_num_3;
			}
			else {
				second_num = ran_num_3;
			}
		}
		else {
			second_num = first_num;
			first_num = ran_num_3;
			System.out.println("가장 큰 수 : "+ first_num);
		}
		
		System.out.printf("큰 숫자대로 나열하면 %d, %d, %d ", first_num, second_num, third_num);
	}
}
