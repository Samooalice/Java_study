package day06;
/* 문제 2
 * 1부터 n까지 합한 결과중
 * 몇까지 더해야 100이 넘어서는지
 * n을 찾아서 출력하시오. 합도 같이 출력하시오
 */
public class Ex02 {
	public static void main(String[] args) {
		int first_mum = 1;
		int result = 0;
		int cnt = 1;
		
		while (result < 100) {
			result += first_mum;
			first_mum++;
			cnt++;
		}
		if(result > 100) {
			result -= first_mum;
			cnt--;
		}
		System.out.println("n : "+ cnt);
		System.out.println("결과 : "+ result);
		System.out.println();
		System.out.printf("n이 %d넘어가는 순간부터(%2d) 결과는 100 이상이 되며, 결과는 : %2d입니다.", cnt, ++cnt, result+=first_mum);
	}

}
