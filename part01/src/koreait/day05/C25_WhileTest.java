package koreait.day05;

import java.util.Scanner;

public class C25_WhileTest {

	public static void main(String[] args) {
//비교
		for (int i = 0; i < 5; i++) {
			System.out.println("hello!"+"("+(i+1)+")");}
			System.out.println("---------------");
			
			//while문 형식
			//loop counter 변수 선언 & 초기값
			int j=0;
			while(j<5) {
				System.out.println("hello!"+"("+(j+1)+")");
				j++;
			}
			
			//예시: for문은 1부터 100까지 더하는 연속적인 값을 대상으로 할 때 적합
			//		while 문은 아직 정해지지 않은 값들을 대상으로 할 때 적합
			//		반복문과 함께 사용하는 명령문 - break, continue (continue 뒤의 명령들 실행하지 않고 반복 처음으로 돌아감) 
			int k=0,sum=0;
			Scanner sc =new Scanner(System.in);
			System.out.println("\n\n입력한 숫자를 모두 더하는 계산기. (종료: -1)");
			while(k!=-1) {
				System.out.println("정수 입력 >>> ");
				k= sc.nextInt();
				if(k!=-1)
				sum+=k; //sum=sum+k;
			}
			System.out.println("sum = "+sum);
			
			
			sum=0;	
		    k=0;
			System.out.println("\n\n입력한 숫자를 모두 더하는 계산기. ver2 (종료: -1)");
			do {
				sum+=k;
				System.out.println("정수 입력>>>");
				k=sc.nextInt();
				
			}while(k!=-1);//조건을 뒤에서 검사하는 명령문
			System.out.println("sum="+sum);
			
			
			
			sum=0;	
			System.out.println("\n\n입력한 숫자를 모두 더하는 계산기. ver3 (종료: -1)");
		
			while(true) {
			System.out.println("정수 입력>>>");
			k=sc.nextInt();
			
			if(k==-1) break;  //항상 참일 때, 탈출(종료) 조건 break문 사용
			sum+=k;
			
		}
			System.out.println("sum="+sum);
		
			sum=0;	
			System.out.println("\n\n입력한 숫자를 모두 더하는 계산기. ver4 (종료: -1)");
			boolean isState= true;
			while(isState) {
			System.out.println("정수 입력>>>");
			k=sc.nextInt();
			
			if(k==-1) isState=false; //boolean 변수 활용. 종료 조건값일 때 boolean 변수값 false
			else sum+=k;
		}
			System.out.println("sum="+sum);
		
			//continue 연습 : 입력된 값ㅇ이 10의 배수이면 sum에 더하지 않고 다시 입력
			sum=0;
			System.out.println("\n\n입력한 숫자를 모두 더하는 계산기. 연습 (종료: -1)");
		
			while(true) {
			System.out.print("정수 입력>>>");
			k=sc.nextInt();
			if(k==-1) break; 
			if(k%10==0)continue; //아래 명령어 실행하지 않고 다시 처음으로
			sum+=k;
			
		}
			System.out.println("sum="+sum);
		
			sc.close();
			
	}

	}
