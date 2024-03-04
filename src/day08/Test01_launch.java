package day08;

public class Test01_launch {
	public static void main(String[] args) {
		String[] menus = {"짜장면", "라멘", "돈까스", "김밥", 
							"햄버거", "치킨", "짬뽕", "수대국밥", "곰탕", "보쌈"};
		
		for(int i = 0; i < 5 ; i++) {
			int idx = (int)(Math.random()*10);
			String todayMenus = menus[idx];	
			System.out.println(todayMenus);
		}
		
//		ArrayList list = new ArrayList();
//		list.add("짜장면");
//		list.add("라멘");
//		list.add("돈까스");
//		list.add("김밥");
//		list.add("햄버거");
//		list.add("치킨");
//		list.add("짬뽕");
//		list.add("순대국밥");
//		list.add("곰탕");
//		list.add("보쌈");
//		
//		for(Object out : list) {
//			System.out.println((String)out);
//		}
	}
}
