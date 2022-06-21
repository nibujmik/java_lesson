package koreait.day02;

public class C05_IntegerVar { //main 메소드 시작
//변수: variable
	public static void main(String[] args) {
		
		byte n1; //byte 형식의 데이터를 저장할 공간. 이름은 n1 
		short n2;
		int n3;
		long n4;
		
		//변수를 선언하면서 초기값도 주었습니다
		byte m1=100;
		short m2=100;
		int m3=100;
		long m4=100;
		
	//	System.out.println(n1); //오류 : 값이 없는 변수. 초기값이 없음
		System.out.println(m1);
		
		n1=123; //대입문: 오른쪽 값/ 수식/ 변수가 왼쪽 변수로 대입
	//	n1=999;// 오류 : +127보다 큰 값
		n2=29999;
	//	n2=-40000;// 오류 : -36768 보다 작은 값
		n3=-40000;
		n3=123456789;
	//	n3=12345676890123;// 오류 : 214748364 보다 큰 값
	//	n4=1234567890123;// 오류 : 1234567890123은 int 리터럴이므로 표현 오류
		n4=123; // 오류아님: 123 리터럴은 int 리터럴 표현 범위
		n4=1234567890123L; // long 리터럴 표시는 L 또는 l 을 마지막에 씀

		System.out.println("변수 n1="+n1);
		System.out.println("변수 n2="+n2);
		System.out.printf("변수 %s = %d \n","n3",n3);
		System.out.printf("변수 %s = %d \n","n4",n4);
	}//main 메소드 끝

}
