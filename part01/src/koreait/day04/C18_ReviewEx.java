package koreait.day04;

import java.util.Scanner;

public class C18_ReviewEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String best;
		int korean;
		int math;
		int english;
		
		
		System.out.println("[[���� ���� : ��հ� ���� ���ϱ�]]");
		System.out.println("���� �Է��ϼ���.");
		
		System.out.print("����-> " );
		korean=sc.nextInt();
		System.out.print("����-> " );
		math=sc.nextInt();
		System.out.print("����-> " );
		english=sc.nextInt();
		
		int total=korean+math+english;
		int average=(korean+math+english)/3;
		double average2= (korean+math+english)/3;
		
		System.out.println(">>ó���Ǿ����ϴ�.");
		System.out.println("����: "+total);
		System.out.printf("���: %d  (%.2f) ",average,average2);
		System.out.println( ", ����� : 3");
		
		
		
		int max;
		
		if(korean>math) {
			max=korean;
			best = "����"; 
			
		}else {
			max=math;
			best = "����"; 
			
		}
		if(max<english) best="����";
		
		
	
		
		
		
		System.out.printf("�� �л��� Ư������� . %s . �Դϴ�. ", best);
		
		
		
		
	}

}
