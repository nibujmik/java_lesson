package koreait.day02;

public class C08_Test {

	public static void main(String[] args) {
		
		System.out.println("[[�簢�� ������ ���� ���ϱ�]]");
		
		int w =23;
		int h= 19;
		int b_area=w*h;
		System.out.println("����: "+ w +"cm");
		System.out.println("����: "+ h +"cm");
		System.out.println("���̸� ���߽��ϴ�."+ b_area+"�� \n");
		
		
		System.out.println("[[�� ������ ���̿� �ѷ� ���ϱ�]]");
		final double PI =3.14;
		double r = 23.23;
		double cir= 2*PI*r;
		double area= PI*r*r;
		
		System.out.printf("������ : %.3f cm \n",r);
		System.out.printf("�ѷ��� ���߽��ϴ�: %.3f cm \n",cir);
		System.out.printf("���̸� ���߽��ϴ� : %.3f �� \n",area);		
		
		
		// final test
		//���� ���� �տ� final Ű���带 ���̸� ���� �������� ����
		
		final int test = 123;// ���� ���� ���ϴ� ���
		System.out.println("test = "+test);
		
		//test=456;   ����: final �����
		
		
		

	}

}
