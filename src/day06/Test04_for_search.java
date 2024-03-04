package day06;

public class Test04_for_search {
	public static void main(String[] args) {
		int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		int target = 7;
		int result = -1;
		
		for(int i = 0; i<nums.length; i++) {
			int no = nums[i];
			if(no == target){
				result = i;
				break;
			}
		}
		System.out.printf("찾는숫자 %d는 인덱스 %d에 있습니다\n", target, result);
		
	}
}
