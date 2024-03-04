package day05;

/*
 * 2부터 시작해서 소수 10개를 출력하시오.
 */

public class Test05_for_continue {
	public static void main(String[] args) {
		int cnt = 0;
		
		/*
		 * label이 붙은 for 명령
		 * 	break, continue에 적용되는 문법으로
		 * 	위 두 명령이 적용될 반복문을 지정해주고 제어하는 문법
		 * 
		 *  레이블이름 : 
		 *  for( ; ; ){
		 *  	for( ; ; ){
		 *  		continue 레이블이름;
		 *  	}
		 *  }
		 *  
		 *  **상위 반복문에만 적용이 가능함
		 */
		System.out.println(4 % 3);
		
		loop:
		for(int i = 2; ; i++){
			for(int j = i-1; j > 1; j--) {
				if(i % j == 0){
					continue loop;
				}
			}
			cnt++;
			System.out.printf("%d ", i);
			
			if(cnt == 10)
				break;
		}
	}

}
