package day05;
import java.util.*;
import java.lang.reflect.Array;

/*
 * 향상된 for 명령(forEach)
 * 		=> 배열 친구
 * 
 * 배열(Array) : 한 가지 타입의 데이터를 여러개 모아서 관리하는 자료구조
 * 	선언 방법 - 데이터타입[] 변수이름 = new 데이터타입[int];
 * 				데이터타입[] 변수이름 = new 데이터타입[]{데이터1, 데이터2, 데이터3, ... };
 * 			  - 데이터타입 변수이름[] = {데이터1, 데이터2, 데이터3, ... };
 * 
 * 	사용 방법 - 꺼낼때 : 배열이름[위치값];
 * 				입력할때 : 배열이름[위치값] = 데이터;
 * 
 *  배열 단점 - 배열을 생성할 때 관리할 데이터 타입과 관리한 데이터의 개수를 지정해줘야 한다.
 *  			한번 결정된 데이터의 형태와 개수는 변경할 수 없음. 
 * 
 */
public class Test06_foreach {
	public static void main(String[] args) {
//		int[] lotto = new int[6];
//		
//		for(int i = 0; i < lotto.length; i++){
//			lotto[i] = (int)(Math.random()*(45 - 1 + 1) + 1);
//		}
//		System.out.println(Arrays.toString(lotto));
		
		int nums[] = {1, 2, 3, 4, 5};
		
		int[][] lotto = new int[5][6];
		
		
		for(int i = 0; i< lotto.length ; i++) {
			loop:
			for(int j = 0; j < lotto.length+1; j++) {
				int no = (int)(Math.random() * 45 + 1);
				for(int k = 0; k < j; k++) {
					if(lotto[i][k] == no) {
						j--;
						continue loop;
					}
				}
				lotto[i][j] = no;
			}
		}
		for(int i = 0; i < lotto.length; i++) {
			System.out.println(Arrays.toString(lotto[i]));
		}
		
		System.out.println();
		
		for(int i = 0; i < lotto.length ; i++) {
			for(int j = 0; j < lotto[i].length ; j++) {
				System.out.printf("%3d", lotto[i][j]);
			}
			System.out.println();
		}
		
//region <버블 소팅>
//		for(int i = 0; i < lotto.length; i++) {
//			for(int j = 0; j < lotto.length ; j++) {
//				for(int k = 0; k < lotto.length -1 ; k++) {
//					if(lotto[i][k] > lotto[i][k+1]) {
//						int tmp = 0;
//						tmp = lotto[i][k];
//						lotto[i][k] = lotto[i][k+1];
//						lotto[i][k+1] = tmp;
//					}
//				}
//			}
//		}
//endregion
		
//region <배열 오름차순 정렬>
		for(int i = 0; i < lotto.length ; i++) {
			for(int j = 0; j < lotto[i].length-1; j++) {
				for(int k = j+1; k < lotto[i].length ; k++) {
					if(lotto[i][k] < lotto[i][j]) {
						int tmp = lotto[i][j];
						lotto[i][j] = lotto[i][k];
						lotto[i][k] = tmp;
					}
				}
			}
		}
//endregion
		System.out.println();
		
		for(int i = 0; i < lotto.length ; i++) {
			for(int j = 0; j < lotto.length ; j++) {
				System.out.printf("%3d", lotto[i][j]);
			}
			System.out.println();
		}
	}
}
