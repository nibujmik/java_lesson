package koreait.day05;

import java.util.Scanner;

public class C24_StartPrint {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("[[��ȭ���� �ı�]]");
		System.out.print("������ �� �� �ֽðڽ��ϱ�? (1~5) >>> ");
	    int count =sc.nextInt();
	    
	    System.out.println("���1");
	    for (int i=0; i<count; i++) 
			System.out.print("��");
	    
		 System.out.println("\n���2");
	    for (int i=0; i<count; i++) 
			System.out.print("��");
	     
	   
	    for (int i = 0; i < 5-count; i++) 
			System.out.print("��");
	    
	    
	    System.out.println("\n���2_");
	    
	    for (int i=0; i<5; i++) 
	    	if(i<count)
			System.out.print("��");
	    	else
	    	System.out.print("��");
	    
	    System.out.println("\n���2__");
	    int k=0;//loop counter ������ main �������� 
	    for(k=0;k<count;k++)
	    	System.out.print("��");
	    
	   // System.out.println("k="+k);// ���� for���� ���ᰡ �Ǵ� k ��
	    for(;k<5;k++)				//k�� count����
	    	System.out.print("��");
	    		

	}

}
