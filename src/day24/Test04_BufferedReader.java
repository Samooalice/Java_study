package day24;

import java.io.BufferedReader;
import java.io.FileReader;

public class Test04_BufferedReader {

	public Test04_BufferedReader() {
		// TODO Auto-generated constructor stub
		// 문자배열로 처리하지 않고 한줄씩 읽어서 처리할 것
		// 보조 스트림을 이용할 것
		
		FileReader fileReader = null;
		BufferedReader bufferedReader = null;
		try {
			fileReader = new FileReader("src/day24/Test02_FileReader.java");
			bufferedReader = new BufferedReader(fileReader);
			
			while (true) {
				String line_String = bufferedReader.readLine();
				if(line_String == null) {
					break;
				}
				
				System.out.println(line_String);
			}
		} catch (Exception e) {
			// TODO: handle exception
		} try {
			
		} finally {
			// TODO: handle finally clause
			try {
				bufferedReader.close();
				fileReader.close();
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}

	public static void main(String[] args) {
		new Test04_BufferedReader();
	}

}
