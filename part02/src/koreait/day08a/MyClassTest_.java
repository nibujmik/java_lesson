package koreait.day08a;

import koreait.day08.MyClass1;
import koreait.day08.Score;

public class MyClassTest_ {
	
	public static void main(String[] args) {
		//My Class1��ü ����
		MyClass1 my = new MyClass1();
		
		//��Ű���� �ٸ� MyClass1 Ŭ������ �ʵ� �� ����� �� �ִ� ����?   ��: point
									// default(package) ������ �ʵ� name, �޼ҵ� getAge, setAge ������
//		my.name="momo";
		my.point=1.234;
//		my.age=23;  //����:private ������ �ʵ�
//		my.setAge(23);//private �ʵ尪 ����(����) �ϴ� �޼ҵ�: setter
//		System.out.println("age = "+my.getAge());// private �� �о���� �޼ҵ�: getter
//		my.setAge(-100);
//		System.out.println("age = "+my.getAge());
		
		System.out.println("point="+my.point);
		
//		System.out.println("name="+my.name); 
	}
	//���� ������ �׽�Ʈ�� �ڹٿ��� �����ϴ� Ŭ�������� �����ϰ� �츮�� ���� Ŭ�������� ���
	
	//Score Ŭ���� �ʵ�, �޼ҵ��� �����ڰ� ��� default 
	//		��new ��ü������ �ɱ��? ��: class�� public �������̹Ƿ� �����˴ϴ� 
	Score score=new Score();
}
