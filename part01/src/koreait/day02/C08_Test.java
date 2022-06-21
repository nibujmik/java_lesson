package koreait.day02;

public class C08_Test {

	public static void main(String[] args) {
		
		System.out.println("[[사각형 도형의 넓이 구하기]]");
		
		int w =23;
		int h= 19;
		int b_area=w*h;
		System.out.println("가로: "+ w +"cm");
		System.out.println("세로: "+ h +"cm");
		System.out.println("넓이를 구했습니다."+ b_area+"㎠ \n");
		
		
		System.out.println("[[원 도형의 넓이와 둘레 구하기]]");
		final double PI =3.14;
		double r = 23.23;
		double cir= 2*PI*r;
		double area= PI*r*r;
		
		System.out.printf("반지름 : %.3f cm \n",r);
		System.out.printf("둘레를 구했습니다: %.3f cm \n",cir);
		System.out.printf("넓이를 구했습니다 : %.3f ㎠ \n",area);		
		
		
		// final test
		//변수 선언 앞에 final 키워드를 붙이면 값을 변경하지 못함
		
		final int test = 123;// 값을 변경 못하는 상수
		System.out.println("test = "+test);
		
		//test=456;   오류: final 선언됨
		
		
		

	}

}
