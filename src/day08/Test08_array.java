package day08;

public class Test08_array {
	public static void main(String[] args) {
		Object[] data = new Object[10];
		for(int i = 0; i < data.length; i++) {
			data[i] = new Object();
		}
		
		data[0] = 10;
		data[1] = "열";
		data[2] = 3.14;
		data[3] = new Semo();
		//이렇게 Object[] 배열을 만들면 모든 데이터 저장은 가능
		//사용할때 강제형변환이 필요하다는 단점
		
		System.out.println((double)data[2] + 1);
	}

}

class Semo{
	
}
