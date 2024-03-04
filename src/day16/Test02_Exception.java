package day16;
/*	강제 예외 던지기
 * 		JVM이 취급하지 않는 예외 처리
 * 
 * 		형식 :
 * 			throw new 예외클래스();
 */
public class Test02_Exception {

	public Test02_Exception() {
		// TODO Auto-generated constructor stub
		System.out.println("강제 예외 발생 전");
		
		try {
			throw new Exception();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("예외발생");
		}
		
		System.out.println("예외처리 후...");
	}

	public static void main(String[] args) {
		new Test02_Exception();
	}

}
