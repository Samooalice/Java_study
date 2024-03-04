package day20;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

import org.omg.CORBA.PUBLIC_MEMBER;

public class Test03_TreeSet {

	public Test03_TreeSet() {
		// TODO Auto-generated constructor stub
		TreeSet set = new TreeSet(new Comparator() {
			//TreeSet은 정렬이 안되면 넣을 수 없음
			//생성과 동시에 정렬 기준을 정해줌
			@Override
			public int compare(Object o1, Object o2) {
				return ((Nemo) o1).getArea() - ((Nemo) o2).getArea();
			}
		});
		
		Nemo nemo = new Nemo(5, 10);
		set.add(nemo);
		set.add(new Nemo(4, 8));
		
		Iterator iterator = set.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
			
		}
	}

	public static void main(String[] args) {
		new Test03_TreeSet();
	}

}
