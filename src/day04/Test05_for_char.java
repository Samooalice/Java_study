package day04;

public class Test05_for_char {

	public static void main(String[] args) {
		// 랜덤하게 알파벳 문자를 10개 만들어서
		// 단어를 만들어서 출력하세요.
		
		int no = 'a';
//		System.out.println(no);
		
		for(int i = 0; i<10; i++) {
			int num = (int)(Math.random()*(25 - 0 + 1) + 0);
			char ch = (char)(no + num);
			System.out.print(ch+ " ");
		}
	}
}
