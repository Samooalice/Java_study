package day13;

public class Test01_Abstract {
/*	추상클래스
 * 		=>  추상함수를 0개이상 가지고 있는 함수
 * 			 (추상함수가 하나도 없더라도 추상클래스를 만들 순 있다.)
 *			추상함수가 1개라도 있다면 반드시 추상클래스로 생성
 *		형식
 *			[접근지정자] abstract calss 클래스이름{
 *				변수
 *				일반함수
 *				추상함수
 *			}
 *
 *		추상함수 : 함수의 몸체( 블럭, { } )가 없는 함수
 *		
 *			형식
 *				[접근지정자] abstract 반환값타입 함수이름(매개변수리스트);
 *				Ex). 
 *					Figure class{
 *						public abstract double getArea();
 *					}
 *
 *					Semo class extends Figure{
 *						public double getArea(){
 *							return width * height * 0.5;
 *						}
 *					}
 *
 *					Nemo class extends Figure{
 *							public double getArea(){
 *							return width * height;
 *						}	
 *					}
 *
 *					Circle class extends Figure{
 *							public double getArea(){
 *							return rad * rad * PI;
 *						}	
 *					}
 *
 *	
 *
 */
	public Test01_Abstract() {
		Figure[] fig = new Figure[10];
		//랜덤하게 3,4를 발생시켜서 3은 세모, 4는 네모
		//가로 세로 랜덤하게 발생
		for(int i = 0; i < fig.length; i++) {
			int shape = (int)(Math.random() * (4 - 3 + 1) + 3);
			
			int width = (int)(Math.random() * 20 + 1);
			int height = (int)(Math.random() * 20 + 1);
			
			if(shape == 3) {
				fig[i] = new Semo(width, height);	// 세모 객체가 Figure 타입으로 자동 형변화
			} else {
				fig[i] = new Nemo(width, height);	// 세모 객체가 Figure 타입으로 자동 현변화
			}
		}
		
		for(Figure out : fig) {
			System.out.println(out);
		}
	}

	public static void main(String[] args) {
		new Test01_Abstract();
	}

}
