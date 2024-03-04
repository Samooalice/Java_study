package day03;
/*
 * 1부터 100사이의 랜덤한 정수를 발생시켜서
 * 그 숫자가 홀수인지 짝수인지 판별해서 출력하시오.
 */
public class Test11 {
	public static void main(String[] args) {
		// 클래스 블럭 내에서는 일반 명령은 사용할 수 없다.
		
		int ran_num = (int)(Math.random() * (100 - 1 + 1) + 1);
		
		String result = (ran_num % 2 == 0) ? "짝수" : "홀수";
		System.out.println("랜덤한 숫자 "+ ran_num +" 은(는)"+ result +"입니다.");
	}
}
