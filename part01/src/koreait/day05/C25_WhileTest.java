package koreait.day05;

import java.util.Scanner;

public class C25_WhileTest {

	public static void main(String[] args) {
//��
		for (int i = 0; i < 5; i++) {
			System.out.println("hello!"+"("+(i+1)+")");}
			System.out.println("---------------");
			
			//while�� ����
			//loop counter ���� ���� & �ʱⰪ
			int j=0;
			while(j<5) {
				System.out.println("hello!"+"("+(j+1)+")");
				j++;
			}
			
			//����: for���� 1���� 100���� ���ϴ� �������� ���� ������� �� �� ����
			//		while ���� ���� �������� ���� ������ ������� �� �� ����
			//		�ݺ����� �Բ� ����ϴ� ��ɹ� - break, continue (continue ���� ��ɵ� �������� �ʰ� �ݺ� ó������ ���ư�) 
			int k=0,sum=0;
			Scanner sc =new Scanner(System.in);
			System.out.println("\n\n�Է��� ���ڸ� ��� ���ϴ� ����. (����: -1)");
			while(k!=-1) {
				System.out.println("���� �Է� >>> ");
				k= sc.nextInt();
				if(k!=-1)
				sum+=k; //sum=sum+k;
			}
			System.out.println("sum = "+sum);
			
			
			sum=0;	
		    k=0;
			System.out.println("\n\n�Է��� ���ڸ� ��� ���ϴ� ����. ver2 (����: -1)");
			do {
				sum+=k;
				System.out.println("���� �Է�>>>");
				k=sc.nextInt();
				
			}while(k!=-1);//������ �ڿ��� �˻��ϴ� ��ɹ�
			System.out.println("sum="+sum);
			
			
			
			sum=0;	
			System.out.println("\n\n�Է��� ���ڸ� ��� ���ϴ� ����. ver3 (����: -1)");
		
			while(true) {
			System.out.println("���� �Է�>>>");
			k=sc.nextInt();
			
			if(k==-1) break;  //�׻� ���� ��, Ż��(����) ���� break�� ���
			sum+=k;
			
		}
			System.out.println("sum="+sum);
		
			sum=0;	
			System.out.println("\n\n�Է��� ���ڸ� ��� ���ϴ� ����. ver4 (����: -1)");
			boolean isState= true;
			while(isState) {
			System.out.println("���� �Է�>>>");
			k=sc.nextInt();
			
			if(k==-1) isState=false; //boolean ���� Ȱ��. ���� ���ǰ��� �� boolean ������ false
			else sum+=k;
		}
			System.out.println("sum="+sum);
		
			//continue ���� : �Էµ� ������ 10�� ����̸� sum�� ������ �ʰ� �ٽ� �Է�
			sum=0;
			System.out.println("\n\n�Է��� ���ڸ� ��� ���ϴ� ����. ���� (����: -1)");
		
			while(true) {
			System.out.print("���� �Է�>>>");
			k=sc.nextInt();
			if(k==-1) break; 
			if(k%10==0)continue; //�Ʒ� ��ɾ� �������� �ʰ� �ٽ� ó������
			sum+=k;
			
		}
			System.out.println("sum="+sum);
		
			sc.close();
			
	}

	}
