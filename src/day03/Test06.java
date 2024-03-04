package day03;

/*
 * 쉬프트 기호 <<, >>
 */
public class Test06 {
	public static void main(String[] args) {
		int no = 10;
		int result = no >> 2;
		System.out.println("no >> 2 : "+ result);
		// 비트를 주어진 방향으로 칸수 밀기
		//	ex. 10 => 00001010
		//					>> 2
		//						00000010
		// 쉬프트와 증감연산자는 중앙처리장치를 거치치 않기 때문에 속도가 빠름.
	}
}
