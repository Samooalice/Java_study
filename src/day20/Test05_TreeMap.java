package day20;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;

public class Test05_TreeMap {

	public Test05_TreeMap() {
		// TODO Auto-generated constructor stub
		Nemo n1 = new Nemo(1, 2);
		Nemo n2 = new Nemo(3, 4);
		
		TreeMap map = new TreeMap(new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
				return ((Nemo) o1).getWidth() - ((Nemo) o2).getWidth();
			}
		});
		map.put(n1, "(1, 2)");
		map.put(n2, "(3, 4)");
		
		//꺼내서 출력하기
		Set set = map.keySet();
		ArrayList list = new ArrayList(set);
		for(int i = 0; i < list.size(); i++) {
			Object key_Object = list.get(i);
			Nemo nemo = (Nemo) key_Object;
			String valueString = (String) map.get(nemo);
			
			System.out.println(nemo + "\n-------------------------\n데이터 : " + valueString);
			System.out.println("###########################################################");
		}
	}

	public static void main(String[] args) {
		new Test05_TreeMap();
	}

}
