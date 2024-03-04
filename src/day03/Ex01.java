package day03;
/*
 * 1년은 정확하게는 365.2426이다.
 * 이것은 몇일 몇시간 몇분 몇초 인지 출력하시오.
 */
public class Ex01 {
	public static void main(String[] args) {
		double real_Date = 365.2426;	//정확한 1년 일 수
		int date = 365;					//일 변수
		double hour;					//시간 변수
		double min;						//분 변수
		double sec;						//초 변수
		
		//일수 출력
		System.out.println("Date : "+ date +"일");
		
		//남은 일수 계산 및 출력
		double remain = real_Date - date;
		System.out.printf("%.4f\n", remain);
		
		//남은 일수를 통한 시간 계산
		hour = remain * 24;
		int i_Hour = (int)hour;
		System.out.println("Hour : "+ i_Hour +"시간");
		
		//남은 시간 계산 및 출력
		remain = hour - i_Hour;
		System.out.printf("%.4f\n", remain);
		
		//남은 시간을 통한 분 계산 및 출력 
		min = remain * 60;
		int i_Min = (int)min;
		System.out.println("Min : "+ i_Min +"분");
		
		//남은 분 계산 및 출력
		remain = min - i_Min;
		System.out.printf("%.4f\n", remain);
		
		//남은 분을 통한 초 계산 및 출력
		sec = remain * 60;
		int i_Sec = (int)sec;
		System.out.println("Sec : "+ i_Sec +"초");
		
		//남은 초 출력
		remain = sec - i_Sec;
		System.out.printf("%.4f\n", remain);
	}
}
