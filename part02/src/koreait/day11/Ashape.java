package koreait.day11;

abstract class Ashape {
protected String shapeName;
protected int width;
protected int height;

	public Ashape() {		//Ashape()는 객체는 직접 못만들고 자식 객체 만들어질 때 실행
		System.out.println("Ashape 디폴트 생성자 동작합니다");
	}

	public Ashape(int width, int height) {
		System.out.println("Ashape 생성자 동작합니다");
		this.width=width;
		this.height=height;
	}

	public abstract double getArea();	//도형의 넓이

	@Override
	public String toString() {
		return "Ashape [shapeName=" + shapeName + ", width=" + width + ", height=" + height + "]";
	}
	
}
	class Triangle extends Ashape{//width*height/2
		
		public Triangle (int width, int height) {
			super(width,height);
		}
		@Override
		public double getArea() {
			
			return width*height/2;
		}
		}
	
	class Circle extends Ashape{	
		

		private int radius;

		@Override
		public double getArea() {
			return 	radius*radius*3.14;	
		}		
		@Override
		public String toString() {
			return "Circle [radius=" + radius + ", shapeName=" + shapeName + ", width=" + width + ", height=" + height
					+ "]";
		}
		public void setRadius(int radius) {
			this.radius=radius;
		}
	}
	class Rectangle extends Ashape{

		@Override
		public double getArea() {
			// TODO Auto-generated method stub
			return width*height;
		}
						//width*height
	}