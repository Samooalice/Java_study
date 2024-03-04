package day09;

public class BlackPink {
	private String name;
	private int age;
	private String tel;
	private char bType;
	
	public BlackPink() {}
	//생성자
	public BlackPink(String name, int age, String tel, char bType) {
		this.name = name;
		this.age = age;
		this.tel = tel;
		this.bType = bType;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public char getbType() {
		return bType;
	}
	public void setbType(char bType) {
		this.bType = bType;
	}
	
	/*
	 * 클래스 내부에서 데이터를 기억할 변수 들로만으로 구성
	 * VO(Vlaue Object) 클래스
	 * DTO(Data Transfer Object) 클래스
	 * VO클래스 내부의 변수들은
	 * 생성할 떄 원칙이 아무곳에서나 접근해서 수정하거나 사용할 수 없게 해야함.
	 * 
	 * 
	 * private 데이터타입 변수이름;
	 * private은 식별자를 사용할 수 있는 접근 권한 중 한가지
	 * 
	 * -접근권한-
	 *	public		: 모든 곳에서 접근가능
	 *	protected	: 현재 패키지 내에서와 상속받은 클래스 내에서
	 *	생략		: 형제 패키지 내에서 어디서든 접근 가능
	 *	private		: 현재 클래스에서만 접근 가능
	 *
	 * 	private으로 설정하면 현재 클래스에서만 세팅 및 읽을 수 있음.
	 * 	=> 외부에서는 읽을 수 없음.
	 * 
	 * 그래서 외부에서 사용가능하도록 새주는 방법 => getter, setter라는 함수 활용
	 * 
	 * 프로그램에서 중요한 요소를 접근지정자로 감춰놓는 것 : 은닉화
	 * 여러개의 변수와 그 변수를 사용할 수 있게 해주는 함수들을 하나의 클래스안에 생성해 놓는 것 : 캡슐화
	*/
}


