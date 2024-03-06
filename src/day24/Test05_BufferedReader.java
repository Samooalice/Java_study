package day24;
import java.io.*;
public class Test05_BufferedReader {
/*
 * byte 단위 기본스트림에
 * char 단위 보조스트림을 연ㄱㄹ해서
 * Test02_FileReader.java를 읽어보자
 */
	public Test05_BufferedReader() {
		// TODO Auto-generated constructor stub
		// 바이트단위 기본스트림
		FileInputStream fileInputStream = null;
		// 연결 스트림
		InputStreamReader tmp_InputStreamReader = null;
		// 문자단위 보조 스트림
		BufferedReader bufferedReader = null;
		
		try {
			fileInputStream = new FileInputStream("src/day24/Test02_FileReader.java");
			tmp_InputStreamReader = new InputStreamReader(fileInputStream);
			bufferedReader = new BufferedReader(tmp_InputStreamReader);
			
			while (true) {
				String line_String = bufferedReader.readLine();
				if(line_String == null) {
					break;
				}
				System.out.println(line_String);
			}
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				bufferedReader.close();
				tmp_InputStreamReader.close();
				fileInputStream.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
		
	}

	public static void main(String[] args) {
		new Test05_BufferedReader();
	}

}
