package koreait.day08;

import java.util.Scanner;

public class MyClass2Test {

	public static void main(String[] args) {

		//기본생성자로 객체 생성하기
		MyClass2 my2 = new MyClass2("momo");
		//커스텀 생성자를 정의하면 기본 생성자를 사용할 수 없게 됨-> 직접 정의 하기
		
		//커스텀 생성자로 객체 생성하기
		MyClass2 my22 = new MyClass2("모모");
		
		System.out.println("my2 name :"+ my2.getName());
		System.out.println("my22 name :"+ my22.getName());
		
		my2.setAge(25);
		System.out.println("age= "+my2.getAge());
		
		my22.setAge(26);
		System.out.println("age= "+my22.getAge());
		
		//기본 생성자를 허용하지 않는 예시
		//Scanner sc = new Scanner();
		
		
		
		
		

		

	}

}
