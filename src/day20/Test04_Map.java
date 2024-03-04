package day20;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;

/*	Map
 * 		=> 데이터를 기억할때, 기억할 키값과 한쌍으로 만들어서
 * 			데이터를 기억하는 컬렉션
 * 
 * 			사용할 경우에는 키값을 이용해서 데이터를 꺼낼 수 있음.
 * 			키값을 활용하기에 많은 데이터 보다는 소수의 데이터를 손쉽게 구분할 목적
 * 
 * 			HashTable은 HashMap의 구버전
 * 			키값을 활용해서 데이터를 정렬 보관한다.
 * 
 * 		put(Object key, Object value) : 키값 - 데이터로 넣기
 * 		get(Object key) 			  : 키값의 데이터를 꺼내기
 * 		values() 					  : 데이터만 꺼내서 사용할 수 있다
 * 		keys() 						  : 키값만 꺼재누는 함수
 * 			ㄴ keys로 꺼낸 데이터는 Enumeration으로 반환
 * 				Enumeration은 Iterator의 구버전으로 사용법이 비슷하고, 순차적으로 데이터를
 * 				꺼낼 수 있다.
 * 
 * 		키값 꺼내는 함수
 * 		HashTable
 * 			keys()
 * 			keysey()
 * 		HashMap
 * 			keySet()
 * 
 * 		entrySet()
 * 			=> Map은 반드시 키값을 알아야 데이터를 꺼낼 수 있음 
 * 				이 함수는 키값과 데이터를 VO에 담아서 Set으로 반환해주는 함수
 * 				하지만, Set에는 오직 한개의 데이터씩만 저장 가능
 * 				때문에 키값과 데이터를 기억시킨 후, VO를 만들어서
 * 				VO에 키값과 데이터를 저장시킨 후, Set에 저장해서 Set으로 반환
 * 		
 * 		TreeMap
 * 			=> TreeSet과 마찬가지로 정렬하면서 데이터 저장
 */
public class Test04_Map {

	public Test04_Map() {
		// TODO Auto-generated constructor stub
		Hashtable map_Hashtable = new Hashtable();
		map_Hashtable.put("제니", 28);
		map_Hashtable.put("리사", 26);
		map_Hashtable.put("로제", 27);
		map_Hashtable.put("수지", 29);
		
		//제니 꺼내서 출력
		int jennie = (int) map_Hashtable.get("제니");
		System.out.println(jennie);
		
		//키값들만 추출해서 모든 데이터 출력
		Enumeration en_umeration = map_Hashtable.keys();
		while (en_umeration.hasMoreElements()) {
			Object object = en_umeration.nextElement();
			String keyString = (String) object;
			Object data_Object = map_Hashtable.get(keyString);
			
			System.out.println(keyString +" - "+ data_Object);
		}
		System.out.println();
		
		System.out.println("keySet => ArrayList");
		
		Set set = map_Hashtable.keySet();
		ArrayList keysArrayList = new ArrayList(set);
		for(int i = 0; i < keysArrayList.size(); i++) {
			Object key_Object = keysArrayList.get(i);
			String key_String = (String) key_Object;
			int value = (int)map_Hashtable.get(key_Object);
			
			System.out.println(key_String +" - "+ value);
		}
		
//		Set eSet = map_Hashtable.entrySet();
//		ArrayList list = new ArrayList(eSet);
//		for(int i = 0; i < list.size(); i++) {
//			
//		}
	}

	public static void main(String[] args) {
		new Test04_Map();
	}

}
