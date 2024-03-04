package day04;

public class Test03_for {

	public static void main(String[] args) {
		// 10~50까지의 숫자를 랜덤하게 만들어서 출력하고
		// 29가 나오는 순간 반복을 종료하세요.
		// 횟수도 찍어주세요
		
		int cnt = 0;
		
		for( ; ; )	// for 반복 명령
		{
			int ran_num = (int)(Math.random() * (50 - 10 + 1) + 10);
			System.out.print(ran_num +" ");
			cnt++;
			
			if(ran_num == 29)	{
				System.out.println();
				System.out.print("반복 횟수 : "+ cnt);
				break;
			}
		}
	}
}
