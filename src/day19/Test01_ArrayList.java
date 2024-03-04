package day19;

import java.util.ArrayList;
import java.util.Random;

public class Test01_ArrayList {

	public Test01_ArrayList() {
		// TODO Auto-generated constructor stub
		ArrayList blackPinkArrayList = new ArrayList();
		
		ArrayList namesArrayList = new ArrayList();
		namesArrayList.add("제니");
		namesArrayList.add("리사");
		namesArrayList.add("로제");
		namesArrayList.add("지수");
		
		for(int i = 0; i < namesArrayList.size(); i++) {
			String nameString = (String) namesArrayList.get(i);
			Random random = new Random();
			int kor = random.nextInt(41) + 60;
			int eng = random.nextInt(41) + 60;
			int math = random.nextInt(41) + 60;
			
			BlackPink blackPink = new BlackPink(nameString, kor, eng, math);
			blackPinkArrayList.add(blackPink);
		}
		
		System.out.println("1차 데이터 출력물 : ");
		for(int i = 0; i < blackPinkArrayList.size(); i++) {
//			BlackPink blackPink = (BlackPink) blackPinkArrayList.get(i);
			Object blackPink_O = blackPinkArrayList.get(i);
			System.out.println(blackPink_O);
		}
		System.out.println();
		
		//순위
		for(int i = 0; i < blackPinkArrayList.size(); i++) {
			BlackPink membBlackPink = (BlackPink) blackPinkArrayList.get(i);
			membBlackPink.setRank(1);
			
			for(int j = 0; j < blackPinkArrayList.size(); j++) {
				BlackPink nextBlackPink = (BlackPink) blackPinkArrayList.get(j);
				// 다른멤버 총점
				int chong = nextBlackPink.getTotal();
				// 본인 총점
				int total = membBlackPink.getTotal();
				
				if(total < chong) {
					int rank = membBlackPink.getRank();
					membBlackPink.setRank(rank + 1);
				}
			}
		}
		
		System.out.println("순위 데이터 추가 출력물 : ");
		for(int i = 0; i < blackPinkArrayList.size(); i++) {
//			BlackPink blackPink = (BlackPink) blackPinkArrayList.get(i);
			Object blackPink_O = blackPinkArrayList.get(i);
			System.out.println(blackPink_O);
		}
		System.out.println();
		
		//정렬하기
		for(int i = 0; i < blackPinkArrayList.size() - 1; i++) {
			for(int j = i+1; j < blackPinkArrayList.size(); j++) {
				int me = (int)((BlackPink)blackPinkArrayList.get(i)).getRank();
				int nam = (int)((BlackPink)blackPinkArrayList.get(j)).getRank();
				
				if(me > nam) {
					BlackPink tmpBlackPink = (BlackPink)blackPinkArrayList.get(i);
					blackPinkArrayList.set(i, blackPinkArrayList.get(j));
					blackPinkArrayList.set(j, tmpBlackPink);
				}
			}
		}
		
		System.out.println("순위 정렬 출력물 : ");
		for(int i = 0; i < blackPinkArrayList.size(); i++) {
//			BlackPink blackPink = (BlackPink) blackPinkArrayList.get(i);
			Object blackPink_O = blackPinkArrayList.get(i);
			System.out.println(blackPink_O);
		}
	}

	public static void main(String[] args) {
		new Test01_ArrayList();
	}

}
