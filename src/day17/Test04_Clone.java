package day17;
/*
 * Object 클래스의 멤버 함수
 * 		toString();
 * 		equals();
 * 
 * 		clone() : 객체 자기자신을 깊은복사 해주는 함수
 * 					해당함수는 protected 함수이기에
 * 					상속받은 클래스나, 같은 패키지 내에서는 사용할 수 있다.
 * 		hashCode() : 자바는 주소를 노출시키지 않기 위해서
 * 						해쉬테이블을 이용해서 주소를 관리함.
 * 						그 해쉬코드를 반환해주는 기능의 함수
 */
public class Test04_Clone {

	public Test04_Clone() {
		// TODO Auto-generated constructor stub
		Stud stud = new Stud(1, 90, 90, 90);
		
		Stud s1 = null;
		
		try {
			s1 = (Stud) stud.clone();
		} catch (CloneNotSupportedException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(stud.hashCode());
		System.out.println(stud);
		System.out.println(s1.hashCode());
		System.out.println(s1);
	}

	public static void main(String[] args) {
		new Test04_Clone();
	}

}
