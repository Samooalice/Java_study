package day03;

public class Test08 {
	public static void main(String[] args) {
		int no1 = 10;
		int no2 = 10;
		
		boolean result = (no1++ > no2) & (++no1 > no2);
		
		System.out.println("(no1++ > no2) & (++no1 > no2) : "+ result);
		System.out.println("no1 : "+ no1);
		
		int no3 = 10;
		int no4 = 10;
		
		boolean result1 = (no3++ > no4) && (++no3 > no4);
		
		System.out.println("(no3++ > no4) && (++no3 > no4) : "+ result1);
		System.out.println("no3 : "+ no3);
	}
}
