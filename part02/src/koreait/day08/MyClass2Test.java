package koreait.day08;

import java.util.Scanner;

public class MyClass2Test {

	public static void main(String[] args) {

		//�⺻�����ڷ� ��ü �����ϱ�
		MyClass2 my2 = new MyClass2("momo");
		//Ŀ���� �����ڸ� �����ϸ� �⺻ �����ڸ� ����� �� ���� ��-> ���� ���� �ϱ�
		
		//Ŀ���� �����ڷ� ��ü �����ϱ�
		MyClass2 my22 = new MyClass2("���");
		
		System.out.println("my2 name :"+ my2.getName());
		System.out.println("my22 name :"+ my22.getName());
		
		my2.setAge(25);
		System.out.println("age= "+my2.getAge());
		
		my22.setAge(26);
		System.out.println("age= "+my22.getAge());
		
		//�⺻ �����ڸ� ������� �ʴ� ����
		//Scanner sc = new Scanner();
		
		
		
		
		

		

	}

}
