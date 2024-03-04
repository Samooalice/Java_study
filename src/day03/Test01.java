package day03;

public class Test01 {
	public static void main(String[] args) {
		int no_1, no_2; // 같은 형태의 변수는 동시에 선언 가능
		no_1 = 10; 		// 대입 연산자 : 연산 방향은 오른쪽에서 왼쪽으로 진행
		
		System.out.println("1. no_1 : " + no_1);
		/*
		 * 같은 이름의 변수는 한 블록에서 여러개 만들 수 없음.
		 * 먼저 선언한 변수는 stack영역에 이미 있기 때문에 
		 * 같은 이름의 변수선언은 안된다.
		 */
		no_2 = no_1 += 7;
		
		System.out.println("2. no_1 : " + no_1);
		System.out.println("3. no_2 : " + no_2);
		
		//no_2에서 5를 빼서 기억시켜보자.
		no_2 -= 5; // no_2 = no_2 - 5;
		System.out.println("4. no_2 : " + no_2);
		
		no_1 /= 5; // (int) / (int) = (int)
		System.out.println("5. no_1 : " + no_1);
		
		no_1 *= 5;
		System.out.println("6. no_1 : " + no_1);
		
		no_2 %= 10;
		System.out.println("7. no_2 : " + no_2);
	}
}
