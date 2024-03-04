package day20;

import java.awt.List;
import java.util.ArrayList;
import java.util.Comparator;

public class Test02_Comparator {

	public Test02_Comparator() {
		// TODO Auto-generated constructor stub
		ArrayList nemo_ArrayList = new ArrayList();
		
		for(int i = 0; i < 10; i++) {
			Nemo nemo = new Nemo((int)(Math.random() * 20 + 1), (int)(Math.random() * 20 + 1));
			
			nemo_ArrayList.add(nemo);
		}
		
		System.out.println("세로 기준 오름차순 정렬");
		nemo_ArrayList.sort(new MyComp());
		
		for(Object outObject : nemo_ArrayList) {
			System.out.println(outObject);
		}
		
		System.out.println("가로 기준 오름차순 정렬");
		nemo_ArrayList.sort(new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
				int w1 = ((Nemo) o1).getWidth();
				int w2 = ((Nemo) o2).getWidth();
				return w1 - w2;
			}
			
		});
		for(Object outObject : nemo_ArrayList) {
			System.out.println(outObject);
		}
	}

	public static void main(String[] args) {
		new Test02_Comparator();
	}

}

class MyComp implements Comparator{
	//소트함수가 호출되면 자동으로 호출되는 함수
	@Override
	public int compare(Object o1, Object o2) {
		int h1 = ((Nemo) o1).getHight();
		int h2 = ((Nemo) o2).getHight();
		return h1 - h2;
	}
	
}