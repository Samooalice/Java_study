package day17;

public class Test02_Equals {

	public Test02_Equals() {
		// TODO Auto-generated constructor stub
		Figure[] figures = new Figure[7];
		
		loop:
			for(int i = 0; i < figures.length; i++) {
				int rad = (int)(Math.random() * 10 + 1);
				
				figures[i] = new Figure() {
					public int rad;
					public double area, arround;
					
					@Override
					public double setArea() {
						area = rad * rad * 3.14;
						return area;
					}
					
					@Override
					public int getRad() {
						return rad;
					}
					
					@Override
					public Figure setRad(int rad) {
						this.rad = rad;
						area = rad * rad * 3.14;
						arround = 2 * rad * 3.14;
						
						return this;
					}
					
					@Override
					public boolean equals(Object o) {
						Figure figure = (Figure) o;
						int r = figure.getRad();
						
						return (rad == r);
					}
					
					@Override
					public String toString() {
						return "반지름 : " + rad +"인 원";
					}
				}.setRad(rad);
				
				
				for(int j = 0; j < i; j++) {
					Figure figure = figures[j];
					if(figures[i].equals(figure)) {
						i--;
						continue loop;
					}
				}	
			}
		
		for(Figure outFigure : figures) {
			System.out.println(outFigure);
		}
	}

	public static void main(String[] args) {
		new Test02_Equals();
	}

}
