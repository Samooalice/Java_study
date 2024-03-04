package day08;

public class Test02_array {
	public static void main(String[] args) {
		char[] ch = new char[10];
		
		for(char c : ch) {
			System.out.print((int)c +" | ");
		}
		
		System.out.println();
		
		int i = 0;
		while (i < ch.length) {
			System.out.print((int) ch[i]+" | ");
			i++;
		}
	}

}
