package day19;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*	Set 계열
 * 		1. 입력순서를 보장하지 않음.
 * 		2. 중복데이터를 허용하지 않음.
 * 
 * 		==> 데이터를 기억할 때, 자기자신의 규칙을 가지고
 * 			입력데이터를 정렬해서 기억함.
 * 			정렬한 위치는 알려주지 않기 때문에 데이터를 꺼낼 수 있는 방법이 없다.
 * 			데이터를 꺼내기 위해서는 다른 형태로 변환시켜서 꺼내야 한다.
 * 
 * 		종류
 * 			1. HashSet
 * 				-> HashCode를 이용해서 데이터를 정렬 및 보관
 * 					사용자가 생각하는 정렬로 이루어져있지 않음.
 * 				[생성자]
 * 					HashSet(int initialCapacity, float loadFactor)
 * 
 * 			2. TreeSet
 * 				-> 내부적으로 Tree Sort 라는 알고리즘을 활용하여 데이터를 정렬 및 보관
 * 					사용자가 생각하는 정렬 형태 / 정렬되지 않은 데이터는 입력할 수 없음
 * 
 * 				[생성자]
 * 					TreeSet(Comparator comparator)
 * 						==> 정렬방식을 정해서 생성하는 방식
 * 
 * 					TreeSet(SortedSet<E> s)
 * 						==> 정렬이 되어있는 트리셋을 이용해서 다시 TreeSet을 만드는 방법
 * 
 * 		참고함수
 * 			1. SubSet()
 * 				==> 하나의 Set에 담긴 내용 중에서 특정 부분만 골라서 새로운 Set을 만드는 방법
 * 			2. HadSet(E toElement)
 * 				==> 처음부터 지정한 부분까지 골라서 새로운 Set을 만드는 방법
 * 			3. tailSet(E fromElement)
 * 				==> 지정한 부분부터 끝까지 꺼내서 새로운 Set을 만드는 방법
 */
public class Test02_Set {

	public Test02_Set() {
		// TODO Auto-generated constructor stub
		HashSet set = new HashSet();
		set.add("제니");
		set.add("리사");
		set.add("로제");
		set.add("지수");
		
		System.out.println(set);
		System.out.println();
		
		//Iterator : 버퍼메모리에 기억되고 꺼내는 순간 삭제 되는 타입
		Iterator itor = set.iterator();
		
		while (itor.hasNext()) {
			Object object = itor.next();
			String nameString = (String) object;
			System.out.println(nameString);
		}
		
		System.out.println();
		ArrayList list = new ArrayList(set);
		for(int i = 0; i < list.size(); i++) {
			System.out.println((String)list.get(i));
		}
		
		
		
	}

	public static void main(String[] args) {
		new Test02_Set();
	}

}
