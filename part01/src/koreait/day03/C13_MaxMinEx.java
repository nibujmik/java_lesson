package koreait.day03;

import java.util.Scanner;
//김주빈

public class C13_MaxMinEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("n1의 값을  입력하세요-> ");
		int n1=sc.nextInt();
		System.out.println("n2의 값을  입력하세요-> ");
		int n2=sc.nextInt();
		System.out.println("n3의 값을  입력하세요-> ");
		int n3=sc.nextInt();
	
		
		
		
		if(n1>n2) {
			if(n1<n3) {
			System.out.println("최종max 값은: "+n3);
			}else {
				System.out.println("최종max 값은: "+n1);}
			
		}else{
			if(n2<n3) {
			System.out.println("최종max 값은: "+n3);
		}else {
			System.out.println("최종max 값은: "+n2);
		}
		}

	}

}
