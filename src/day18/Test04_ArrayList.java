package day18;

import java.util.ArrayList;

import static java.lang.Math.*;
public class Test04_ArrayList {

	public Test04_ArrayList() {
		// TODO Auto-generated constructor stub
		String[] nameStrings = {"제니", "리사", "로제", "지수"};
		
		// 멤버들의 정보를 기억하는 리스트를 만들어보시오
		ArrayList list = new ArrayList();
		
		// 4명의 정보를 리스트에 기억시키시오
		for(int i = 0; i < nameStrings.length; i++) {
			ArrayList eachArrayList = new ArrayList();	// 멤버 한명을 기억할 리스트
			
			//멤버 채우기
			list.add(eachArrayList);
		}
		
		for(int i = 0; i < nameStrings.length; i++) {
			// 이름 하나 꺼내기
			String nameString = nameStrings[i];
			// 멤버리스트에서 멤버 한명 정보 꺼내기
			ArrayList eArrayList = (ArrayList) list.get(i);
			
			// 꺼낸 멤버 정보 출력
			eArrayList.add(nameString);
		}
		
		//확인출력
		System.out.println(list);
		
		//점수 입력
		for(int i = 0; i < list.size(); i++) {
			//점수 만들기
			int score = (int)(random() * 41 + 60);
			//한명 정보 꺼내기
			ArrayList eArrayList = (ArrayList) list.get(i);
			eArrayList.add(score);
		}
		
		//점수 입력
		for(int i = 0; i < list.size(); i++) {
			//점수 만들기
			int score = (int)(random() * 41 + 60);
			//한명 정보 꺼내기
			ArrayList eArrayList = (ArrayList) list.get(i);
			eArrayList.add(score);
		}
		
		//점수 입력
		for(int i = 0; i < list.size(); i++) {
			// 점수 만들기
			int score = (int)(random() * 41 + 60);
			// 한명 정보 꺼내기
			ArrayList eArrayList = (ArrayList) list.get(i);
			eArrayList.add(score);
		}
		
		System.out.println(list);
		
		// 총점 입력
		for(int i = 0; i < list.size(); i++) {
			// 멤버 한명 정보 리스트 꺼내기
			ArrayList eArrayList = (ArrayList)list.get(i);
			
			// 총점 변수 만들기
			int total = 0;
			//반복해서 과목점수 모두 꺼내서 누적
			for(int j = 1; j < eArrayList.size(); j++) {
				int score = (int)eArrayList.get(j);
				total += score;
			}	
			eArrayList.add(total);
		}
		
		System.out.println(list);
		
		// 평균계산
		for(int i = 0; i < list.size(); i++) {
			ArrayList eArrayList = (ArrayList) list.get(i);
			int total = (int) eArrayList.get(4);
			double avg = total / 3f;
		
			eArrayList.add(avg);
		}
	
		System.out.println(list);
		
		// 순위추가
		for(int i = 0; i < list.size(); i++) {
			// 네명의 순위를 모두 1로 채워넣는다.
			ArrayList eArrayList = (ArrayList)list.get(i);
			eArrayList.add(1);
		}
		System.out.println(list);
		
		for(int i = 0; i < list.size(); i++) {
			ArrayList eArrayList = (ArrayList)list.get(i);
			
			// 총점 먼저 꺼내기
			int total = (int)eArrayList.get(4);
			// 순위 꺼내기
			int rank = (int)eArrayList.get(6);
			
			// 순위 계산
			for(int j = 0; j < list.size(); j++) {
				ArrayList eArrayList2 = (ArrayList)list.get(j);
				int ttl = (int)eArrayList2.get(4);
				if(total < ttl) {
					rank += 1;
				}
			}
			
			//순위 변경
			eArrayList.set(6, rank);
		}
		for(Object object : list) {
			System.out.println(object);
		}
		System.out.println();
		//정렬하기
		for(int i = 0; i < list.size(); i++) {
			for(int j = i+1; j < list.size(); j++) {
				ArrayList preArrayList = (ArrayList) list.get(i);
				ArrayList nextArrayList = (ArrayList) list.get(j);
				
				int pre_Rank = (int) preArrayList.get(6);
				int next_Rank = (int) nextArrayList.get(6);
				if(pre_Rank < next_Rank) {
					ArrayList tmpArrayList = preArrayList;
//					preArrayList = nextArrayList;
//					nextArrayList = tmpArrayList;
					list.set(i, nextArrayList);
					list.set(j, tmpArrayList);
				}
			}
		}
		
		for(Object object : list) {
			System.out.println(object);
		}
	}

	public static void main(String[] args) {
		new Test04_ArrayList();
	}

}
