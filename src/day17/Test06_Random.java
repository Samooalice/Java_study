package day17;

import java.util.Random;

public class Test06_Random {

	public Test06_Random() {
		// TODO Auto-generated constructor stub
		Random random = new Random();
		
		for(int i = 0; i < 5; i++) {
			System.out.println(random.nextInt());
		}
		System.out.println();
		
		for(int i = 0; i < 6; i++) {
			System.out.println(random.nextInt(45) + 1);
		}
		System.out.println();
		
		random = new Random(100);
		for(int i = 0; i < 3; i++) {
			System.out.println(random.nextInt(100));
		}
	}

	public static void main(String[] args) {
		new Test06_Random();
	}

}
