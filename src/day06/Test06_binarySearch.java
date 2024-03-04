package day06;
import java.util.*;

import javax.swing.JOptionPane;

/*
 * 랜덤하게 10개의 문자를 배열에 담고,
 * 정렬 하세요.
 * 
 * 단, 중복된 문자는 없게 하세요.
 */

public class Test06_binarySearch {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		char[] array = new char[10];
		
		loop:
		for(int i = 0; i < array.length; i++) {
			array[i] = (char)(Math.random() * (122 - 97 + 1) + 97);
			if( i == 0 ) continue;
			
			for(int j = 0; j < i; j++) {
				if(array[i] == array[j]) {
					array[i] = (char)(Math.random() * (122 - 97 + 1) + 97);
					i--;
					continue loop;
				}
			}
		}
		
		System.out.print("정렬전 배열 : ");
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array.length - 1; j++) {
				if(array[j] > array[j+1]) {
					char tmp = array[j];
					array[j] = array[j+1];
					array[j+1] = tmp;
				}
			}
		}
		
		System.out.println();
		
//		System.out.print("정렬된 배열 : ");
//		for(char out : array) {
//			System.out.print(out +" ");
//		}
//		System.out.println();
//		System.out.print("찾을 문자를 입력해 주세요 : ");
//		String target = scanner.nextLine();
		
		String msg = "| ";
			
		for(char out : array) {
			msg = msg + out + " | ";
		}
		
		String target = JOptionPane.showInputDialog(msg + "\n찾을 문자를 입력하세요!");
		char target_ch = target.charAt(0);
		System.out.println();
		
		int cnt = 0;
		int start = 0;
		int end = array.length;
		for(;;) {
			cnt++;
			int result = (start+end) / 2;
			
			if(target_ch == array[result]) {
				System.out.printf("찾으시는 단어 %s 는 %d 번째 인덱스에 있고 "
						+ "			\n작업 횟수는 %d입니다.", target, result, cnt);
				JOptionPane.showMessageDialog(null, "찾는 문자 "+ "[ "+ target_ch +" ]"+"는 "+"[ "+ result +" ] 인덱스에 있고,"
						+ "작업 횟수는"+ "[ "+cnt+" ] 입니다.");
				break;
			}
			else if(target_ch > array[result]) {
				start++;
			}
			else {
				end--;
			}
		}
	}	
}
