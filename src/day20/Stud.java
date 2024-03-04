package day20;

public class Stud implements Comparable {
	private int no, score;
	private String nameString;
	
	public Stud() {
		// TODO Auto-generated constructor stub
	}
	public Stud(String name, int no) {
		// TODO Auto-generated constructor stub
		setNameString(name);
		setNo(no);
	}
	public Stud(String name, int no, int score) {
		// TODO Auto-generated constructor stub
		this(name, no);
		setScore(score);
	}
	
	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String getNameString() {
		return nameString;
	}

	public void setNameString(String nameString) {
		this.nameString = nameString;
	}
	
	@Override
	public String toString() {
		return "***이름 : " + nameString
				+"\n\t번호 : " + no
				+"\n\t점수 : " + score;
	}
	@Override
	public int compareTo(Object o) {
		Stud comparedStud = (Stud) o;
		int other_Score = comparedStud.getScore();
		return this.score - other_Score;
	}
}
