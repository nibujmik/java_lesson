package koreait.day01;

public class C02_TwicePrint {

	public static void main(String[] args) {
		System.out.println("Ʈ���̽�");
		System.out.println("�̸�\t�������\t\t����");
		System.out.println("-------------------------");
		System.out.println("�糪\t1996.12.29\t27");
		System.out.println("��ȿ\t1998.02.19\t25");
		System.out.println("�̳�\t1995.06.07\t28");
		System.out.println("����\t1994.08.02\t29");
		//12ĭ ���ڿ�+�ڸ��� �������� ���� ���ڿ�+ 5ĭ ����
		System.out.printf("%-12s%s%5d\n","dayeon","1998.05.28",25);
		System.out.printf("%-12s%s%5d\n","momo","1999.04.23",23);
		System.out.printf("%-12s%s%5d\n","nayeon","1997.06.14",27);
		
		// ����
		//��������� ���� �������� ���
		System.out.println("/////����/////");
		System.out.printf("%-12s%4d.%02d.%2d%5d\n","dayeon",1998,5,28,25);
		System.out.printf("%-12s%4d.%02d.%2d%5d\n","momo",1999,11,23,23);
		System.out.printf("%-12s%4d.%02d.%2d%5d\n","nayeon",1997,6,14,27);
		//��������� �����͸� ���� ���ͷ�("momo",1998...)�� ǥ���ؼ� ���
		
		//��������: ����(�����͸� �����ϰ� �ִ� ������) ���
		//System.out.printf("%-12s%4d.%02d.%2d%5d\n",name,year,month,day,age);
		
	}

}
