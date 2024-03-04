package day09;
/*	[문제]
 * Student 클래스를 이용해서
 * 5명의 점수를 관리할 예정이다.
 * 배열로 만들어서 결과를 출력하세요.
 */
public class Ex01_stud {

	public static void main(String[] args) {
		Student[] stu = new Student[5];
		String[] name = {"철수", "영희", "맹구", "짱구", "희철"};
		for(int i = 0; i < stu.length; i++) {
			int kor = (int)(Math.random() * (100 - 60 + 1) + 60);
			int math = (int)(Math.random() * (100 - 60 + 1) + 60);
			int eng = (int)(Math.random() * (100 - 60 + 1) + 60);
			Student st = new Student(kor, math, eng);
			
			stu[i] = st;
		}
		
		for(int i = 0; i < stu.length; i++) {
			System.out.printf("[ %s ] 학생 정보\n"
							+ "국어 : %2d\n"
							+ "영어 : %2d\n"
							+ "수학 : %2d\n"
							+ "총점 : %2d\n"
							+ "평균 : %.2f\n", name[i], stu[i].kor, stu[i].eng, stu[i].math, stu[i].total, stu[i].avg);
			System.out.println();
		}
	}

}
