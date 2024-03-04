package day23;
import java.io.*;
/*
 * 파일에 정보 저장
 * 	- 이름		: String
 *  - 나이		: int
 *  - 키		: double
 *  - 성별		: char
 *  - 전화번호	: String
 *  - 메일주소	: String
 */
public class Test05_DataOutput {

	public Test05_DataOutput() {
		// TODO Auto-generated constructor stub
		FileOutputStream file_output = null;
		DataOutputStream data_output = null;
		
		try {
			file_output = new FileOutputStream("src/day23/friend.txt");
			data_output = new DataOutputStream(file_output);
			
			String nameString = "jennie";
			int age = 28;
			double height = 165.5;
			char gen = '여';
			String telString = "010-1212-1212";
			String mailString = "jennie@human.com";
			
			data_output.writeUTF(nameString);
			data_output.writeInt(age);
			data_output.writeDouble(height);
			data_output.writeChar(gen);
			data_output.writeUTF(telString);
			data_output.writeUTF(mailString);
			
			System.out.println("*** 파일 저장 완료! ***");
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				data_output.close();
				file_output.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}

	public static void main(String[] args) {
		new Test05_DataOutput();
	}

}
