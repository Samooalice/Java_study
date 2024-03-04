package day23;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class Test04_Buffered {

	public Test04_Buffered() {
		// TODO Auto-generated constructor stub
		FileOutputStream file_output = null;
		BufferedOutputStream bout = null;
		try {
			file_output = new FileOutputStream("src/day23/day01.txt");
			bout = new BufferedOutputStream(file_output);
			
			String string = "Stream has fun!";
			
			byte[] buff = string.getBytes();
			
			file_output.write(buff);
			/*
			 * 버퍼메모리는 다 채워지지 않으면 데이터가 흘러가지 못함
			 * 아직 버퍼 공간이 비어있기에 저장은 안된 상태임
			 */
			
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				bout.close();
				file_output.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}

	public static void main(String[] args) {
		new Test04_Buffered();
	}

}
