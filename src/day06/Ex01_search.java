package day06;
import java.util.*;

/*
 * 25부터 34까지의 수를 기억하는 배열 nums에서
 * 30의 위치를 검색해서 출력하세요.
 * 
 * + 찾을 숫자를 입력받아서
 * 		위치값을 찾으시오
 * 
 * ++ 25 ~ 34를 중복없이 임이로 배열에 채워서
 * 		찾을 숫자를 입력 받아서
 * 		위치값을 찾는 프로그램을 작성하시오.
 */
public class Ex01_search {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
//region <시작문제 ~ +문제>
		int[] nums = new int[10];
		int first_num = 25;
		
		System.out.print("찾을 데이터를 적어주세요 : ");
		int target = scanner.nextInt();
		
		for(int i = 0; i<nums.length; i++) {
			nums[i] = first_num;
			first_num++;
			System.out.print(nums[i] +" ");
			}
		
		System.out.println();
		
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] == target) {
				System.out.printf("찾는 숫자 %d는 인덱스 %d에 있습니다.\n", target, i);
				break;
			}
			if(nums[i] != target && i == nums.length-1) {
				System.out.printf("해당 숫자는 인덱스에 없습니다.\n");
			}
		}
		
		System.out.println();
//endregion
		
//region <++문제>
		int[] ran_num = new int[10];
		System.out.print("찾을 데이터를 적어주세요 : ");
		int ran_target = scanner.nextInt();
		
		loop:
		for(int i = 0; i < ran_num.length; i++) {
			ran_num[i] = (int)(Math.random() * (34 - 25 + 1) + 25);
			if(i == 0) continue;
			
			for(int j = 0; j < i; j++) {
				if(ran_num[i] == ran_num[j]) {
					ran_num[i] = (int)(Math.random() * (34 - 25 + 1) + 25);
					i--;
					continue loop;
				}
			}
		}
		System.out.print("정렬 이전 : ");
		for(int i = 0; i < ran_num.length; i++) {
			System.out.print(ran_num[i] +" ");
		}
		System.out.println();
		
		for(int i = 0; i < ran_num.length-1; i++) {
			for(int j = i+1; j < ran_num.length; j++)
				if(ran_num[i] > ran_num[j]) {
					int tmp = ran_num[i];
					ran_num[i] = ran_num[j];
					ran_num[j] = tmp;
				}
		}
		
		System.out.print("정렬 이후 : ");
		for(int i = 0; i < ran_num.length; i++) {
			System.out.print(ran_num[i] +" ");
		}
		System.out.println();
		
		for(int i = 0; i < ran_num.length; i++) {
			if(ran_num[i] == ran_target) {
				System.out.printf("찾는 숫자 %d는 인덱스 %d에 있습니다.\n", target, i);
				break;
			}
			if(ran_num[i] != ran_target && i == ran_num.length-1) {
				System.out.printf("해당 숫자는 인덱스에 없습니다.");
			}
		}
//endregion
	}
}
