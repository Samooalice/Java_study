package day06;
import java.util.*;
import java.util.Arrays;

public class Test07_binarySearch {

	public static void main(String[] args) {
		/*
		 * 이진탐색(Binary Search)
		 * 	- 정렬된 자료구조에서 사용할 수 있는 알고리즘
		 *  - 순차 탐색보다 효율적인 방법
		 */
		Scanner scanner = new Scanner(System.in);
		int[] num = new int[10];
		
		for(int i = 0; i < num.length; i++) {
			num[i] = i + 1;
		}
		System.out.print("정렬된 배열 : ");
		for(int data : num) {
			System.out.printf("%d ", data);
		}
		System.out.println();
		
		System.out.print("찾을 숫자를 입력해 주세요 : ");
		int target = scanner.nextInt();
		
		int start = 0;
		int end = 9;
		int result = -1;
		int cnt = 0;
		
		for(;;) {
			int mid = (start + end) / 2;
			int no = num[mid];
			cnt ++;
			if(target > no) {
				start = mid + 1;
			} else if(target < no) {
				end = mid - 1;
			} else {
				result = mid;
				break;
			}
		}
		
		System.out.printf("%d의 위치는 %d 입니다. \n실행된 횟수는 %d번 입니다.", target, result, cnt);
		
	}	
}
