package day03;

public class Test10 {
	public static void main(String[] args) {
		for(int i = 0; i<10; i++) {
			//0 ~ 10까지 랜덤한 숫자
			int no_1 = (int)(Math.random() * (10 - 0 + 1)) + 0;
			
			//-10 ~ 10까지 랜덤한 숫자
			int no_2 = (int)(Math.random() * (10 - (-10) + 1)) + (-10);
			
			System.out.println(no_1);
			
			
			System.out.println(no_2);
		}
		 
	}
}
