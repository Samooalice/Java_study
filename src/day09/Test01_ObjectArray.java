package day09;
public class Test01_ObjectArray {
	public static void main(String[] args) {
		BlackPink jennie = new BlackPink();
		
//		jennie.name = "jennie";
//		jennie.age = 28;
//		jennie.tel = "010-1212-1212";
//		jennie.bType = 'B';
		jennie.setName("제니");
		jennie.setAge(28);
		jennie.setTel("010-1212-1212");
		jennie.setbType('b');
		
		BlackPink jisoo = new BlackPink();
		jisoo.setName("jisoo");
		
		System.out.println("제니 이름: "+ jennie.getName() + ", 나이 : "+ jennie.getAge());
		System.out.println("지수 이름: "+ jisoo.getName() + ", 나이 : "+ jisoo.getAge());
		
		BlackPink lisa = new BlackPink("리사", 30, "010-2424-2424", 'O');
		System.out.println("리사 이름 : " + lisa.getName() + " / 나이 : " + lisa.getAge()
											+ " / 번호 : " + lisa.getTel() + " / 혈액형 : " + lisa.getbType());
	}
}
