package day09;

public class Test02_CircleArray {
/*
 * Circle 타입의 데이터를 5개 관리하는 배열을 만들어서
 * 정보를 출력해보자.
 */
	public static void main(String[] args) {
		Circle[] circle = new Circle[5];
		
		// 각 방에 Circle 클래스를 만들어서 채워넣는다.
		for(int i = 0; i < 5; i++) {
			int r = (int)(Math.random()*20 + 1);
			//클래스 만들기(원 만들기)
			Circle c = new Circle(r);
			//원의 둘레 세팅
			c.setArround();
			//원의 면적 세팅
			c.setArea();
			//배열의 각 방에 채워넣기
			circle[i] = c;
		}
		
		// 정보 출력
		for(int i = 0; i < circle.length; i++) {
			System.out.printf("%d번째 \n원의 반지름 : %d \n원의 둘레 : %.2f \n원의 넓이 : %.2f\n"
								,i+1 ,circle[i].rad, circle[i].arround, circle[i].area);
			System.out.println();
		}
	}

}
