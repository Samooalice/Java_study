package day07;
/* 지역변수 : 변수중 생성된 지역에서만 사용할 수 있는 변수 
 * 
 * for( 여기랑 ){
 * 	여기 => for문 안에서만 사용가능
 * }
 * 
 * flag 기법
 *  ==> 프로그램을 실행하다가 두가지 이상의 경우가 발생하는 순간이 발생
 *  	Ex)
 *  		for( ; ; ){
 *  			if(조건){
 *  				break; (1)
 *  			}
 *  
 *  			
 *  		}
 *  		return; (2)
 *  
 *  	for문 반복문의 내용을 제대로 실행되어 종료가 되었는지(2),
 *  	특정 조건을 만나서 종료되었는지(1) 알아내는 방법
 *  
 *  	sol). 반복문이 시작되기 전에 변수를 가상의 데이터로 생성 & 초기화
 *  		  특정 조건에 만족하는 경우 그 변수 데이터를 변경한다.
 *  			=> break 직전에 다른 데이터로 교체 하는 방향.
 *  
 *  	Ex)
 *  		boolena flag = false;
 *  
 *  		for( ; ; ){
 *  			if(조건){
 *  				falg = true;
 *  				break; (1)
 *  			}
 *  
 *  			
 *  		}
 *  		return; (2)
 *  
 *  		=> 모두 실행 되었다면, flag == false
 *  		   특정 조건식에서 break되었다면, flag == true
 */

/* flag 기법 활용
 * 
 * 정해진 문자열이 순수하게 숫자로 구성되었는지
 * 중간에 다른 문자가 포함되어 있는지 알아보세요.
 */

public class Test03_localVariable {
	public static void main(String[] args) {
		String str = "1O301";
		boolean isOnly_num = true;
		
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			
			if(ch < '0' || ch > '9') {
				isOnly_num = false;
				break;
			}
		}
		
		if(isOnly_num == false) {
			System.out.printf("[ %s ] 는 숫자로만 되어있지 않습니다. | %b",str, isOnly_num);
		}
		else {
			System.out.printf("[ %s ] 는 숫자로만 되어있습니다. | %b",str, isOnly_num);
		}
		
		
	}
}
