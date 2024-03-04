package day16;

import java.io.IOException;
import java.net.*;

/*	예외 전이하기
 * 		=> 함수는 프로그램의 가장 작은 단위
 * 			한가지 작업을 하기 위해서 만들어진 것
 * 			함수 안에서 작업 중 예외가 발생하면
 * 			그 함수는 더이상 실행할 필요가 없는 경우
 * 
 * 		
 */
public class Test01_Exception {

	public Test01_Exception() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		new Test01_Exception();
	}
}
class Abc{
	public void abc() throws SocketException{
		System.out.println("Error");
	}
}

class Efg extends Abc{
	@Override
	public void abc()  throws ConnectException{
		
	}
}

//class Hij extends Abc{
////	@Override
////	public void abc() throws IOException{
////		
////	}	//SocetException보다 넓은 범주이기 때문에 오버라이딩 불가능
//}