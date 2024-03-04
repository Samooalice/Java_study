package day03;
import javax.swing.*;

// console창 띄우기
public class Test13 {
	public static void main(String[] args) {
		String sno = JOptionPane.showInputDialog("***** 정수 입력 *****");
		int no = Integer.parseInt(sno);
		
		// Test12의 if 명령은 참인 경우만 처리해준다.
		// 참인 경우와 거짓인 경우 모두 if - else로 처리
		
		String result = "";
		
		if(no % 2 == 0) {
			result = "짝수";
		}
		else {
			result = "홀수";
		}
		
		JOptionPane.showMessageDialog(null, "입력 받은 숫자는 [ "+ no +" ]는 "
																+ result + " 입니다.");
//		System.out.println(no);
	}
}
