package day07;

/* 
 * 마티즈와 그랜져가 치킨게임을 한다.
 * 마티즈는 1.5 Km/m 으로 진행하고,
 * 그랜져는 반댜 방향에서 2.41 Km/m 로 진행한다.
 * 
 * 과연 두 차량은 언제 사고가 나는지 분을 추정해서
 * 출력하시오.
 * 
 * 단, 처음 두 차량의 간격은 10Km로 한다.
 */

public class Ex04_Car {
	public static void main(String[] args) {
		double distance = 10;
		double ma_Start_Pose = 10;
		double gran_Start_Pose = 0;
		int cnt = 0;
		System.out.printf("두 자동차 사이의 시작 위치\n");
		System.out.printf("마티즈 : %.0f\n", ma_Start_Pose);
		System.out.printf("그랜져 : %.0f\n", gran_Start_Pose);
		System.out.println();
		
		while (ma_Start_Pose > gran_Start_Pose) {
			cnt++;
			ma_Start_Pose -= 1.5;
			gran_Start_Pose += 2.41;
		}
		System.out.printf("두 차가 만나는 시점은 [ %d ~ %d (분)]사이 입니다.\n", cnt-1, cnt);
		System.out.printf("두 차 사이의 거리는\n");
		System.out.printf("마티즈 : %.1f\n", ma_Start_Pose);
		System.out.printf("그랜져 : %.1f\n", gran_Start_Pose);
	}
}
