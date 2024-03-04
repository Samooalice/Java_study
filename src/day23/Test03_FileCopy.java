package day23;

import java.io.FileInputStream;
import java.io.FileOutputStream;

/*
 * 이미지 파일 복사
 */
public class Test03_FileCopy {

	public Test03_FileCopy() {
		// TODO Auto-generated constructor stub
		FileInputStream file_input = null;
		FileOutputStream file_output = null;
		
		try {
			file_input = new FileInputStream("src/day23/chopper01.jpg");
			file_output = new FileOutputStream("src/day23/chopper02.jpg");
			
			byte[] buff = new byte[256];
			while (true) {
				int len = file_input.read(buff);
				if(len == -1) {
					break;
				}
				
				file_output.write(buff, 0, len);
			}
			System.out.println("*** 복사 완료! ***");
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				file_output.close();
				file_input.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}

	public static void main(String[] args) {
		new Test03_FileCopy();
	}

}
