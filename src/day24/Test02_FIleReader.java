package day24;

import java.io.FileReader;

public class Test02_FIleReader {

	public Test02_FIleReader() {
		// TODO Auto-generated constructor stub
		
		FileReader fileReader = null;
		
		try {
			fileReader = new FileReader("src/day24/test.txt");
			
			char[] buff = new char[1024];
			int len = fileReader.read(buff);
			
			String string = new String(buff, 0, len);
			System.out.println(string);
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				fileReader.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}

	public static void main(String[] args) {
		new Test02_FIleReader();
	}

}
