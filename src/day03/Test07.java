package day03;

public class Test07 {
	public static void main(String[] args) {
		/* 예제
		 * 물건을 구매했는데 금액은 54,232원
		 * 화폐로 각각 몇장씩 지불해야 하는지 구하시오
		 */
		
		int total = 54232;
		int won_50;		//5만원
		int won_10;		//1만원
		int won_5;		//5천원
		int won_1;		//1천원
		int con_500; 	//500원
		int con_100; 	//100원
		int con_50; 	//50원
		int con_10; 	//10원
		int con_1; 		//1원
		int tmp; 		//잔돈
		
		won_50 = total / 50000;
		tmp = total % 50000;
		
		won_10 = tmp / 10000;
		tmp %= 10000;
		
		won_5 = tmp / 5000;
		tmp %= 5000;
		
		won_1 = tmp / 1000;
		tmp %= 1000;
		
		con_500 = tmp / 500;
		tmp %= 500;
		
		con_100 = tmp / 100;
		tmp %= 100;
		
		con_50 = tmp / 50;
		tmp %= 50;
		
		con_10 = tmp / 10;
		tmp %= 10;
		
		con_1 = tmp / 1;
		
		System.out.println("5만원권 : "+ won_50);
		System.out.println("1만원권 : "+ won_10);
		
		System.out.println("5천원권 : "+ won_5);
		System.out.println("1천원권 : "+ won_1);
		
		System.out.println("500원 : "+ con_500);
		System.out.println("100원 : "+ con_100);
		System.out.println("50원 : "+ con_50);
		System.out.println("10원 : "+ con_10);
		System.out.println("1원 : "+ con_1);
	}
}
