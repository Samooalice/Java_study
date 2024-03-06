package day24;

import java.io.FileWriter;

/*
 * 기본스트림이 문자단위이고 보조스트림이 바이트 단위일때는 연결할 수 없음
 * 기본스트림이 byte 단위이고 보조스트림이 char단위일때만 연결이 가능함
 * InputStreamReader / OutputStreamWriter
 * 	==> 크기가 다른 두 개의 스트림을 연결할 때 사용하는 보조스트림
 * 
 * FileInputStream fin = new FileInputStream();
 * InputSTreamReader tmp = new InputStreamReader(fin);
 * BufferedReader br = new BufferedReader(tmp);
 * 
 * 
 * 객체의 직렬화
 * 	=> 데이터는 자바의 기본형 외에도 클래스 전체를 외부장치와 입출력이 가능 함.
 * 		ㄴ 함수는 제외되고 클래스 내의 변수의 내용만 입출력 됨.
 * 		
 * 		클래스가 다른 장치에 전달되는 상태를 "직렬화"라고 함
 * 			ㄴ 클래스에 있는 변수의 내용이 순서대로 입출력 되기 때문
 * 
 * 		아무 클래스나 입출력되는 것은 아니고, 클래스가 반드시 직렬화 가능한 클래스여아 함.
 * 		직렬화 가능한 클래스는 "Serializble"인터페이스를 상속받아서 만들어진 클래스
 * 
 * 		직렬화는 변수의 내용만 입출력되므로
 * 		네트워크 처럼 서로 떨어진 경우네는 양쪽에 똑같은 클래스가 존재해야 함
 * 
 * 		이때, 양쪽에 있는 클래슨느 클래스이름 + 패키지이름이 모두 동일해야 함
 * 
 * 		사용되는 보조 스트림 :
 * 			ObjectInputStream / ObjectOutputStream
 * 				=> 주로 네트워크에서 많이 사용하므로 Reader/Writer 계열은 없음
 * 
 * 	IO에서 갖춰야 할 능력
 * 		1. 필요할때 데이터를 파일에 저장할 수 있어야 함
 * 		2. 저장된 내용을 불러오기 할 수 있어야 함
 */
public class Test01_Char {

	public Test01_Char() {
		// TODO Auto-generated constructor stub
		FileWriter fWriter = null;
		
		try {
			fWriter = new FileWriter("src/day24/test.txt");
//			//1. 한글자 써보기
//			char ch = '한';
//			fWriter.write(ch);
			
			//2. 여러글자 보내기
			String string = "리치 일발 쯔모!\n";
			char[] buff = string.toCharArray();
			// 배열 전송
			fWriter.write(buff);
			// 문자단위 스트림은 텍스트 터이터만 처리하도록 되어있기에 기본함수 + 문자처리기능이 추가
			
			//문자배열로 변환않고 보내기
			fWriter.write(string);
			System.out.println("*** 저장 완료! ***");
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				fWriter.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}

	public static void main(String[] args) {
		new Test01_Char();
	}

}
