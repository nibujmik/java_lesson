package koreait.day03;

import java.util.Scanner;

public class C10_KeyInput {

	public static void main(String[] args) {
		//sc는 변수명. 기본형 변수가 아닌 클래스타입의 변수 ->참조형 변수
		//ㄴnew 연산으로 만드는 객체의 클래스 이름과 같은 이름으로 변수 선언합니다.
		Scanner sc = new Scanner(System.in); // 키보드 입력을 위한 변수 선언.
											//표준 입력으로 Scanner 객체를 만들고 변수 sc가 참조합니다 
		
		int data;
		System.out.print("정수값 입력하세요. ->"); // 입력 안내 메시지
		data = sc.nextInt();  //사용자로부터 키보드 입력 받고 그 값을 정수로 변환하여 data 변수에 저장.
		System.out.println("입력된 값은 "+data+"입니다.");
		
	    double point;
	    System.out.println("실수값을 입력하세요.->");
	    
	    point = sc.nextDouble();
	    System.out.println("입력된 값은"+point+"입니다.");
	}

}
