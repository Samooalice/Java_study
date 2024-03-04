package day03;
/*
 * 랜덤하게 숫자 하나를 발생시켜서
 * 그 숫자에 가장 가까운 10의 배수를 찾아서 출력해주는 프로그램을 작성하세요
 */
public class Ex07 {
	public static final int TEN = 10;
	
	public static void main(String[] args) {
		int ran_num = (int)(Math.random() * (999 - 10 + 1) + 10);
		
		System.out.println("발생된 랜덤 숫자(10~999) : "+ ran_num);
		int first_val = ran_num % 10;
		int result;
		
//		// 삼항처리 연산자로 작성
//		result = first_val >= 5 ? ran_num - first_val + TEN : ran_num - first_val;
		
		// if문		
		if(first_val >= 5){
			result = ran_num - first_val + TEN;
		}
		else {
			result = ran_num - first_val;
		} 
		
		System.out.println("가까운 10의 배수 : "+ result);
	}
}
