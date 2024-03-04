package day17;

public class Test01_Equals {

	public Test01_Equals() {
		// TODO Auto-generated constructor stub
		Figure[] fig = new Figure[7];
		
		loop:
		for(int i = 0; i < fig.length; i++) {
			int rad = (int)(Math.random() * 10 + 1);
			
			Circle circle = new Circle(rad);
			for(int j = 0; j < i; j++) {
				Circle circle2 = (Circle)fig[j];
				if(circle.equals(circle2)) {
					i--;
					continue loop;
				}
			}
			
			fig[i] = circle;
		}
		
		for(Figure outFigure : fig) {
			System.out.println(outFigure);
		}
	}
	

	public static void main(String[] args) {
		new Test01_Equals();
		
//		Figure[] figures = new Figure[5];
//		for(int i = 0; i < figures.length; i++) {
//			figures[i] = new Figure() {
//				
//				@Override
//				public double setArea() {
//					return 0;
//				}
//				
//				@Override
//				public int getRad() {
//					return 0;
//				}
//			};
//			
//		}
//		
//		for(Figure outFigure : figures) {
//			System.out.println(outFigure.getRad());
//		}
//	}
	}
	
	
	public class Circle implements Figure{
		private int rad;
		private double area, arround;
		
		public Circle() {
			// TODO Auto-generated constructor stub
		}
		
		public Circle(int rad) {
			setRad(rad);
			setArround();
			setArea();
		}
		
		@Override
		public double setArea() {
			return rad * rad * 3.14;
		}
		
		@Override
		public int getRad() {
			return rad;
		}
		
		public double getArea() {
			return area;
		}

		public void setArea(double area) {
			this.area = area;
		}

		public double getArround() {
			return arround;
		}

		public void setArround(double arround) {
			this.arround = arround;
		}
		
		public void setArround() {
			arround = 2 * rad * 3.14;
		}
		
		public Figure setRad(int rad) {
			this.rad = rad;
			return this;
		}
		
		@Override
		public boolean equals(Object o) {
			Circle circle = (Circle) o;
			int r = circle.getRad();
			
			return(rad == r);
		}
		
		@Override
		public String toString() {
			return "반지름 : " + rad + " 인 원";
		}
	}
}

interface Figure{
	double setArea();
	int getRad();
	Figure setRad(int rad);
}
