package day23;
import java.io.*;
/*
 * PringStream
 * 	필터스트림의 일종
 * 	사용자의 편이성, 기능향상을 동시에 만들어 놓은 보조스트림
 * 
 *  기능
 *  	1. 내부적으로 BufferdOutputStream과 연결해 놓았음
 *  	2. 사용자 편의를 위해서 자바의 데이터타입을 그대로 출력할 수 있음
 *  	3. 파일과 직접 연결하도록 해둠
 *  		=> 기본 스트림을 준비하지 않아도 사용 가능
 *  			ㄴ 내부적으로 기본스트림이 만들어져서 사용가능 함
 *  
 *  단점
 *  	1. 한쌍을 이루는 입력계열 스트림이 없음.(Input과 Output의 개념이 없음)
 */
public class Test07_Print {

	public Test07_Print() {
		// TODO Auto-generated constructor stub
		PrintStream printStream = null;
		try {
			printStream = new PrintStream("src/day23/진달래.txt");
			printStream.println("\t\t진달래꽃");
			printStream.println("\t\t\t\t\t\t김소월");
			printStream.println();
			printStream.println("나보기가 역겨워 가실때에는");
			printStream.println("말없이 고이 보내 드리오리다.");
			printStream.println();
			printStream.println("영변 약산 진달래 꽃");
			printStream.println("아름따다 가실길에 뿌리오리다.");
			printStream.println();
			printStream.println("가시는 걸음걸음 놓인 그 꽃을");
			printStream.println("사뿐이 즈려밟고 가시옵소서");
			printStream.println();
			printStream.println("나보기가 역겨워 가실때에는");
			printStream.println("죽어도 아니 눈물 흘리오리다.");
			
			//내부적으로 버퍼드 스트림을 사용하기 때문에 버퍼를 비워주는 명령이 필요한
			printStream.flush();
			
			System.out.println("*** 저장 완료! ***");
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				printStream.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}

	public static void main(String[] args) {
		new Test07_Print();
	}
}
