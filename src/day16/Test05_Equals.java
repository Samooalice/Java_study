package day16;

public class Test05_Equals {

	public Test05_Equals() {
		// TODO Auto-generated constructor stub
		Box[] boxs = new Box[5];
		
		int cnt = 0;
		loop :
		for(int i = 0; i < boxs.length; i++ ) {
			int width = (int)(Math.random() * 10 + 1);
			int height = (int)(Math.random() * 10 + 1);
			
			Box box = new Box(width,height);
			System.out.println(++cnt + " 번째 시도");
			for(int j = 0; j < i; j++) {
				Box b1 = box;
				Box b2 = boxs[j];
				
				if(b1.equals(b2) == true) {
					i--;
					continue loop;
				}
			}
			boxs[i] = box;
		}
		
		for(Box outBox : boxs) {
			System.out.println("면적 : " + outBox.getArea());
		}
	}

	public static void main(String[] args) {
		new Test05_Equals();
	}

}
