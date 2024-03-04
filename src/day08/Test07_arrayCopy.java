package day08;

import java.util.Arrays;

public class Test07_arrayCopy {
	public static void main(String[] args) {
		// 1~20까지 랜덤한 숫자 10개를 만들어서 배열에 기억시키시오.
		int[] num = new int[10];
		
		// 랜덤한 숫자로 채워보기
		for(int i = 0; i < num.length; i++) {
			int n = (int)(Math.random()*20 + 1);
			num[i] = n;
		}
		
		System.out.print("num : ");
		for(int out : num) {
			System.out.print(out +" | ");
		}
		System.out.println();
	
		//깊은 복사
		//1. 배열을 준비한다.
		int[] no = new int[5];
		System.arraycopy(num, 1, no, 0, 5);	//num배열의 1번째부터 no배열의 0번째부터 5개 복사한다.
		
		System.out.print("no : ");
		for(int out : no) {
			System.out.print(out +" | ");
		}
		
		num[2] = 100;
		System.out.println();
		
		System.out.print("num : ");
		for(int out : num) {
			System.out.print(out +" | ");
		}
		System.out.println();
		
		System.out.print("no : ");
		for(int out : no) {
			System.out.print(out +" | ");
		}
		System.out.println();
		
		int[] origin = {1, 2, 3, 4, 5};
		
		int[] copy_array = origin;
		
		System.out.println(Arrays.toString(origin));
		System.out.println(Arrays.toString(copy_array));
		
		origin[2] = 100;
		System.out.println(Arrays.toString(origin));
		System.out.println(Arrays.toString(copy_array));
	}
}
