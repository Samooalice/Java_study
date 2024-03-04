package day10;
import java.util.*;
/*
 * 가로와 세로를 입력받아서
 * 사각형의 넓이를 계산해서 출력해주는 프로그램을 작성
 * 각 기능은 함수를 활용
 */

public class Ex01_Method {
	Scanner scanner;
	int width, height, area;
	public static void main(String[] args) {
		Ex01_Method t1 = new Ex01_Method();
		
		t1.setLen();
		t1.toPrint();
	}

	public Ex01_Method() {
		scanner = new Scanner(System.in);
	}
	
	public void setLen() {
		System.out.print("밑변을 입력해 주세요 : ");
		this.width = scanner.nextInt();
		
		System.out.print("높이를 입력해 주세요 : ");
		this.height = scanner.nextInt();
		
		scanner.close();
	}
	
	public void setArea() {
		this.area = this.width * this.height;
	}
	
	public void toPrint() {
		setArea();
		System.out.printf("가로 : %2d\n"
						+ "세로 : %2d\n"
						+ "넓이 : %2d\n", width, height, area);
	}
	
	
	
	
}
