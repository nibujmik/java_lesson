package koreait.day03;

import java.util.Scanner;

public class C12_ConditionOp {

	public static void main(String[] args) {
		//���ǽ��� ����� ���� ����� �����ϴ� ���� ������: ���ǽ�? ��/����T : ��/����F
		int korean, math;     //��������, ��������
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� ���� �Է� -> ");
		korean=sc.nextInt();
		
		System.out.println("���� ���� �Է� -> ");
		math=sc.nextInt();
		
		//���� ������ ���� ���� ��� 80�� �̻��ΰ�?->����л�
		System.out.println("����л�? "+ ((korean>=80 && math>=80)? "�½��ϴ�":"�ƴմϴ�"));
		
		//if: ó���� ����� �����ϴ� ���ǹ�
		if(korean>=80 && math>=80) {
			//���ǽ��� ���϶� �����ϴ� ���
			System.out.println("�½��ϴ�");
		}else {
			//���ǽ��� ������ �� �����ϴ� ���
			System.out.println("�ƴմϴ�");
		}
		
		//{    }�ȿ� ���� ����� 1���� ��� ���� ����
		if(korean>=90||math>=90)
			System.out.println("�½��ϴ�");
		else
			System.out.println("�ƴմϴ�");
		
		//else{   }�� �ش��ϴ� ������ ������ �ۼ� ����
		if(!(80>=korean&& 20<=korean ))
			System.out.println("ǥ������ ���� ū �����Դϴ�");
		
		
			
		}
	}

