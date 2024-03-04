package day23;

import java.io.FileInputStream;

/*	문제
 * 	day22.Test02_file.java
 * 파일을 읽어서 준비된 변수에 모두 채워서 출력하세요.
 */
public class Ex01_File {

	public Ex01_File() {
		// TODO Auto-generated constructor stub
		
		FileInputStream fin_FileInputStream = null;
		
		// 방법 2.
		String resultString = "";
		
		// 방법 1.
		StringBuffer buffer = new StringBuffer(resultString);
		
		try {
			fin_FileInputStream = new FileInputStream("src/day22/Test02_file.java");
			byte[] buff = new byte[256];
			
			while(true) {
				int len = fin_FileInputStream.read(buff);
				if(len == -1) {
					break;
				}
				
				String string = new String(buff, 0, len);
				resultString += string;
				buffer.append(string);
//				System.out.println(resultString);
				System.out.println(buffer.toString());
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			try {
				fin_FileInputStream.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}

	
	public static void main(String[] args) {
		new Ex01_File();
	}
}
