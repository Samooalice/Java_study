package day19;

import java.util.ArrayList;
import java.util.TreeSet;

public class Test04_TreeSet {

	public Test04_TreeSet() {
		// TODO Auto-generated constructor stub
		TreeSet set = new TreeSet();
		set.add("제니");
		set.add("로제");
		set.add("리사");
		set.add("지수");
		
		System.out.println(set);
		System.out.println();
		ArrayList list = new ArrayList(set);
		for(int i = 0; i < list.size(); i++) {
			System.out.println((String)list.get(i));
		}
		
//		set.add(1);
//		set.add(3.14);
		
		TreeSet set1 = new TreeSet();
		Circle circle = new Circle(20);
		set1.add(circle);
		set1.add(new Circle(20));
		set1.add(new Circle(5));
		set1.add(new Circle(5));
		set1.add(new Circle(5));
		set1.add(new Circle(10));
		//중복처리 + 정렬가능
		System.out.println(set1);
	}

	public static void main(String[] args) {
		new Test04_TreeSet();
	}

}
