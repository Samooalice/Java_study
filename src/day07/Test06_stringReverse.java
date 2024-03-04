package day07;

/*
 * 문자열을 역순으로 다시 만들어보자.
 */
public class Test06_stringReverse {
	public static void main(String[] args) {
		String str = "Hello Jennie!";
		String reverse = "";
		int len = str.length();
		int lastIndex = len - 1;
		
		for(int i = 0; i < len; i++) {
			char ch = str.charAt(lastIndex - i);
			reverse = reverse + ch;
		}
		
		System.out.println("원형 문자열 : "+ str);
		System.out.println("변형 문자열 : "+ reverse);
	}

}
