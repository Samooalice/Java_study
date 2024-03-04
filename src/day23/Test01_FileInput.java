package day23;
import java.io.*;
import java.util.Arrays;
/*
 * FileOutputStream으로 저장한 data.txt파일을 읽어보자
 */
public class Test01_FileInput {

	public Test01_FileInput() {
		// TODO Auto-generated constructor stub
		// 1. 외부장치(파일)과 연결할 타겟스트림(기본스트림)을 준비
		FileInputStream fInputStream = null;
		
		try {
			// 2. 스트림을 파일과 연결
			fInputStream = new FileInputStream("src/day23/data.txt");
			// 3. 데이터를 읽는다 
			
//			// 1) 한글자만 읽어보자
//			int ch = fInputStream.read();	// 반환값 : 읽은 문자의 아스키코드를 반환
//			// 출력
//			System.out.println((char) ch);
			
//			// 2) 한행 데이터를 모두 읽어보자.
//			byte[] buff = new byte[256];
//			
//			// 내용을 읽어서 배열에 기억시킴
//			int len = fInputStream.read(buff);	// 읽은 데이터 갯수를 반환, 읽은 데이터는 buff배열에 저장
//			
//			// 읽은 데이터를 문자열로 만든다
//			String string = new String(buff, 0, len);
//			
//			//출력
//			System.out.println("읽은 데이터 : ");
//			System.out.println(string);
			
			fInputStream.close();
			// 3. 여러행으로 저장된 파일을 읽어보자. : day22.Test02_File.java
			fInputStream = new FileInputStream("src/day22/Test02_File.java");
			while(true) {
				// 한번에 적당량 읽기
				byte[] buff = new byte[256];
				
				// 배열의 갯수만큼 읽는다.
				int len = fInputStream.read(buff);	// 읽을 데이터가 없다면 -1을 반환
				
				if(len == -1) {
					// 읽은 데이터가 없는 경우
					break;
				}
				// 문자열로 반환
				String msgString = new String(buff, 0, len);
				
				// 받아온 문자 자체에 줄바꿈도 포함되어 있기 때문에 print()함수 활용
				System.out.print(msgString);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			
		} finally {
			try {
				// 스트림 사용이 끝났기에 닫아줌
				fInputStream.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
		int[] nums = new int[5];
		setArr(nums);
		System.out.println(nums);
		System.out.println(setArr(nums));
		System.out.println(Arrays.toString(nums));
	}

	public int setArr(int[] no) {
		for(int i = 0; i < no.length; i++) {
			no[i] = i + 1;
		}
		
		return no.length;
	}
	
	public static void main(String[] args) {
		new Test01_FileInput();
	}
}
