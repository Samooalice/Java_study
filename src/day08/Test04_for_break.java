package day08;
import java.util.*;

import javax.swing.JOptionPane;
/*
 * 정수를 입력받아 그 숫자가 짝수인지 홀수인지 출력하세요
 * 7번 반복하고, 3이 나오면 종료하세요.
 */
public class Test04_for_break {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int cnt = 0;
		
		while (cnt < 7) {
			System.out.print("숫자를 입력해 주세요 : ");
			int input = Integer.parseInt((JOptionPane.showInputDialog("*** 정수 입력 ***" + "\n" + "남은 카운트 : " + (7-cnt))));
			
			if(input == 3) {
				JOptionPane.showMessageDialog(null, "'3'을 입력받아 시스템을 종료합니다.");
				break;
			}
			
			if(input % 2 == 0) {
				JOptionPane.showMessageDialog(null, "짝수입니다.");
				System.out.print("짝수입니다. | ");
			}else {
				JOptionPane.showMessageDialog(null, "홀수입니다.");
				System.out.print("홀수입니다. | ");
			}
			
			cnt++;
			System.out.println("남은 카운트 : " + (7-cnt));
			System.out.println();
		}
		JOptionPane.showMessageDialog(null, "입력을 모두 받아 시스템을 종료합니다.");
		System.out.println("입력은 모두 받아 시스템을 종료합니다.");
		scanner.close();
	}
}
