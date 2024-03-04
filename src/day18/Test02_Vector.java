package day18;
import java.util.*;
//import static java.lang.Math.*;
/*	package와 import
 * 		package
 * 			자바프로그램 소스코드가 들어있는 폴더
 * 			오픈소스인 자바에서 자신의 프로그램을 자유롭게 배포가능
 * 			공유된 소스를 활용시 겹치는 부분을 보완하기 위한 폴더 역할			
 * 
 * 		import
 * 			자신이 사용할 클래스가 어느 위치에 있는 클래스인지
 * 			밝혀주는 명령
 * 				import a.ab.*;
 * 				new a.ab.AB();
 * 
 * 			static import : static멤버는 임포트 하지 않아도 사용 가능함
 * 							대신 클래스 이름을 밝혀야 한다.
 * 								클래스이름.함수이름();
 * 							형태로 사용할 수 있음.
 * 							import static 패키지이름.클래스이름.*;
 * 							
 */
public class Test02_Vector {

	public Test02_Vector() {
		// TODO Auto-generated constructor stub
//		int no = (int)(random()*20 + 1);
//		double pi = PI;
		
		//blackpink멤버들의 이름을 벡터에 저장하기
		Vector vector = new Vector();
		
		vector.add("제니");
		vector.add("로제");
		vector.add("지수");
		
		System.out.println(vector);
		
		vector.add(0, "SMiTH");
		System.out.println(vector);
		
		vector.insertElementAt("choppa", 1);
		System.out.println(vector);
		
		//Vector내용을 List로 재생성
		ArrayList list = new ArrayList(vector);
		System.out.println("List : " + list);
		
		//강제 형변환은 가능
		Vector v1 = (Vector)((AbstractList)list);
}

	public static void main(String[] args) {
		new Test02_Vector();
	}

}
