package day19;

import java.util.ArrayList;

/*	ArrayList 문제
 *  ArrayLIst에 BlackPink 멤버들의 정보를 기억시키시오
 *  단, 리스트에 채우는 인스턴스는 기본 생성자를 사용하세요.
 */
public class Ex01 {

	public Ex01() {
		// TODO Auto-generated constructor stub
		ArrayList<BlackPink> blackPink_ArrayList = new ArrayList<BlackPink>();
		ArrayList<String> names_ArrayList = new ArrayList<String>();
		
		names_ArrayList.add("제니");
		names_ArrayList.add("리사");
		names_ArrayList.add("로제");
		names_ArrayList.add("지수");
		
		for(int i = 0; i < names_ArrayList.size(); i++) {
			BlackPink blackPink_Class = new BlackPink();
			blackPink_ArrayList.add(blackPink_Class);
			
			blackPink_Class.setName(names_ArrayList.get(i));
			blackPink_Class.setKor((int)(Math.random() * 41 + 60));
			blackPink_Class.setEng((int)(Math.random() * 41 + 60));
			blackPink_Class.setMath((int)(Math.random() * 41 + 60));
			blackPink_Class.setTotal();
			blackPink_Class.setAvg();
			blackPink_Class.setRank(1);
		}
		
		System.out.println("1차 데이터 확인 : ");
		for(BlackPink outBlackPink : blackPink_ArrayList) {
			System.out.println(outBlackPink);
		}
		System.out.println();
		
		for(int i = 0; i < blackPink_ArrayList.size(); i++) {
			for(int j = 0; j < blackPink_ArrayList.size(); j++) {
				if(blackPink_ArrayList.get(i).getTotal() < blackPink_ArrayList.get(j).getTotal()) {
					blackPink_ArrayList.get(i).setRank(blackPink_ArrayList.get(i).getRank() + 1);
				}
			}
		}
		
		System.out.println("순위 데이터 확인 : ");
		for(BlackPink outBlackPink : blackPink_ArrayList) {
			System.out.println(outBlackPink);
		}
		System.out.println();
		
		for(int i = 0; i < blackPink_ArrayList.size() - 1; i++) {
			for(int j = i+1; j < blackPink_ArrayList.size(); j++) {
				int my_rank = blackPink_ArrayList.get(i).getRank();
				int other_rank = blackPink_ArrayList.get(j).getRank();
				
				if(my_rank > other_rank) {
					BlackPink tmp = blackPink_ArrayList.get(i);
					blackPink_ArrayList.set(i, blackPink_ArrayList.get(j));
					blackPink_ArrayList.set(j, tmp);
				}
			}
		}
		
		System.out.println("순위 정렬 데이터 확인 : ");
		for(BlackPink outBlackPink : blackPink_ArrayList) {
			System.out.println(outBlackPink);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		new Ex01();
	}

}
