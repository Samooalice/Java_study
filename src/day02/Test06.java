package day02;

public class Test06 {
	public static void main(String[] args) {
		double pi = 3.1415f;
		
		//float pi_1 = pi; 작은 크기의 변수에 큰 크기 변수를 저장하면 문제가 생김
		//따로 지정해주지 않는다면, 정수 : int, 실수 : double이 기본형
		//----------해결방법---------------//
		//1. 강제형변환 -> double형의 pi를 float로 형변환
		float pi_1 = (float)pi;
		
		//2. 리터럴 형변환 -> float형태로 초기화
		float pi_2 = 3.14f;
		
		long no = 10;
		int no1 = (int)no;
		short no2 = (short)no;
	}
}
