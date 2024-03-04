package day10;

/*	문제
 * 1. 다음 변수를 가지는 Student 클래스를 제작하세요.
 * 		String name;
 * 		int ban;
 * 		int no;	
 *		int kor;
 *		int eng;
 *		int math;
 *		int totla;
 *		double avg;
 *
 * 2. 세 과목의 점수가 결정되면 점수들을 이용해서
 * 		총점과 평균을 계산해서 세팅해주는 함수 제작
 * 
 * 3. 만든 클래스를 객체로 만들 수 있는 생성자를 정의
 * 	1) [이름, 반, 번호]를 통해서 객체 만들기
 * 
 * 	2) [이름, 반, 번호, 각 과목점수]를 통해서 객체 만들기
 * 
 * 	2+) [이름, 반, 번호, 각 과목점수]를 주면 총점과 평균도 같이 세팅
 *
 * 4. names 배열에 기억되어있는 이름들을 통해서
 * 		5명의 데이터를 기억하는 배열을 만들고
 * 		정보를 출력하시오.
 * 		(반 : 1반 / 번호 : 1번부터 증가하는 숫자 / 점수 : 랜덤하게 60~100 사이로)
 * 
 */
public class Ex02_OOP {
	final static int STUDENTS = 5;
	
	public Ex02_OOP() {
		//실행될 내용
		String[] names = {"제니", "리사", "로제", "지수", "광섭"};
		
		Student[] stud = new Student[STUDENTS];
		
		for(int i = 0; i < stud.length; i++) {
			Student student = new Student(names[i], 1, i+1, (int)(Math.random() * (100 - 60 + 1) + 60),
					(int)(Math.random() * (100 - 60 + 1) + 60), (int)(Math.random() * (100 - 60 + 1) + 60));
			
			stud[i] = student;
		}
		
		for(Student out : stud) {
			out.toPrint();
		}
//		for(int i = 0; i < STUDENTS; i++) {
//			System.out.printf("%d반 %d번 이름 : %s\n"
//								+ "국어 점수 : %3d\n"
//								+ "영어 점수 : %3d\n"
//								+ "수학 점수 : %3d\n"
//								+ " == 총점 : %3d ==\n"
//								+ " == 평균 : %3.2f ==\n", stud[i].ban, stud[i].no, stud[i].name, 
//														stud[i].kor, stud[i].eng, stud[i].math,
//														stud[i].total, stud[i].avg);
//			System.out.println();
//		}
	}
	
	public static void main(String[] args) {
		new Ex02_OOP();
	}

}
