package day06;

/*
 * 1 ~ 10까지의 숫자를 랜덤하게 10 만들어서
 * 배열에 기억시키세요.
 * 단, 중복된 숫자는 없습니다.
 */
public class Test05_search {
	public static void main(String[] args) {
		int[] array = new int[10];
		
		loop:
		for(int i = 0; i < array.length; i++) {
			int no = (int)(Math.random() * (10 - 1 + 1) + 1);
			for(int j = 0; j < i; j++) {
				int before = array[j];
				if( before == no ) {
					i--;
					continue loop;
				}
			}
			array[i] = no;
		}
		
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] +" ");
		}
		
		System.out.println();
		
		for(int i = 0; i < array.length-1; i++) {
			for(int j = i+1; j < array.length ; j++) {
				if(array[i] > array[j]) {
					int tmp = array[i];
					array[i] = array[j];
					array[j] = tmp;
				}
			}
		}
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] +" ");
		}
	}
}

