package koreait.day03;

import java.util.Scanner;

public class C08_KeyInput {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("[[�簢�� ������ ���� ���ϱ�]]");
		
		int w ;
		int h;
		System.out.print("���θ� �Է��ϼ���. ->");
		w=sc.nextInt();
		System.out.print("���θ� �Է��ϼ���. ->");
		h=sc.nextInt();
		
		int b_area=w*h;
		
		System.out.println("����: "+ w +"cm");
		System.out.println("����: "+ h +"cm");
		System.out.println("���̸� ���߽��ϴ�."+ b_area+"�� \n");
		
		
		System.out.println("[[�� ������ ���̿� �ѷ� ���ϱ�]]");
		
		final double PI =3.14;
		
		double r ;
		System.out.print("�������� �Է��ϼ���. ->");
		r=sc.nextDouble();
		
		double cir= 2*PI*r;
		double area= PI*r*r;
		
		System.out.printf("������ : %.3f cm \n",r);
		System.out.printf("�ѷ��� ���߽��ϴ�: %.3f cm \n",cir);
		System.out.printf("���̸� ���߽��ϴ� : %.3f �� \n",area);		
		
		sc.close(); //ǥ���Է���ġ �ڿ� �������
		
		
		
		

	}

}
