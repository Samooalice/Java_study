package day04;
import java.util.*;

/*
 * 알파벳을 입력받아서,
 * 입력된 문자가 소문자이면 대문자로,
 * 대문자이면 소문자로 변환해서 출력하세요.
 */
public class Ex02 {
	final static int CHANGE_INT = 32;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("알파벳을 입력하세요 : ");
		String alphabet = sc.nextLine();
		
		if(alphabet.length() > 2)
		{
			System.out.printf("잘못된 입력내용 입니다.");
			sc.close();
		}
		char check_Point = alphabet.charAt(0);
		System.out.println("입력받은 알파벳 : "+ check_Point);
		
		if(check_Point < 'a') {
			int goto_Small = (int)check_Point + CHANGE_INT;
			System.out.println("입력받은 알파벳의 소문자 : "+(char)goto_Small);
		}
		else {
			int goto_Big = (int)check_Point - CHANGE_INT;
			System.out.println("입력받은 알파벳의 대문자 : "+(char)goto_Big);
		}
	}
}
