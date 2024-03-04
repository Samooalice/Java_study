package day05;
/*
 * *****
 * *****
 * *****
 * *****
 * *****
 */
public class Test01_for_star {
	public static void main(String[] args) {
		for(int i = 0; i < 5; i++){
			for(int j = 0; j < 5; j++){
				if(j == i){
					System.out.print(" ");
				}
				System.out.printf("*");
			}
			System.out.println();
		}
	}
}
