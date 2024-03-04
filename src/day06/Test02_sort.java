package day06;

public class Test02_sort {
	public static void main(String[] args) {
		/*
		 * 오름차순 정렬하기
		 */
		
		int[] nos = {5, 2, 7, 3, 1, 9, 6, 8, 0, 4};
		System.out.print("정렬전 : ");
		
		for(int i : nos) {
			System.out.print(i +" ");
		}
		
		System.out.println();
		
		System.out.println("*** 선택 정렬 ***");
		for(int i = 0; i < nos.length-1; i++) {
			for(int j = i+1; j < nos.length; j++) {
				if(nos[i] > nos[j]) {
					int tmp = nos[j];
					nos[j] = nos[i];
					nos[i] =  tmp;
				}
			}
		}
		for(int i : nos) {
			System.out.print(i +" ");
		}
		
		System.out.println();
		
		System.out.println("*** 버블 정렬 ***");
		for(int i = 0; i < nos.length; i++) {
			for(int j = 0; j < nos.length-1; j++) {
				if(nos[j] > nos[j+1]) {
					int tmp = nos[j+1];
					nos[j+1] = nos[j];
					nos[j] =  tmp;
				}
			}
		}
		for(int i : nos) {
			System.out.print(i +" ");
		}
	}
}
