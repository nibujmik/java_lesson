package koreait.day06;

import java.util.Arrays;
import java.util.Random;

public class C31_RandomEx {

	public static void main(String[] args) {

		/*
		 * �л� ����(����) ���� ������ ����ϴ�.
		 * �л� �ο��� 100��- ������ ���������� �׽�Ʈ(0<=����<=100)
		 * 
		 * 90~100: o �� (o.o%)		ī��Ʈ ���� 5�� �ʿ�
		 * 80~89: o �� (o.o%)			��counts[5] : counts[0],counts[1]
		 * 70~79: o �� (o.o%)    counts[2]
		 * 60~69: o �� (o.o%)    counts[3]
		 * 60�� �̸�: o �� (o.o%)   counts[4]
		 * 
		 */
		
		int[] koreans = new int[100];
		int[] counts= new int[5];
		Random r = new Random();
		
		//�������� ����
		for (int i = 0; i < koreans.length; i++) {
			koreans[i]=r.nextInt(101);
		
		}
		System.out.println(Arrays.toString(koreans));
		//���� ���� count�ϱ�
		for (int i = 0; i < koreans.length; i++) {
			if(koreans[i] >= 90) counts[0]++;
			else if(koreans[i] >= 80) counts[1]++;
			else if(koreans[i] >= 70) counts[2]++;
			else if(koreans[i] >= 60) counts[3]++;
			else counts[4]++;

			
		}
		//���� ���� ��� ����ϱ�
		System.out.println("90~100\t 80~89\t 70~70\t 60~69\t 60�̸�");
		System.out.printf("%8s %8s %8s %8s %8s \n","90~100","80~89","70~79","60~69","60�̸�");
		System.out.println("------------------------------------------------------");
		for (int i = 0; i < counts.length; i++)
			//counts �迭�� ���
			System.out.printf("%8d",counts[i]);
		
		System.out.println();
		for (int i = 0; i < counts.length; i++)
			System.out.printf("%8.1f%%",(double)counts[i]/koreans.length*100);
			
		}
	}

//�迭���� ����� ���(������ ����/ ����, ũ�⵵ �������� ����) �� ���� �ڹ� ArrayList
//�迭������ ���� ������ ����/������ �����մϴ� -> �޼ҵ� ����

