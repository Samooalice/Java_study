package day07;
/*
 * 1 - 2 + 3 - 4 + 5 - 6 + ... 로 진행할 경우
 * 결과가 100을 넘어서는 수자는 몇인지 출력하세요.
 */
public class Ex02 {
	public static void main(String[] args) {
		int start_num = 0;
		int result = 0;
//region <홀수 짝수로 진행>
		while (true) {
			start_num++;
			
			if(start_num % 2 != 0) {
				result += start_num;
			}
			else {
				result -= start_num;
			}
			
			if(result > 100) {
				break;
			}
		}
		
		System.out.printf("숫자가 %d 이상일때 100을 넘어섭니다.\n", start_num);
//		if(cnt % 2 == 0) {
//			result += cnt;
//		}else {
//			result -= cnt;
//		}
		System.out.printf("결과 : %d // 다음 숫자 : %d", result, start_num);
//endregion
		
		System.out.println();
		
//region <부호 바꾸면서 진행>
//		start_num = 1;
//		int next_num = start_num;
//		result = 1;	System.out.println("초기값 : "+ result);
//		cnt = 1;
//		
//		
//		while (result < 100) {
//			System.out.println(result);
//			cnt++;
//			start_num++;
//			next_num = start_num * (-1);
//			result += next_num;
//		}
//		System.out.println(result);
//		System.out.println(cnt);
//		
		int buho = -1;
		int sum = 0;
		int no = 1;
		
		while (true) {
			buho = buho * -1;
			sum = sum + no * buho;
			if(sum > 100) {
				break;
			}
			no++;
		}
		
		System.out.printf("%d 까지의 합이 %d로 처음 100을 넘어서게 된다.\n", no, sum);
//endregion
	}
}
