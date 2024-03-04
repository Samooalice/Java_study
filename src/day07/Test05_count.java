package day07;
/*
 * 랜덤하게 알파벳 소문자('a' - 'j')를 100개 만들어서
 * 각 문자가 몇번씩 만들어졌는지 출력하세요.
 */
public class Test05_count {
	public static void main(String[] args) {
		char[] ch = new char[10];
		
		for(int i = 0; i < ch.length; i++) {
			ch[i] = (char)('a' + i);
		}
		
//region <1. 변수 10개를 만드는 방법>
//		int a, b, c , d, e, f, g, h, i, j;
//		a = b = c = d = e = f = g = h = i = j = 0;
//		
//		for(int z = 0; z < 100; z++) {
//			char tmp = (char)('a' + Math.random()*10);
//			
//			switch (tmp) {
//			case 'a':
//				a += 1;
//				break;
//			case 'b':
//				b += 1;
//				break;
//			case 'c':
//				c += 1;
//				break;
//			case 'd':
//				d += 1;
//				break;
//			case 'e':
//				e += 1;
//				break;
//			case 'f':
//				f += 1;
//				break;
//			case 'g':
//				g += 1;
//				break;
//			case 'h':
//				h += 1;
//				break;
//			case 'i':
//				i += 1;
//				break;
//			case 'j':
//				j += 1;
//				break;	
//			default:
//				break;
//			}
//		}
//		
//		System.out.print(ch[0] + " : ");
//		for(int k = 0; k < a; k++) {
//			System.out.print("*");
//		}
//		System.out.println();
//		
//		System.out.print(ch[1] + " : ");
//		for(int k = 0; k < b; k++) {
//			System.out.print("*");
//		}
//		System.out.println();
//		
//		System.out.print(ch[2] + " : ");
//		for(int k = 0; k < c; k++) {
//			System.out.print("*");
//		}
//		System.out.println();
//		
//		System.out.print(ch[3] + " : ");
//		for(int k = 0; k < d; k++) {
//			System.out.print("*");
//		}
//		System.out.println();
//		
//		System.out.print(ch[4] + " : ");
//		for(int k = 0; k < e; k++) {
//			System.out.print("*");
//		}
//		System.out.println();
//		
//		System.out.print(ch[5] + " : ");
//		for(int k = 0; k < f; k++) {
//			System.out.print("*");
//		}
//		System.out.println();
//		
//		System.out.print(ch[6] + " : ");
//		for(int k = 0; k < g; k++) {
//			System.out.print("*");
//		}
//		System.out.println();
//		
//		System.out.print(ch[7] + " : ");
//		for(int k = 0; k < h; k++) {
//			System.out.print("*");
//		}
//		System.out.println();
//		
//		System.out.print(ch[8] + " : ");
//		for(int k = 0; k < i; k++) {
//			System.out.print("*");
//		}
//		System.out.println();
//		
//		System.out.print(ch[9] + " : ");
//		for(int k = 0; k < j; k++) {
//			System.out.print("*");
//		}
//		System.out.println();
//endregion
	
//region 문자들의 카운트를 기억할 배열
		int[] count = new int[10];
		
		for(int i = 0; i < 100; i++) {
			char tmp = (char)('a' + Math.random() * 10);
			int idx = tmp - 'a';
			count[idx] = count[idx] + 1;
		}
		
//		for(int i = 0; i < ch.length; i++) {
//			System.out.print(ch[i] + " : ");
//			
//			for(int j = 0; j < count[i]; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//region
		
		//2차원 배열로 ch와 count배열을 관리하는 방법
		int[][] arr = new int[2][10];
		
		//arr : int형 || ch : char형 ==> int형으로 맞춰서 저장
		for(int i = 0; i < ch.length; i++) {
			arr[0][i] = (int)ch[i];	
		}
		
		//arr배열과 count배열은 int형으로 같기 때문에 가능
		arr[1] = count;
		
		for(int i = 0; i < ch.length; i++) {
			System.out.print((char)arr[0][i] + " : ");
			for(int j = 0; j < arr[1][i]; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
