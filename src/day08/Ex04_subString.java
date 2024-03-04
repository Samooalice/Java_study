package day08;
/* [문제]
 * substring( ) 함수를 이용해서
 * 한글자씩 추출해서 출력하세요.
 */
public class Ex04_subString {
	public static void main(String[] args) {
		String blackpink = "Black Pink";
		
		String[] single = new String[1];
		
		for(int i = 0; i < blackpink.length(); i++) {
			single[0] = blackpink.substring(i, i+1);
			System.out.println(single[0]);
		}
	}
}
