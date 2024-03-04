package day10;

/* 랜덤하게 반지름을 만들어서
 * 원의 둘레와 넓이를 계산해서 출력하시오
 * 
 * 단, 기능은 함수로 처리하세요.
 * 1. 랜덤으로 반지름 만드는 함수
 * 2. 둘레 계산 함수
 * 3. 넓이 계산 함수
 * 
 * main{
 * 	Test05_Method t1 = new Test05_Method()
 * }
 */
public class Test05_Method {
	final static double PI = 3.14;
	public static void main(String[] args) {
		Test05_Method t1 = new Test05_Method();
		
		int num = t1.getNum();
		System.out.printf("반지름 길이 : %2d\n"
							+ "둘레 길이 : %.2f\n"
							+ "넓이 : %.2f\n", num, t1.getRound(num), t1.getArea(num));
		
	}

	public int getNum(){
		int num = (int)(Math.random() * 10 + 1);
		
		return num;
	}
	
	public double getRound(int num) {
		double result = 2 * num * PI;
		
		return result;
	}
	
	public double getArea(int num) {
		double result = num * num * PI;
		
		return result;
	}
}
