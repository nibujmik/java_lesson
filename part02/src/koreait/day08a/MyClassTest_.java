package koreait.day08a;

import koreait.day08.MyClass1;
import koreait.day08.Score;

public class MyClassTest_ {
	
	public static void main(String[] args) {
		//My Class1객체 생성
		MyClass1 my = new MyClass1();
		
		//패키지가 다른 MyClass1 클래스의 필드 중 사용할 수 있는 것은?   답: point
									// default(package) 한정자 필드 name, 메소드 getAge, setAge 사용못함
//		my.name="momo";
		my.point=1.234;
//		my.age=23;  //오류:private 한정자 필드
//		my.setAge(23);//private 필드값 대입(변경) 하는 메소드: setter
//		System.out.println("age = "+my.getAge());// private 값 읽어오는 메소드: getter
//		my.setAge(-100);
//		System.out.println("age = "+my.getAge());
		
		System.out.println("point="+my.point);
		
//		System.out.println("name="+my.name); 
	}
	//접근 한정자 테스트는 자바에서 제공하는 클래스들을 이해하고 우리가 만들 클래스에도 사용
	
	//Score 클래스 필드, 메소드의 한정자가 모두 default 
	//		ㄴnew 객체생성은 될까요? 답: class는 public 한정자이므로 생성됩니다 
	Score score=new Score();
}
