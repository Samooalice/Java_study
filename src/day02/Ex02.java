package day02;

/*
 * PI를 기억할 변수를 float 형태로 만들고,
 * 위의 변수를 이용해서 반지름이 5인 원의 넓이, 둘레를 출력하시오.
 * 
 * +넓이와 둘레를 정수로 출력하시오.
 */
public class Ex02 {
	public static void main(String[] args) {
		float pi = 3.14f;
		int r = 5;
		
		
		System.out.println("<float 형으로 출력>");
		System.out.println("원의 둘레 : "+ 2 * r * pi);
		System.out.println("원의 넓이 : "+ r * r * pi);
		
		System.out.println("");
		
		System.out.println("<int 형으로 출력>");
		System.out.println("원의 둘레 : "+ 2 * r * (int)pi);
		System.out.println("원의 넓이 : "+ r * r * (int)pi);
	}
}
