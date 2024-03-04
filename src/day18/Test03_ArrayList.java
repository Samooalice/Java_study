package day18;

import java.util.ArrayList;

public class Test03_ArrayList {

	public Test03_ArrayList() {
		// TODO Auto-generated constructor stub
		// 블랙핑크 멤버를 ArrayList에 저장
		ArrayList list = new ArrayList();
		
		list.add("제니");
		list.add("로제");
		list.add("지수");
		
		System.out.println(list);
		System.out.println();
		
		list.add(1, "리사");
		System.out.println(list);
		System.out.println();
		
		list.add(0, "enus");
		list.add(0, "choppa");
		System.out.println(list);
		System.out.println();
		
		list.set(0, "쵸파");
		System.out.println(list);
		System.out.println();
	}

	public static void main(String[] args) {
		new Test03_ArrayList();
	}

}
