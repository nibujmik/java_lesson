package koreait.day12;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import koreait.day12.MathProblem;

public class C48_MathList {
//C43 예제 리스트로 변경 작성자 : 김주빈
	public static void main(String[] args) {

		

			Scanner sc = new Scanner(System.in);
			Random r  =new Random();
			int size = 5;	//문제 갯수
			
			ArrayList<MathProblem> problems = new ArrayList<>();
		
			int ans;
			int cnt=0;
			
			System.out.println("-----------------------------------");
			System.out.println("빨간펜 수학 2자리 덧셈 문제 풀기");
			System.out.println("-----------------------------------");
			System.out.println("시작합니다.");
			for(int i=0;i<size;i++) {
				MathProblem temp= new MathProblem('+');
				temp.makeProb();		//n1,n2값이 객체의 필드로 난수 생성
				System.out.println("문제"+(i+1)+". "+temp.getN1()+"+"+temp.getN2()+"= 답 입력-> ");
				System.out.println("문제"+(i+1)+". "+temp.problem()+"답 입력-> ");
				ans = sc.nextInt();

				if(ans==temp.showAnswer()) {
					
					cnt++;	
					temp.setCorrect(true);
				}

				problems.add(temp);
			}
			System.out.println("-----------------------------------");
			System.out.println("채점합니다. 맞은 개수"+cnt+"("+(cnt*100/size)+"점)");
			System.out.println("::::틀린 문제 정답 보기::::");
			
			for(int i=0; i<problems.size();i++)
				if(!problems.get(i).isCorrect())
					System.out.println("문제"+(i+1)+". "+problems.get(i).problem()+problems.get(i).showAnswer());
			

			
			
			sc.close();
		}}
	

	
