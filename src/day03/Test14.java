package day03;
import javax.swing.*;

// console창 띄우기
public class Test14 {
	public static void main(String[] args) {
		String sno = JOptionPane.showInputDialog("***** 정수 입력 *****");
		int no = Integer.parseInt(sno);
		
		// 숫자를 짝수, 홀수, 0인지 판별
		
		String result = "";
		
		if(no == 0) {
			result = "0";
		}
		else if(no % 2 == 0) {
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
