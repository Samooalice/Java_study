package day06;

import java.lang.reflect.Member;
import java.util.Arrays;

/*blckPink멤버 내용 배열로 출력
 * 
 * 제니, 리사, 로제 지수 순으로 배열
 * 배열 나용 : 이름, 나이, 전화번호, 성별, 혈액형
 */
public class Test03_forEach {
	public static void main(String[] args) {
		String[][] blackPink = new String[4][5];
//		int[][] nums = new int[4][5];
//		
//		for(int[] no : nums) {
//			System.out.println(Arrays.toString(no));
//		}
//		
//		for(String[] memb : blackPink) {
//			System.out.println(Arrays.toString(memb));
//		}
		
		String[] jennie = new String[] {
				"제니", "28", "010-7272-7272", "여자", "B형"
		};
		
		String[] lisa = new String[] {
				"리사", "26", "010-2424-2424", "여자", "O형"
		};
		
		String[] rose = new String[] {
				"로제", "26", "010-5252-5252", "여자", "B형"
		};

		String[] jisoo = new String[] {
				"지수", "29", "010-3939-3939", "여자", "A형"
		};
		
		blackPink[0] = jennie;
		blackPink[1] = lisa;
		blackPink[2] = rose;
		blackPink[3] = jisoo;
		
		//전체 데이터 출력
		for(String[] memb : blackPink) {
			System.out.println(Arrays.toString(memb));
		}
		/*
		 * Arrays.toString() -> 배열의 데이터를 문자열로 변환해줌
		 * 데이터 각각에 대한 연산이 안됨.
		 */
		
		//시본 for문을 이용해서 데이터 꺼내서 출력하기
		System.out.println("*** for문을 이용한 데이터 ***");
		for(int i = 0; i < blackPink.length; i++) {
			for(int j = 0; j < blackPink[i].length; j++) {
				System.out.print(blackPink[i][j] +" | ");
			}
			System.out.println();
		}
		
		//하나의 데이터 출력
		for(String data : blackPink[3]) {
			System.out.print(data +" - ");
		}
		System.out.println();
		System.out.println();
		
		//모든 데이터 출력
		for(String[] memb : blackPink) {
			for(String info : memb) {
				System.out.printf("| %s ", info);
			}
			System.out.println();
		}
		
	}
}
