package day24;
import java.io.*;
/*
 * 제니 데이터를 저장해 보자.
 */
public class Test06_Object {

	public Test06_Object() {
		// TODO Auto-generated constructor stub
		// 기본 스트림
		FileOutputStream file_OutputStream = null;
		// 보조 스트림
		ObjectOutputStream object_OutputStream = null;
		
		try {
			file_OutputStream = new FileOutputStream("src/day24/jennie.txt");
			object_OutputStream = new ObjectOutputStream(file_OutputStream);
			
			// 데이터 준비
			BlackPink jennie = new BlackPink("제니", "010-1212-1212", "jennie@human.com", 28, 165.5);
			
			object_OutputStream.writeObject(jennie);
			
			System.out.println("### 저장 완료! ###");
		} catch (Exception e) {
			// TODO: handle exception
		} try {
			
		} finally {
			// TODO: handle finally clause
			try {
				object_OutputStream.close();
				file_OutputStream.close();
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}

	public static void main(String[] args) {
		new Test06_Object();
	}
}
