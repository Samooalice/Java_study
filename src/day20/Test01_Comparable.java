package day20;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

public class Test01_Comparable {

	public Test01_Comparable() {
		// TODO Auto-generated constructor stub
		ArrayList<String> nameStrings = new ArrayList<String>();
		nameStrings.add("쵸파");
		nameStrings.add("루피");
		nameStrings.add("조로");
		nameStrings.add("우솝");
		nameStrings.add("나미");
		nameStrings.add("상디");
		nameStrings.add("로빈");
		nameStrings.add("보아핸콕");
		
		ArrayList list = new ArrayList();
		
		for(int i = 0; i < nameStrings.size(); i++) {
			String nameString = nameStrings.get(i);
			Stud stud = new Stud(nameString, i+1, (int)(Math.random() * 41 + 60));
			
			list.add(stud);
		}
		
		for(Object outObject : list) {
			System.out.println(outObject);
		}
		System.out.println();
		
		//list를 TreeSet으로 변환
		TreeSet set = new TreeSet();
		for(int i = 0; i < nameStrings.size(); i++) {
			String nameString = nameStrings.get(i);
			Stud stud = new Stud(nameString, i+1, (int)(Math.random() * 41 + 60));
			
			set.add(stud);
		}
		
		Iterator set_Iterator = set.iterator();
		while (set_Iterator.hasNext()) {
			System.out.println(set_Iterator.next());
		}
	}

	public static void main(String[] args) {
		new Test01_Comparable();
	}
}
