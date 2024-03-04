package day09;
/*	1.
 * 	 다섯 학생들의
 * 	 국어, 영어, 수학, 총점
 * 	 관리할 배열을 만들고
 * 
 * 	 데이터를 채워서
 * 	 정보를 출력하세요.
 */

/*	2.
 * 	 위 배열을 깊은 복사해서 순위가 추가된
 * 	 배열을 만드시오.
 * 
 * 		국어 / 영어 / 수학 / 총점 / 순위
 */

/*	3.
 * 	 순위를 채워서
 * 	 오름차순 정렬하세요.
 */
public class Ex04_array {
	public static void main(String[] args) {
		int[][] stu_Array = new int[5][4];
		
		for(int i = 0; i < stu_Array.length; i++) {
			for(int j = 0; j < stu_Array[i].length-1; j++) {
				int score = (int)(Math.random() * (100 - 60 + 1) + 60);
				stu_Array[i][j] = score;
			}
		}
		
		for(int i = 0; i < stu_Array.length; i++) {
			for(int j = 0; j < stu_Array[i].length - 1; j++) {
				stu_Array[i][3] += stu_Array[i][j];
			}
		}
		
		//1번 테스트
//		System.out.println("1번 테스트");
//		for(int out : stu_Array[2]) {
//			System.out.print(out +" ");
//		}
		
		int[][] stu_Array_Rank = new int[5][5];
		
		for(int i = 0; i < stu_Array.length; i++) {
			System.arraycopy(stu_Array[i], 0, stu_Array_Rank[i], 0, stu_Array.length-1);
		}
		
		
		//2번 테스트
//		System.out.println("2번 테스트");
//		for(int out : stu_Array_Rank[2]) {
//			System.out.print(out +" ");
//		}
		
		for(int i = 0; i < stu_Array.length; i++) {
			for(int j = 0; j < stu_Array.length-1; j++) {
				if(stu_Array_Rank[j][3] < stu_Array_Rank[j+1][3]) {
					int[] tmp = stu_Array_Rank[j];
					stu_Array_Rank[j] = stu_Array_Rank[j+1];
					stu_Array_Rank[j+1] = tmp;
				}
			}
		}
		
		int cnt = 0;
		for(int i = 0; i < stu_Array_Rank.length; i++) {
			if(i != 0 && stu_Array_Rank[i][3] == stu_Array_Rank[i-1][3]) {
				stu_Array_Rank[i][4] = stu_Array_Rank[i-1][4];
				cnt++;
				continue;
			}
			stu_Array_Rank[i][4] = i+1 - cnt;
		}
		
		int[][] stu_Array_Rank_rev = new int[5][5];
		
		for(int i = 0; i < stu_Array_Rank_rev.length; i++) {
			for(int j = 0; j < stu_Array_Rank_rev.length; j++) {
				stu_Array_Rank_rev[j][i] = stu_Array_Rank[i][stu_Array_Rank.length-1 - j];
			}
		}
		
		for(int i = 0; i< stu_Array_Rank.length; i++) {
			for(int j = 0; j < stu_Array_Rank.length; j++) {
				System.out.print(stu_Array_Rank[i][j] +" "); 				
			}
			System.out.println();
		}
		
		System.out.println("-----리버스-----");
		for(int i = 0; i< stu_Array_Rank.length; i++) {
			for(int j = 0; j < stu_Array_Rank.length; j++) {
				System.out.printf("%3d ", stu_Array_Rank_rev[i][j]); 				
			}
			System.out.println();
		}
	}
}
