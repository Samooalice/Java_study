package day04;
import java.util.*;

/*
 * 게시판에 게시물을 15개 게시할 수 있다.
 * 랜덤하게 게시물 수를 만들어서(100 이상..)
 * 필요한 페이지 수를 계산해서 출력해주는 프로그램을 작성하시오.
 * 
 *  - 게시물이 없어도 1페이즈는 필요하다.
 */
public class Ex03 {
	final static int BOARD_CNT = 15;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("숫자를 입력해 주세요 : ");
		int ran_paper = scanner.nextInt();
		
		System.out.printf("게시물 개수 : %d\n", ran_paper);
		if(ran_paper <= BOARD_CNT) {
			System.out.println("필요한 게시판 페이지 개수는 1개 입니다.");
		}
		else {
			int req_board = ran_paper / BOARD_CNT;
			if(ran_paper % BOARD_CNT == 0) {
				System.out.printf("필요한 게시판의 개수는 %d 입니다. \n", req_board);
			}
			else {
				System.out.printf("필요한 게시판의 개수는 %d 입니다. \n", req_board+1);
			}
		}
	}
}
