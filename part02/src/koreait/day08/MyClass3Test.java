package koreait.day08;

import java.util.Calendar;

public class MyClass3Test {

	public static void main(String[] args) {
		
//		MyClass3 my3 = new Class3(); //����: �����ڰ� private ������
		
		MyClass3 my3 = MyClass3.getInstance();
		
		my3.test();			//��ü�� �ν��Ͻ� �޼ҵ�
		MyClass3.staticTest();	//static�޼ҵ�
		
		//�̸� ���� ��ü�� �������ִ� CalendarŬ����
		Calendar today = Calendar.getInstance();
		System.out.println(today);

	}

}
