package day07;
import java.util.*;

/* <회문수인지 판별하기>
 * 
 * 다섯자리 숫자를 입력받아서
 * 이 숫자가 회문수 인지 아닌지 판별해서 출력하세요
 * 
 * 회문수 : 12321
 * 
 * 1. 문자열로 해결
 * 2. 정수로 해결
 * 3. 배열로 해결
 */
public class Ex01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean ispalinNum = true;
		
		System.out.print("숫자를 입력해 주세요 : ");
		int num = scanner.nextInt();
		int result = 0;
		
		int tmp = num;
		
		for(int i = 0; i < 5; i++) {
			int rest = tmp % 10;
			result = result * 10 + rest;
			tmp = tmp / 10;
		}
		System.out.println(result);
		
		if(num == result) {
			System.out.println("회문수가 맞습니다.");
		}else {
			System.out.println("회문수가 아닙니다.");
		}
//region <문자열로 해결>
//		System.out.printf("회문수 확인을 위한 숫자를 입력해 주세요.\n");
//		System.out.printf("숫자를 입력해 주세요 : ");
//		String palinNum_Check = scanner.nextLine();
//		
//		int cnt = 0;
//		int round = palinNum_Check.length();
//		System.out.printf("입력받은 문자의 수 : %d \n", round);
//		
//		while (cnt < round) {
//			if(palinNum_Check.charAt(cnt) == palinNum_Check.charAt(round - 1 - cnt)) {
//				cnt++;
//				continue;
//			}
//			ispalinNum = false;
//			break;
//		}
//		
//		if(ispalinNum == true) {
//			System.out.println("회문수 입니다.");
//		}
//		else {
//			System.out.println("회문수가 아닙니다.");
//		}
//		scanner.close();
//endregion
	
//region <정수로 해결>
//		System.out.println("회문수 확인을 위한 숫자를 입력해 주세요");
//		System.out.print("입력 : ");
//		int palinNum_Check = scanner.nextInt();
//		int pos_Check = 1;
//		int num_Pos = 1;
//		int cnt = 1;
//		
//		while (true) {
////			System.out.println("in");
//			if(palinNum_Check % pos_Check == palinNum_Check) {
////				System.out.println("out");
//				cnt--;
//				for(int i = cnt; i > 0; i--) {
//					if((palinNum_Check / num_Pos * 10) % 10 == palinNum_Check % 10);
//				}
//				
//				break;
//			}
////			System.out.println("hit num_pos");
//			num_Pos = pos_Check * 10;
//			
//			pos_Check = num_Pos;
//			cnt++;
//		}
//		System.out.printf("입력받은 수의 자리 개수 : %d\n", cnt);
//		
//		int compare_Num = num_Pos / 10;
//		int next_compare_Num = num_Pos / 10;
//		int check_point = 1;
//		int next_point = 1;
//		int i_lastNum = 0;
//		int i_firstNum = 0;
//		
//		for(int i = cnt; i > 0; i--) {
//			i_lastNum = palinNum_Check / next_point % 10;
//			i_firstNum = palinNum_Check / compare_Num % 10;
//			if(i_firstNum == i_lastNum) {
//				next_point = check_point * 10;
//				check_point = next_point;
//				
//				next_compare_Num = compare_Num / 10;
//				compare_Num = next_compare_Num;
//				continue;
//			}
//			ispalinNum = false;
//			break;
//		}
//		
//		if(ispalinNum == false) {
//			System.out.println("회전수가 아닙니다.");
//		}else {
//			System.out.println("회전수 입니다.");
//		}
//endregion

//region <배열로 해결>
//		System.out.print("회문수 숫자를 입력해 주세요 : ");
//		String string = scanner.nextLine();
//		scanner.close();
//		int[] palin_Array = new int[string.length()];
//		
//		for(int i = 0; i < palin_Array.length; i++) {
//			palin_Array[i] = string.charAt(i);
//		}
//		
//		for(int i = 0; i < palin_Array.length; i++) {
//			if(palin_Array[i] == palin_Array[palin_Array.length-1-i]) {
//				continue;
//			}
//			else {
//				ispalinNum = false;
//				break;
//			}
//		}
//		
//		if(ispalinNum == false) {
//			System.out.printf("입력하신 %s 는 회문수가 아닙니다.", string);
//		}else {
//			System.out.printf("입력하신 %s 는 회문수 입니다.", string);
//		}
//endregion
		
	}
}
