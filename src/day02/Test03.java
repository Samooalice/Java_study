package day02;

/*
 * 제니의
 * 이름, 나이, 키, 성별, 전화번호를 기억할 변수를 만들어보자.
 */
public class Test03 {
	public static void main(String[] args) {
		//이름  변수
		String name;
		//성별 변수
		char gen;
		//키 변수
		double hight;
		//전화번호 변수
		String tel;
		//나이 변수
		int age;
		
		//변수 초기화
		//이름
		name = "제니";
		//성별
		gen = '여';
		//키
		hight = 163;
		//전화번호
		tel = "010-1234-5678";
		//나이
		age = 28;
		
		//출력
		System.out.println("이름 : "+name);
		System.out.println("성별 : "+gen);
		System.out.println("나이 : "+age);
		System.out.println("키 : "+hight);
		System.out.println("전화번호 : "+tel);
		
	}
}
