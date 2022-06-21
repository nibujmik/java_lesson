package koreait.day04;

import java.util.Scanner;

public class C18_ReviewEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String best;
		int korean;
		int math;
		int english;
		
		
		System.out.println("[[성적 집계 : 평균과 총점 구하기]]");
		System.out.println("성적 입력하세요.");
		
		System.out.print("국어-> " );
		korean=sc.nextInt();
		System.out.print("수학-> " );
		math=sc.nextInt();
		System.out.print("영어-> " );
		english=sc.nextInt();
		
		int total=korean+math+english;
		int average=(korean+math+english)/3;
		double average2= (korean+math+english)/3;
		
		System.out.println(">>처리되었습니다.");
		System.out.println("총점: "+total);
		System.out.printf("평균: %d  (%.2f) ",average,average2);
		System.out.println( ", 과목수 : 3");
		
		
		
		int max;
		
		if(korean>math) {
			max=korean;
			best = "국어"; 
			
		}else {
			max=math;
			best = "수학"; 
			
		}
		if(max<english) best="영어";
		
		
	
		
		
		
		System.out.printf("이 학생의 특기과목은 . %s . 입니다. ", best);
		
		
		
		
	}

}
