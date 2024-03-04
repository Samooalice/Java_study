package day03;
import java.util.*;
/*
 * 소수이하 네자리 이상되는 숫자를 입력받아서
 * 소수이하 셋쨰자리에서 반올림한 숫자를 만들어서 출력하는
 * 프로그램을 작성하시오
 * 
 * ''반올림 : 5를 더한다''
 */
public class Ex06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//키보드로 입력한 내용은 버퍼메모리에 기억되고
		//꺼내오면 순간 메모리에서 지워진다.
		System.out.print("소수이하 네자리 이상의 숫자를 입력하세요 : ");
		float input = sc.nextFloat();
		
		System.out.println("입력받은 수 : "+ input);
		
		float point_3f = input * 1000;
		int point_3i = (int)point_3f;
		
		int rounds_p = point_3i % 10;
		System.out.println("point_3i 수 : "+ point_3i);
		System.out.println("소수점 세번째 자리 수 : "+ rounds_p);
		
		if(rounds_p >= 5){
			float result = ((float)point_3i - (float)rounds_p + 10f) / 1000f;
			System.out.println("결과값 : "+ result);
		}
		else {
			float result = ((float)point_3i - (float)rounds_p) / 1000f;
			System.out.println("결과값 : "+ result);			
		}
 	}
}
