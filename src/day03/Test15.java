package day03;
import javax.swing.*;

// console창 띄우기
public class Test15 {
	public static void main(String[] args) {
		String sno = JOptionPane.showInputDialog("***** 정수 입력 *****");
		int no = Integer.parseInt(sno);
		
		// 숫자를 짝수, 홀수, 0인지 판별
		// 다중 조건 처리 명령 중 switch - case문 사용
		String result = "";
		
		
		switch (no) {
		case 0:
			result = "0";
			break;

		default:
			switch (no % 2) {
			case 0:
					result = "짝수";
				break;

			default:
					result = "홀수";
				break;
			}
		}
		
		JOptionPane.showMessageDialog(null, "입력 받은 숫자는 [ "+ no +" ]는 "
																+ result + " 입니다.");
//		System.out.println(no);
	}
}
