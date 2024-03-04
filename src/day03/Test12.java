package day03;

public class Test12 {
	public static void main(String[] args) {
		// 숫자가 짝수인지 홀수인지 판별하세요.
		int no = (int)(Math.random() * (200 - 50 +1) + 50);
		
		String result = "홀수";
		
		//짝수인 경우에만 if문에 적용됨.
		if(no % 2 == 0) {
			result =  "짝수";
		}
		
		//출력
		System.out.printf("%3d 은(는) %2s 입니다.", no, result);
	}
}
