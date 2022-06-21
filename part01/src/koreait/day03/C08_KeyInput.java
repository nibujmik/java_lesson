package koreait.day03;

import java.util.Scanner;

public class C08_KeyInput {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("[[사각형 도형의 넓이 구하기]]");
		
		int w ;
		int h;
		System.out.print("가로를 입력하세요. ->");
		w=sc.nextInt();
		System.out.print("세로를 입력하세요. ->");
		h=sc.nextInt();
		
		int b_area=w*h;
		
		System.out.println("가로: "+ w +"cm");
		System.out.println("세로: "+ h +"cm");
		System.out.println("넓이를 구했습니다."+ b_area+"㎠ \n");
		
		
		System.out.println("[[원 도형의 넓이와 둘레 구하기]]");
		
		final double PI =3.14;
		
		double r ;
		System.out.print("반지름을 입력하세요. ->");
		r=sc.nextDouble();
		
		double cir= 2*PI*r;
		double area= PI*r*r;
		
		System.out.printf("반지름 : %.3f cm \n",r);
		System.out.printf("둘레를 구했습니다: %.3f cm \n",cir);
		System.out.printf("넓이를 구했습니다 : %.3f ㎠ \n",area);		
		
		sc.close(); //표준입력장치 자원 사용해제
		
		
		
		

	}

}
