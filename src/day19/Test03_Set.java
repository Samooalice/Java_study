package day19;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Test03_Set {

	public Test03_Set() {
		// TODO Auto-generated constructor stub
		HashSet set = new HashSet();
		set.add(new Circle(5));
		set.add(new Circle(10));
		set.add(new Circle(10));
		set.add(new Circle(3));
		set.add(new Circle(5));
		
		Iterator itor = set.iterator();
		while (itor.hasNext()) {
			Object object = itor.next();
			Circle circle = (Circle) object;
			
			System.out.printf("반지름 : %3d\n"
								+ "둘레 : %5.2f\n"
								+ "넓이 : %5.2f\n\n",circle.getRad(), circle.getArround(), circle.getArea() );
		}
		
		//ArrayList로 꺼내서 출력하기
		ArrayList list = new ArrayList(set);
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

	public static void main(String[] args) {
		new Test03_Set();
	}

}
