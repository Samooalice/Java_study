package day18;

import java.util.ArrayList;
import java.util.Vector;

public class ArrayList_Prac {

	public ArrayList_Prac() {
		// TODO Auto-generated constructor stub
		String[] nameStrings = {"a", "b", "c", "d"};
		
		ArrayList arrayList = new ArrayList();
		System.out.println("size : " +arrayList.size());
//		arrayList.add(1);
		System.out.println("list contents : " +arrayList);
		System.out.println("size : " +arrayList.size());
		
		for(int i = 0; i < 4; i++) {
			ArrayList eArrayList = new ArrayList();
			
			arrayList.add(eArrayList);
		}
		
		System.out.println(arrayList);
		
		for(int i = 0; i < arrayList.size(); i++) {
			String nameString = nameStrings[i];
			ArrayList testArrayList = (ArrayList)arrayList.get(i);
			
			testArrayList.add(nameString);
		}
		
		System.out.println(arrayList);
	}

	public static void main(String[] args) {
		new ArrayList_Prac();
	}

}
