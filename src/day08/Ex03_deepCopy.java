package day08;

/* [문제]
 * 	주어진 문자열을 문자배열로 바꾸고
 * 	만들어진 문자배열과 같은 크기의 배열을 만든 후
 * 	공백을 기준으로 문자들을 바꿔서 배열에 저장하세요.
 * 
 * 	깊은 복사로 해결하세요.
 * 	System.arraycopy()
 */
public class Ex03_deepCopy {
	public static void main(String[] args) {
		String blackpink = "Black Pink";
		char[] before = blackpink.toCharArray();
		
		int space_pos = blackpink.indexOf(' ');
		char[] after = new char[blackpink.length()];
		System.arraycopy(before, space_pos+1, after, 0, blackpink.length()-space_pos-1);
//		System.arraycopy(before, space_pos, after, 0, blackpink.length()-space_pos-1);
		after[space_pos-1] = ' ';
		System.arraycopy(before, 0, after, space_pos, space_pos);
		
		System.out.println(after);
//		for(char out : after) {
//			System.out.print(out +" ");
//		}
	}
}
