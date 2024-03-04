package day06;
/*
 * 향상된 for 명령
 * 	형식 :
 * 		for(데이터타입 변수 : 배열){
 *			실행문; 	
 * 		}
 * 	
 * 	
 */
public class Test01_forEach {
	public static void main(String[] args) {
		int[] nos = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		for(int i = 0; i < 10; i++) {
			System.out.println(nos[i] + " - ");
		}
		
		System.out.println("*** 향상된 for 명령 ***");
		for(int no : nos) {
			System.out.print(no + " - ");
		}
		System.out.println();
	}

}
