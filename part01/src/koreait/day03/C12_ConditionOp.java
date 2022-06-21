package koreait.day03;

import java.util.Scanner;

public class C12_ConditionOp {

	public static void main(String[] args) {
		//조건식의 결과에 따라 명령을 선택하는 조건 연산자: 조건식? 값/수식T : 값/수식F
		int korean, math;     //국어점수, 수학점수
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("국어 점수 입력 -> ");
		korean=sc.nextInt();
		
		System.out.println("수학 점수 입력 -> ");
		math=sc.nextInt();
		
		//국어 점수와 수학 점수 모두 80점 이상인가?->모범학생
		System.out.println("모범학생? "+ ((korean>=80 && math>=80)? "맞습니다":"아닙니다"));
		
		//if: 처리할 명령을 제어하는 조건문
		if(korean>=80 && math>=80) {
			//조건식이 참일때 실행하는 명령
			System.out.println("맞습니다");
		}else {
			//조건식이 거짓일 때 실행하는 명령
			System.out.println("아닙니다");
		}
		
		//{    }안에 들어가는 명령이 1개일 경우 생략 가능
		if(korean>=90||math>=90)
			System.out.println("맞습니다");
		else
			System.out.println("아닙니다");
		
		//else{   }에 해당하는 내용이 없으면 작성 안함
		if(!(80>=korean&& 20<=korean ))
			System.out.println("표준편차 값이 큰 점수입니다");
		
		
			
		}
	}

