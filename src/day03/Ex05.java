package day03;
/*
 * 화씨 온도 100도는 섭씨 온도 몇도인지 출력해주는 프로그램을 작성하시오.
 * 	섭씨온도 = 5 / 9 * (화씨온도 - 32)
 */
public class Ex05 {

	public static void main(String[] args) {
		float temp_F = 100f;
		float temp_C = 5f/9f * (temp_F - 32f);
		
		System.out.printf("%.2f", temp_C);
	}
}
