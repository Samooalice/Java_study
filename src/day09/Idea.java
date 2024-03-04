package day09;

public class Idea {
	public static void main(String[] args) {
		char[] ch = new char[1];
		
		ch[0] = '3';
		System.out.println(ch[0]);
		
		System.out.println("s"+"l");
		
//		System.out.println(char('0' + '1'));		// 97 코드값 반환
		System.out.println(1 + '0');		// 49 코드값 반환
		System.out.println('1' - 0);		// 49 코드값 반환
		System.out.println('1' * '0');		// 2352 코드값 반환
		System.out.println(ch[0] - 0);		// 51 코드값 반환
		System.out.println('1' - '0');		// 1 정수 반환
		System.out.println('1' % '0');		// 1 정수 반환
		System.out.println(ch[0] - '0');	// 3 정수 반환
		
		char a = '1';
		char b = '0';
		
		int c = a + b;
		
		System.out.println("c : " +(char)c);
		System.out.println('1' - '0');	
		System.out.printf("");
		
		int i = '0' + '1';
		char ch_i = 76;
		
		System.out.println("i : "+ (char)i);
		System.out.println("ch_i : "+ ch_i);
//		if(i == ch) {
//			System.out.println("true");
//		}
	}

}
