package koreait.day03;

import java.util.Scanner;
//���ֺ�

public class C13_MaxMinEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("n1�� ����  �Է��ϼ���-> ");
		int n1=sc.nextInt();
		System.out.println("n2�� ����  �Է��ϼ���-> ");
		int n2=sc.nextInt();
		System.out.println("n3�� ����  �Է��ϼ���-> ");
		int n3=sc.nextInt();
	
		
		
		
		if(n1>n2) {
			if(n1<n3) {
			System.out.println("����max ����: "+n3);
			}else {
				System.out.println("����max ����: "+n1);}
			
		}else{
			if(n2<n3) {
			System.out.println("����max ����: "+n3);
		}else {
			System.out.println("����max ����: "+n2);
		}
		}

	}

}
