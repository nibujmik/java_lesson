package koreait.day03;

import java.util.Scanner;

public class C14_IfElseIf {

	public static void main(String[] args) {
		/*
		 * �����ø� �̺�Ʈ
		 * ���� ������ �ݾ��� 10���� �̻��̸� ������ ���űݾ��� 10% 0.1
		 * 				 7����						9% 0.09
		 * 				 4����						7% 0.07
		 * 				 �� ����						3% 0.03
		 */
		Scanner sc = new Scanner(System.in);
		int money;  //������ :%�����ϸ� ������� �Ǽ�-> ������ ��ȯ
		int pay;    //���űݾ�
		double rate;
		
		System.out.print("���űݾ���>>>");
		pay=sc.nextInt();
		
		if(pay>=100000) 
			rate=0.1;
		else if(pay>=70000)			//pay<100000
			rate=0.09;
		else if(pay>=40000)
			rate=0.07;
		else
			rate=0.03;
		
		money = (int)(pay*rate);
		
		
		System.out.printf("������! ���� �����Ͻ� �ݾ��� ������ %d �� �Դϴ�.\n", money);
		System.out.printf("�̺�Ʈ �Ⱓ ������ %d %% ����Ǿ����ϴ�.", (int)(rate*100));		
				
		sc.close();
	}

}