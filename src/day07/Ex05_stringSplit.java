package day07;

/* 문자 자르기
 * ------------
 * 주어진 문자열을 공백을 기준으로
 * 분리해서 단어의 위치를 바꿔서
 * 새로운 문장을 만들어서 출력하세요.
 * 
 * 참고: subString(시작위치) => 문자열의 시작위치부터 마지막까지 추출해주는 함수
 * 		 subString(시작위치, 종료위치) => 시작위치에서부터 종료위치 직전까지 추출해주는 함수
 * 활용 가능.
 * 
 * 반복문을 이용해서 처리.
 */
public class Ex05_stringSplit {
	public static void main(String[] args) {
		String origin = "Black Pink";
		//region <숙제>
//		String store_String_1 = "";
//		String store_String_2 = "";
//		
//		boolean isFinish = false;
//		int cnt = 0;
//		
//		for(int i = 0; i < origin.length(); i++) {
//			store_String_1 += origin.charAt(i);
//			if(origin.charAt(i) == ' ') {
//				cnt++;
//				for(int j = cnt; j < origin.length(); j++) {
//						store_String_2 += origin.charAt(j);
//						isFinish = true;
//					}
//				}
//			if(isFinish == true) { break; }
//			cnt++;
//			}
//		System.out.println(store_String_1);
//		System.out.println(store_String_2);
//		System.out.println(store_String_2 +" "+ store_String_1);
		//endregion
	
		//region <풀이>
		int idx = 0;
		
		for(int i = 0; i < origin.length(); i++) {
			char ch = origin.charAt(i);
			
			if(ch == ' ') {
				idx = i;
				break;
			}
		}
		
		String frontString = origin.substring(0, idx);
		String beforeString = origin.substring(idx+1);
		
		System.out.println(beforeString +" "+ frontString);
		//endregion
	}
}

