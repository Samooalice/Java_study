package day20;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

/*
 * 학생들의 이름, 국어, 영어, 수학, 총점, 평균을 기억할 VO클래스
 * Student클래스 제작 
 * TreeMap에 학생의 이름을 키값으로 하고
 * 해당학생의 Student 객체를 데이터로 하는 Map을 완성해서
 * 출력하시오
 * 
 * 출력할때는 키값들을 모두 꺼내서 출력하는 방법으로 처리하시오.(keySet함수 활용)
 */
public class Ex01 {

	public Ex01() {
		// TODO Auto-generated constructor stub
		String nameString_1 = "철수";
		String nameString_2 = "영이";
		Studnet studnet_1 = new Studnet(nameString_1, 80, 30, 10);
		Studnet studnet_2 = new Studnet(nameString_2, 82, 32, 12);
		
		TreeMap stu_TreeMap = new TreeMap();
		stu_TreeMap.put(nameString_1, studnet_1);
		stu_TreeMap.put(nameString_2, studnet_2);
		
		Set keySet = stu_TreeMap.keySet();
		ArrayList key_ArrayList = new ArrayList(keySet);
		for(int i = 0; i < key_ArrayList.size(); i++) {
			Object key_Object = key_ArrayList.get(i);
			Studnet vlaue_Studnet = (Studnet)stu_TreeMap.get(key_Object);
			
			System.out.println(key_Object +" -  "+ vlaue_Studnet);
			System.out.println();
		}
		System.out.println("####################################");
		System.out.println("Iterator 활용");
		Iterator iterator = stu_TreeMap.keySet().iterator();
		while (iterator.hasNext()) {
			Object key_Object = iterator.next();
			String keyString = (String) key_Object;
			Studnet value_Studnet = (Studnet)stu_TreeMap.get(key_Object);
			
			System.out.println(keyString +" - "+ value_Studnet );
		}
	}

	public static void main(String[] args) {
		new Ex01();
	}

}
