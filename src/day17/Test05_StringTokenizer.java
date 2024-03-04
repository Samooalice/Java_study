package day17;
import java.util.*;
public class Test05_StringTokenizer {

	public Test05_StringTokenizer() {
		// TODO Auto-generated constructor stub
		String string = "The string tokenizer class allos " +
							"an application to break a string into tokens.";
		
		StringTokenizer token = new StringTokenizer(string);
		int len = token.countTokens();
		String[] wordStrings = new String[len];
		int idx = 0;
		
		while (token.hasMoreTokens()) {
			// hasmoreTokens() : 꺼내올 문자열이 있는지를 반환해주는 함수(boolen)
			// hasmoreElements() : 꺼내올 오브젝트가 있는지 반환해주는 함수(boolen)
			String word = token.nextToken();
			wordStrings[idx++] = word;
			System.out.println(word);
		}
		
		System.out.println(Arrays.toString(wordStrings));
//		token = new StringTokenizer("010-1212-1212", "-");
//		while (token.hasMoreElements()) {
//			Object object = (Object) token.nextElement();
//			String wordString = (String) object;
//			
//			System.out.println(wordString);
//		}
	}

	public static void main(String[] args) {
		new Test05_StringTokenizer();
	}

}
