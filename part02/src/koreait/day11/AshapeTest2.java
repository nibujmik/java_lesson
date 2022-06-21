package koreait.day11;

public class AshapeTest2 {
	//익명 클래스: anonymous: 이름이 없는 (정해지지 않은) 클래스
	public static void main(String[] args) {

		//마름모꼴
		//익명의 내부 클래스. 1회용 클래스(추상메소드 재정의)
		Ashape sha = new Ashape() {
			//추상메소드 재정의
			@Override
			public double getArea() {
				// TODO Auto-generated method stub
				return width+height;
			}
		};
		
		Ashape sha2 = new Ashape(20,13) {
			
			@Override
			public double getArea() {
				// TODO Auto-generated method stub
				return width+height;
			}
		};
		
		System.out.println("sha 넓이= "+sha.getArea());
		System.out.println("sha2 넓이= "+sha2.getArea());
	}

}
