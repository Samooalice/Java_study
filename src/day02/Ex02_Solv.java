package day02;
/*
 * 주석 => 프로그램 실행에 관여하지 않는 문자열들을 기록하는 것.
 * 주석은 해당 명령에 대한 설명을 주로 적는 것이 일반적이다.
 * 
 * 따라서, 팀 작업에서는 꼭 필요.
 */
// 다일행 주석
	/*
	 * 예제2. 등산	
	 * 산의 높이는 1753m이다.
	 * A와 B가 등산을 하는데, A는 초당 0.75m로 오르고 B는 초당 1.03m내려간다.
	 * 두 사람이 만나는건 몇 초 후인가?
	 */
public class Ex02_Solv {
	public static void main(String[] args) {
		//System.out.println("여기는 메인 함수");
//region-------------------예제2 		
		float pos_A = 0f;
		float pos_B = 1753f;
		int i = 0;
		while(pos_A <= pos_B){
			System.out.println(i+"초");
			System.out.printf("B의 위치 : %.2f\n", pos_B);
			System.out.printf("A의 위치 : %.2f\n", pos_A);
			System.out.println("");
			pos_A += 0.75f;
			pos_B -= 1.03f;
			i++;
			
			if(pos_A >= pos_B) {
				System.out.println(i+"초");
				System.out.printf("B의 위치 : %.2f\n", pos_B);
				System.out.printf("A의 위치 : %.2f\n", pos_A);
				System.out.println("");
				
				System.out.println((i-1)+"초"+" ~ "+i+"초 사이에 서로 만납니다");
				break;
			}
		}
		
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
		}
//endregion
	
	
	public void abc() {
		System.out.println("여기는 abc함수");
	}
	
	int ab = 999;
}
