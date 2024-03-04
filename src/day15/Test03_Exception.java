package day15;

import java.util.Scanner;

public class Test03_Exception {
	Scanner scanner;
	
	public Test03_Exception() {
		// TODO Auto-generated constructor stub
		scanner = new Scanner(System.in);
		
		try {
			while (true) {
				System.out.print("정수입력 : ");
				int no = scanner.nextInt();
				System.out.println("입력된 정수 : " + no);
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("잘못된 숫자가 입력되어, 프로그램을 종료합니다.");
		} finally {
			try {
				scanner.close();
			}catch (Exception e) {
				// TODO: handle exception
			}
		}
	}

	public static void main(String[] args) {
		new Test03_Exception();
	}

}
