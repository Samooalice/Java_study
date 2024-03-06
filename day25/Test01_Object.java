package day25;
import java.io.*;

public class Test01_Object {
	// BlackPink 객체를 입력받아서 내용을 출력해주는 함수
	public void toPrint(BlackPink b) {
		String nameString = b.getName();
		String telString = b.getTel();
		String mailString = b.getMail();
		int age = b.getAge();
		double height = b.getHeight();
		
		System.out.println("이름 : " + nameString);
		System.out.println("전화번호 : " + telString);
		System.out.println("메일 : " + mailString);
		System.out.println("나이 : " + age);
		System.out.println("키 : " + height);
	}
	
	public Test01_Object() {
		// TODO Auto-generated constructor stub
		FileInputStream file_InputStream = null;
		ObjectInputStream object_InputStream = null;
		
		try {
			file_InputStream = new FileInputStream("src/day25/jennie.txt");
			object_InputStream = new ObjectInputStream(file_InputStream);
			
			//데이터 읽기
			BlackPink jennie = (BlackPink) object_InputStream.readObject();
			
			toPrint(jennie);
//			String nameString = jennie.getName();
//			String telString = jennie.getTel();
//			String mailString = jennie.getMail();
//			int age = jennie.getAge();
//			double height = jennie.getHeight();
//			
//			System.out.println("이름 : " + nameString
//							 + "\n전화번호 : " + telString
//							 + "\n메일 : " + mailString
//							 + "\n나이 : " + age
//							 + "\n키 : " + height);
		} catch (Exception e) {
			// TODO: handle exception
		} try {
			
		} finally {
			// : handle finally clause
			try {
				object_InputStream.close();
				file_InputStream.close();
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}

	public static void main(String[] args) {
		new Test01_Object();
	}

}
