package day24;

import java.io.FileReader;
import java.io.FileWriter;


public class Test03_Filecopy {

	public Test03_Filecopy() {
		// TODO Auto-generated constructor stub
		FileReader fileReader = null;
		FileWriter fileWriter = null;
		try {
			fileReader = new FileReader("src/day24/chopper.jpg");
			fileWriter = new FileWriter("src/day24/chopper_01.jpg");
			
			char[] buff = new char[1024];
			
			while (true) {
				int len = fileReader.read(buff);
				if(len == -1) {
					break;
				}
				
				fileWriter.write(buff, 0, len);
			}
			
			System.out.println("### 복사 완료! ###");
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				fileWriter.close();
				fileReader.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}

	public static void main(String[] args) {
		new Test03_Filecopy();
	}

}
