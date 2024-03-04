package day08;

public class Test10_toCharArray {
	public static void main(String[] args) {
		String jennie = "jennie";
		char[] names = jennie.toCharArray();
		
		for(char out : names) {
			System.out.print(out +" ");
		}
		System.out.println();
		
		//처음 n이 나오는 위치값 반환
		System.out.println(jennie.indexOf('n'));
	}
}
