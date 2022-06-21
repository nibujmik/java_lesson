package koreait.day08b;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class NumberGame {

	public static void main(String[] args) {

		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		int max= 10;		//�õ�Ƚ��
		int[] traillist = new int[max];
	
		
		System.out.println("���� ���߱� ���� �����մϴ�. �� ��ǻ�ʹ� ���ڸ� �����߽��ϴ�.");
		System.out.println("��, �޸��� ���纸����. (101~299)");
		int numComputer = r.nextInt(199)+101;  //(300-101)+101
		int numHuman;
		int i = 0;
		
		do {
			System.out.println("������ ���� �Է� (��ȸ: "+ (max-i)+")->");
			numHuman = sc.nextInt();
			if (numComputer>numHuman) {
				traillist[i]=numHuman;
				i++;
				System.out.println("�ƴմϴ�. �� ū ���Դϴ�.");
			}else if (numComputer<numHuman) {
				traillist[i]=numHuman;
				i++;
				System.out.println("�ƴմϴ�. �� ���� ���Դϴ�.");
			}
			if(i==max)  break;
		}while (numComputer!=numHuman);
		//numComputer == numHuman �̸� ���� ����� -> do~while ����
		
		if(i==max) {
			System.out.println("�� �޸� �Է� ����: "+Arrays.toString(traillist));
			System.out.println("�־��� ��ȸ�� �� ���̽��ϴ�. ������ �ٽ� �����ϼ���[����"+numComputer+"]");
			
		}else {
			System.out.println("������~ ���߼̽��ϴ�. �������� �õ� Ƚ��: "+(i+1));
		}sc.close();
	}

}
