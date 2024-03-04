package day10;

public class Student {
	String name;
	int ban;
	int no;	
	int kor;
	int eng;
	int math;
	int total;
	double avg;
	
	public Student(String name, int ban, int no) {
		this.name = name;
		this.ban = ban;
		this.no = no;
	}
	
	public Student(String name, int ban, int no, int kor, int eng, int math) {
		this(name, ban, no);
		/*
		 * this()
		 * 	=> 생성자함수는 여러개 정의 될 수 있고
		 * 		각 생성자의 기능은 비슷할 수 있다.
		 * 		생성자는 원직적으로 일반함수처럼 호출해서 쓸 수 없지만,
		 * 		유일하게 생성자를 호출할 수 있는 방법 : this()
		 * 
		 * ***중요***
		 * 	=> 반드시 생성자의 첫번째에서 호출해야 함
		 * 		생성자 내에서만 호출할 수 있음
		 */
		
//		this.name = name;
//		this.ban = ban;
//		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		
		setTotal();
		setAvg();
	}
//	public void setScore(int kor, int eng, int math) {
//		this.kor = kor;
//		this.eng = eng;
//		this.math = math;
//		
//		setTotal();
//		setAvg();
//	}
	public void toPrint() {
		System.out.printf("%d반 %d번 이름 : %s\n"
				+ "국어 점수 : %3d\n"
				+ "영어 점수 : %3d\n"
				+ "수학 점수 : %3d\n"
				+ " == 총점 : %3d ==\n"
				+ " == 평균 : %3.2f ==\n", this.ban, this.no, this.name, 
											this.kor, this.eng, this.math,
												this.total, this.avg);
		System.out.println();
	}
	
	public void setTotal() {
		this.total = this.kor + this.eng + this.math;
	}
	
	public void setAvg() {
		this.avg = this.total / 3f;
	}
}
