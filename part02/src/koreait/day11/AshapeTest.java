package koreait.day11;

public class AshapeTest {

	public static void main(String[] args) {

		Triangle tri = new Triangle(100,84);
		tri.shapeName="직각삼각형";
		System.out.println(tri);
		System.out.println("넓이 = "+tri.getArea());
		
		Circle cir = new Circle();
		cir.setRadius(89); cir.shapeName="원";
		System.out.println(cir);
		System.out.println("넓이 = "+cir.getArea());
	}

}
/*참고: 메소드 재정의 할 때 접근 한정자
 * 부모public->자식default: 오류
 * 부모default->자식public: 가능
 * 
 */

