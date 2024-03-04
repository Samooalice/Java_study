package day20;

public class Studnet {
	private String name;
	private int kor, eng, math, total; 
	private double avg;
	
	public Studnet() {
		// TODO Auto-generated constructor stub
	}
	public Studnet(String name, int kor, int eng, int math) {
		// TODO Auto-generated constructor stub
		setName(name);
		setKor(kor);
		setEng(eng);
		setMath(math);
		
		setTotal();
		setAvg();
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
		this.total = kor + eng + math;
	}
	
	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}
	public void setAvg() {
		this.avg = total / 3f;
	}
	@Override
	public String toString() {
		return "이름 : " + name
				+"\n\t국어 : " + kor
				+"\n\t영어 : " + eng
				+"\n\t수학 : " + math
				+"\n\t총점 : " + total
				+"\n\t평균 : " + avg;
	}
	
}
