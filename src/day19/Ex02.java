package day19;

import java.util.ArrayList;

/*
 * 	Semo 클래스를 정의하고
 * ArrayList에 Semo 7개를 밑변과 높이를 랜덤하게 만들어서 기억시키고
 * 정렬해서
 * 출력하세요.
 */
public class Ex02 {

	public Ex02() {
		// TODO Auto-generated constructor stub
		ArrayList<Semo> semo_ArrayList = new ArrayList<Semo>();
		
		for(int i = 0; i < 7; i++) {
			int width = (int)(Math.random() * 20 + 1);
			int hight = (int)(Math.random() * 20 + 1);
			Semo semo = new Semo(width, hight);
			
			semo_ArrayList.add(semo);
		}
		
		int cnt = 1;
		System.out.println("<기본 데이터 출력>");
		for(Semo outSemo : semo_ArrayList) {
			System.out.println(cnt +"번째 삼각형");
			System.out.println(outSemo);
			cnt++;
		}
		System.out.println();
		
		for(int i = 0; i < semo_ArrayList.size() - 1; i++) {
			for(int j = i+1; j < semo_ArrayList.size(); j++) {
				double my_area = semo_ArrayList.get(i).getArea();
				double other_area = semo_ArrayList.get(j).getArea();
				
				if(my_area > other_area) {
					Semo tmpSemo = semo_ArrayList.get(i);
					semo_ArrayList.set(i, semo_ArrayList.get(j));
					semo_ArrayList.set(j, tmpSemo);
				}
			}
		}
		
		cnt = 1;
		System.out.println("<정렬 데이터 출력>");
		for(Semo outSemo : semo_ArrayList) {
			System.out.println(cnt +"번째 삼각형");
			System.out.println(outSemo);
			cnt++;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		new Ex02();
	}

}
