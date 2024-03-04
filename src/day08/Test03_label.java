package day08;

public class Test03_label {
	public static void main(String[] args) {
		loop: // <== 레이블
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 5; j++) {
				if(j == 3) {
					continue loop;
				}
			}
		}
	
		
	}
}
