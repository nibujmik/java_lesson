package koreait.day03;

import java.util.Scanner;

public class C10_KeyInput {

	public static void main(String[] args) {
		//sc�� ������. �⺻�� ������ �ƴ� Ŭ����Ÿ���� ���� ->������ ����
		//��new �������� ����� ��ü�� Ŭ���� �̸��� ���� �̸����� ���� �����մϴ�.
		Scanner sc = new Scanner(System.in); // Ű���� �Է��� ���� ���� ����.
											//ǥ�� �Է����� Scanner ��ü�� ����� ���� sc�� �����մϴ� 
		
		int data;
		System.out.print("������ �Է��ϼ���. ->"); // �Է� �ȳ� �޽���
		data = sc.nextInt();  //����ڷκ��� Ű���� �Է� �ް� �� ���� ������ ��ȯ�Ͽ� data ������ ����.
		System.out.println("�Էµ� ���� "+data+"�Դϴ�.");
		
	    double point;
	    System.out.println("�Ǽ����� �Է��ϼ���.->");
	    
	    point = sc.nextDouble();
	    System.out.println("�Էµ� ����"+point+"�Դϴ�.");
	}

}
