package day17;
/*
 * 번호가 같으면 같은 학생으로 해서
 * 10명의 학생의 과목정보를 입력하고
 * 내용을 출력하세요.
 */
public class Test03_Equals {

	public Test03_Equals() {
		// TODO Auto-generated constructor stub
		Stud[] studs = new Stud[10];
		
		loop:
		for(int i = 0; i < studs.length; i++) {
			int no = (int)(Math.random() * 41 + 60);
			int kor = (int)(Math.random() * 41 + 60);
			int eng = (int)(Math.random() * 41 + 60);
			int math = (int)(Math.random() * 41 + 60);
			
			Stud stud = new Stud(no, kor, eng, math);
			
			for(int j = 0; j < i; j++) {
				Stud tmpStud = studs[j];
				if(stud.equals(tmpStud)) {
					i--;
					continue loop;
				}
			}
			studs[i] = stud;
		}
		
		for(Stud outStud : studs) {
			System.out.println(outStud);
		}
	}

	public static void main(String[] args) {
		new Test03_Equals();
	}
}

class Stud{
	private int no, kor, eng, math, total;
	private double avg;
	
	public Stud() {}
	public Stud(int no) {
		this.no = no;
	}
	
	public Stud(int no, int kor, int eng, int math) {
		this(no);	// 번호를 입력받는 생성자를 호출
					// 생성자 내부에서만 호출, 첫문장, 첫 명령으로만 활용 가능
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		
		setTotal();
		setAvg();
	}
	
//region GETTER/SETTER
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getTotal() {
		return total;
	}
	
	public void setTotal(int total) {
		this.total = total;
	}
	public void setTotal() {
		total = kor + eng + math;
	}
	
	public double getAvg() {
		return avg;
	}
	
	public void setAvg(double avg) {
		this.avg = avg;
	}
	public void setAvg() {
		avg = total / 3f;
	}
	
	@Override
	public boolean equals(Object o) {
		return no ==((Stud) o).getNo();
	}
	
	@Override
	public String toString() {
		return "번호 : " + no + ", 총점 : " + total +", 평균 : " + avg + "\n\t"
				+ "국어 : " + kor + ", 영어 : " + eng + ", 수학 : " + math;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException{
		/*
		 * 해당 클래스 내에는 clone()이 있다.
		 * 다른 클래스에서는 해당 클래스가 가진 clone() 사용할 수 없다.
		 * 해당 함수의 접근지정자가 protected이기 때문
		 * 함수의 접근지정자를 public으로 고쳐쓰면 다른 곳에서도 사용가능
		 * 
		 * 오버라이딩을 하는 순간 상위클래서가 가진 기능은 사라짐
		 * 	=> 해당 함수 내에서 자기 자신을 복제하는 기능을 구현 해야 함.
		 * 
		 * 하위클래스에서 상위 클래스의 멤버를 강제로 사용하기 위해서 super활용
		 */
		Object object = super.clone();
		
		return object;
	}
//endregion

}