package koreait.day11;

import koreait.day10.Person;

public class ClassAbsTest {

	public static void main(String[] args) {

		System.out.println("테스트 첫번째: test 메소드");
		Person momo = new Person();		//일반 클래스
//		ClassAbs abs = new ClassAbs();	//오류: 추상클래스. new 못함
		ClassAbs abs = new ClassX();	//부모타입 참조
		ClassX cls = new ClassX();		//구현클래스 타입
		abs.test();
		cls.test();
		abs.name="손흥민";				//name은 부모클래스 필드
		cls.name="모모";
		abs.print();					//print() 부모클래스 메소드
		cls.print();
		
		System.out.println("테스트 두번째: 자식필드 num");
	    cls.setNum(23);
	    cls.test();
	    ClassX x = (ClassX)abs;
	    x.setNum(100);
	    abs.test();
	}

}
