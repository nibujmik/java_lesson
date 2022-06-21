package koreait.day07;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;



public class C42_Day07Exam {
//작성자: 김주빈 koreait.sec2020@gmail.com
	public static void main(String[] args) {
		int[] num1 = new int[5];
		int[] num2 = new int[5];
		
		int answer ;
		
		
		System.out.println("--------------------------------------");
		System.out.println("빨간펜 수학 2자리 덧셈 문제 풀기");
		System.out.println("--------------------------------------");
		System.out.println("시작합니다.");
		
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		for(int i = 0;i<5;i++) 
			for(int j = 0;j<5;j++){
			num1[i] = r.nextInt(100-10)+10;
			num2[j] = r.nextInt(100-10)+10;
			System.out.println("문제"+(i+1)+"."+num1[i]+"+"+num2[j]
			+"= 답 입력 -> "); 
			answer=sc.nextInt();
			}
			
			int correct=0;
			System.out.println("--------------------------------------");
		if(answer==num1[i]+num2[j]) 
		
		System.out.println("채점합니다. 맞은 갯수"+(correct++)+"("+(correct++*10)+")");
		
		else
		System.out.println("::::: 틀린문제 정답 보기 :::::");
		System.out.println(num1[i]+num2[j]);
		}
		
			
		
			
		
			
	}


