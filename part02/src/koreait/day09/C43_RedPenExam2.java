package koreait.day09;

import java.util.Random;
import java.util.Scanner;

public class C43_RedPenExam2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random r  =new Random();
		int size = 5;	//문제 갯수
		int max_size=MathProblem.max_size;
		
		MathProblem[] problems = new MathProblem[size];//모든 문제 저장하는 배열
		//배열의 타입은 MathProblem 객체참조형: n1,n2,op,isCorrect
		
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
			problems[i]=temp;
		}
		System.out.println("-----------------------------------");
		System.out.println("채점합니다. 맞은 개수"+cnt+"("+(cnt*100/size)+"점)");
		System.out.println("::::틀린 문제 정답 보기::::");
//		for(int i=0; i<problems.length;i++)
//			if(!problems[i].isCorrect())
//				System.out.println("문제"+(i+1)+". "+problems[i].problem()+problems[i].showAnswer());
		for (MathProblem temp : problems) {
			if(!temp.isCorrect())
			System.out.println(temp.problem()+temp.showAnswer());
		}
		
		sc.close();
	}
	//추가: 사용자가 입력한 ans를 저장해서 오답출력시 같이 보여주고 싶다면?

}
