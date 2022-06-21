package koreait.day03;

import java.util.Scanner;

public class C11_Boolean {

	public static void main(String[] args) {
		
		boolean result;
		result=10 >5;
		System.out.println("10>5 결과 : "+result);
		System.out.println("9!=9 결과 : "+(9!=9));
		
		System.out.println("논리연산 결과 확인하기 : and");
		System.out.println(" true and true = " + (true && true));
		System.out.println(" true and false = " + (true && false));
		//아래의 2개 논리식은 첫번째 값이 false 이므로 두번째값은 상관 없이 결과 false : dead code
		System.out.println(" false and true = " + (false && true));
		System.out.println(" false and false = " + (false && false));
		
		System.out.println("논리연산 결과 확인하기 : or");
		//아래의 2개 논리식은 첫번째 값이 true 이므로 두번째값은 상관 없이 결과 true : dead code
		System.out.println(" true or true = " + (true || true));
		System.out.println(" true or false = " + (true || false));
		System.out.println(" false or true = " + (false || true));
		System.out.println(" false or false = " + (false || false));
		
		System.out.println("논리연산 결과 확인하기 : not");
		System.out.println("not true = "+!true);
		System.out.println("not false = "+!false);

		
		int korean, math;     //국어점수, 수학점수
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("국어 점수 입력 -> ");
		korean=sc.nextInt();
		
		System.out.println("수학 점수 입력 -> ");
		math=sc.nextInt();
		
		//국어 점수와 수학 점수 모두 80점 이상인가?->모범학생
		System.out.println("모범학생? "+ (korean>=80 && math>=80));
		//국어 점수 또는 수학 점수 중에 90점 이상이 있는가?-.특기학생
		System.out.println("특기학생? "+ (korean>=90 || math>=90));
		//국어 점수가 20~80이 아닌 학생들은 ? -> 특이한 학생
		System.out.println("특이한 학생? "+ !(80>=korean&& 20<=korean ));
		//!(80>=korean&& 20<=korean )와 같은 식은 korean<20 || korean >80
		
		

	}

}
