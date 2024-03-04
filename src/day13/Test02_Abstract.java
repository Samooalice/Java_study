package day13;

import java.util.Calendar;

public class Test02_Abstract {
/* 추상 클래스 사용 방법
 	=> 추상 클래스는 스스로 new를 사용할 수 없음
 		추상함수가 하나라도 존재한다면, 강제로 추상클래스로 만들어야함
 		추상함수가 1개라도 있다면, 미완성인 함수가 존재한다는 의미
 			-> 해당 클래스를 객체로 만들 수 없음.
		
		해결방법
			(1). 다른 클래스에 상속한 후, 하위 클래스의 객체를 받아서 사용
			(2). API에서 제공해주는 클래스들 중 추상클래스를 사용하는 방법
					: 해당 클래스 내부에
						- 속성이 static이면서, 반한값이 자기 자신인 함수를 사용
							==> 학원에서는 공장함수로 칭함
						*공장함수 : 속성 - static
									반환값 - 자기자신
									
				참고 - 추상 클래스가 아님에도 불구하고,
						생성자 함수가 존재하지 않는 클래스가 있다
						해당 클래스들은 생성자 함수가 없는게 아닌, 
						생성자 함수의 접근 지정자를 private으로 감춰둔 클래스들임
						해당 클래스들 역시 (2)방법으로 사용 가능
 */
	public Test02_Abstract() {
		// TODO Auto-generated constructor stub
		Calendar cal = Calendar.getInstance();
		
		System.out.println(cal.get(Calendar.YEAR) + " " +
									(cal.get(Calendar.MONTH) + 1) + " " +
										cal.get(Calendar.DATE));
		
		Moyang mo = Moyang.getInstance();
	}

	public static void main(String[] args) {
		new Test02_Abstract();
	}
}
