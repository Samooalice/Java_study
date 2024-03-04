package day01;
import java.util.Scanner;

public class Test01 {
	public static void main(String[] args){
		/*
		 * print : ���� ��� �� �ٹٲ�X
		 * println : ���� ��� �� �ٹٲ� O
		 * ��Ŭ�������� �ҽ��ڵ� ����
		 * 	- ������
		 *  - ������� ����(.class) ����
		 *  ������ �ϰ������� ����(ctrl + shift + F11)
		 
		System.out.println("���� ù��° �ڹ� ���α׷�");
		System.out.println("��Ŭ���� ���� ����~~!");
		
		//D2�ڵ� �۲� ��������
		 * */
		 
//region 1부터 10까지의 합
//		System.out.println("1부터 10까지 합");
//		int sum = 0;
//		
//		for(int i = 0; i<11; i++) {
//			sum += i;
//		}
//		
//		System.out.println(sum);
//endregion
		
//region 예제1. 정수를 입력받아서 짝수인지 홀수인지 판별해주는 프로그램
//		Scanner sc = new Scanner(System.in);
//		
//		while(true){
//			System.out.print("짝수 홀수 판별을 위한 숫자를 입력해 주세요(프로그램 종료 : 0) : ");
//			int num = sc.nextInt();
//			
//			if(num == 0) {
//				System.out.println("프로그램을 종료합니다.");
//				break;
//			}
//			
//			if(num%2 == 0 && num != 0) {
//				System.out.println(num+"은(는) 짝수입니다.\n");
//			}
//			else {
//				System.out.println(num+"은(는) 홀수입니다.\n");
//			}
//		}
//endregion

//region 예제2. 등산	
		/*
		 * 산의 높이는 1753m이다.
		 * A와 B가 등산을 하는데, A는 초당 0.75m로 오르고 B는 초당 1.03m내려간다.
		 * 두 사람이 만나는건 몇 초 후인가?
		 */
		
//		float pos_A = 0f;
//		float pos_B = 1753f;
//		
//		for(int i = 0; i < 1000; i++) {
//			System.out.printf(i+"초\n");
//			System.out.printf("B의 위치 : %.2f\n", pos_B);
//			System.out.printf("A의 위치 : %.2f\n", pos_A);
//			System.out.println("");
//			
//			if(pos_A >= pos_B) {
//				System.out.println((i-1)+"초"+" ~ "+i+"초 사이에 서로 만납니다");
//				break;
//			}
//			else {
//				pos_A += 0.75f;
//				pos_B -= 1.03f;
//			}
//		}
//endregion

//region 피보나치 수열
		int first = 0;
		int second = 1;
		int next = 0;

		System.out.print(first+" "+second+" ");
		
		for(int i=0; i<1000; i++) {
			
		}
//endregion
	
	}
}
