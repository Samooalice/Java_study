package day04;
/*
 * 1~99 사이의 랜덤 숫자를 발생시키고
 * 나이라고 가정하고, 
 * 나이대가 어떻게 되는지 판별해주는 프로그램 작성
 * 
 * 나이때
 * 	- 유년기
 * 	- 10대
 * 	- 20대
 * 	- 30대
 *  - 40대
 *  - 장년기
 * 로 구분하시오
 */
public class Test01 {
	public static void main(String[] args) {
		int ran_num = (int)(Math.random() * (99 - 1 + 1) + 1);
		
		System.out.println("받은 랜덤 숫자 : "+ ran_num);

//region --- switch case ---
		switch (ran_num / 10) {
		case 0:
			System.out.print("유년기 입니다.");
			break;
		case 1:
			System.out.print("10대 입니다.");
			break;
		case 2:
			System.out.print("20대 입니다.");
			break;
		case 3:
			System.out.print("30대 입니다.");
			break;
		case 4:
			System.out.print("40대 입니다.");
			break;
		default:
			System.out.print("장년기 입니다.");
			break;
		}
//endregion

//region --- if 문 ---
//		int check_age = ran_num / 10;
//		if(check_age == 0) {
//			System.out.println("유년기 입니다.");
//		}
//		else if(check_age == 1) {
//			System.out.println("10대 입니다.");
//		}
//		else if(check_age == 2) {
//			System.out.println("20대 입니다.");
//		} 
//		else if(check_age == 3) {
//			System.out.println("30대 입니다.");
//		}
//		else if(check_age == 4) {
//			System.out.println("40대 입니다.");
//		}
//		else{
//			System.out.println("장년기 입니다.");
//		}
//endregion
	
	}
}
