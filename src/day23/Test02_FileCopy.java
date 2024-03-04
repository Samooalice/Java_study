package day23;

import java.io.FileInputStream;
import java.io.FileOutputStream;

/*
 * day22.Test03_File.java
 * 파일을 복사해서
 * CopyFile.txt파일을 만들어보자
 */
public class Test02_FileCopy {

	public Test02_FileCopy() {
		// TODO Auto-generated constructor stub
		// 복사기능은 데이터가 프로그램으로 들어와서 다시 나가는 형태로 구현
		// 스트림은 단방향 -> 복사를 위해서 두가지 방향 모두 필요(들어오는 방향, 나가는 방향)
		
		FileInputStream file_intput = null;
		FileOutputStream file_output = null;
		
		try {
			file_intput = new FileInputStream("src/day22/Test02_File.java");
			file_output = new FileOutputStream("src/day23/CopyFile.txt");
			
			byte[] buff = new byte[256];
			while (true) {
				int len = file_intput.read(buff);
				
				if(len == -1) {
					break;
				}
				file_output.write(buff, 0, len);
			}
			System.out.println("*** 파일 저장 완료! ***");
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				file_output.close();
				file_intput.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}

	public static void main(String[] args) {
		new Test02_FileCopy();
	}

}
