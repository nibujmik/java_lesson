package koreait.day07;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;



public class C42_Day07Exam {
//�ۼ���: ���ֺ� koreait.sec2020@gmail.com
	public static void main(String[] args) {
		int[] num1 = new int[5];
		int[] num2 = new int[5];
		
		int answer ;
		
		
		System.out.println("--------------------------------------");
		System.out.println("������ ���� 2�ڸ� ���� ���� Ǯ��");
		System.out.println("--------------------------------------");
		System.out.println("�����մϴ�.");
		
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		for(int i = 0;i<5;i++) 
			for(int j = 0;j<5;j++){
			num1[i] = r.nextInt(100-10)+10;
			num2[j] = r.nextInt(100-10)+10;
			System.out.println("����"+(i+1)+"."+num1[i]+"+"+num2[j]
			+"= �� �Է� -> "); 
			answer=sc.nextInt();
			}
			
			int correct=0;
			System.out.println("--------------------------------------");
		if(answer==num1[i]+num2[j]) 
		
		System.out.println("ä���մϴ�. ���� ����"+(correct++)+"("+(correct++*10)+")");
		
		else
		System.out.println("::::: Ʋ������ ���� ���� :::::");
		System.out.println(num1[i]+num2[j]);
		}
		
			
		
			
		
			
	}


