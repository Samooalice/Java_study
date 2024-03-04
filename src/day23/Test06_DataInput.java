package day23;
import java.io.*;
public class Test06_DataInput {

	public Test06_DataInput() {
		// TODO Auto-generated constructor stub
		FileInputStream file_InputStream = null;
		DataInputStream data_InputStream = null;
		
		try {
			// 기본 스트림
			file_InputStream = new FileInputStream("src/day23/friend.txt");
			
			// 보조 스트림
			data_InputStream = new DataInputStream(file_InputStream);
			
			// 저정할 때 이름, 나이, 키, 성별, 전화번호, 메일 순으로 저장
			// 읽을때도 저장된 순서로 읽어야 함
			String nameString = data_InputStream.readUTF();
			int age = data_InputStream.readInt();
			double height = data_InputStream.readDouble();
			char gen = data_InputStream.readChar();
			String telString = data_InputStream.readUTF();
			String mailString = data_InputStream.readUTF();
			
			System.out.println("이름 : " + nameString);
			System.out.println("나이 : " + age);
			System.out.println("키 : " + height);
			System.out.println("성별 : " + gen);
			System.out.println("전화번호 : " + telString);
			System.out.println("메일 : " + mailString);
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				data_InputStream.close();
				file_InputStream.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}

	public static void main(String[] args) {
		new Test06_DataInput();
	}

}
