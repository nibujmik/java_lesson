package koreait.day02;

public class C07_CastingTest {

	public static void main(String[] args) {
		
		//정수형식의 연산은 int
		
		int a = 123, b= 13;
		double c= 10.34;
		
		//연산에 사용되는 피연산자가 모두 정수이면 결과는 정수
		//연산에 사용되는 피연산자가 정수, 실수이면 결과는 실수
		// 연산결과를 변수에 저장할 때 데이터 형식 고려
		
		int isum;
		double dsum;
		
		isum= a+b;
		dsum=a+c;
		
		System.out.println("a+b="+isum);
		System.out.println("a+c="+dsum);
		
		//isum=a+c;//결과가 실수이므로 정수형식 변수에 저장 못함
		
		//형변환(casting) : 정수+실수 결과를 꼭 정수 변수에 저장해야 한다면 실수를 정수로 변환해서 연산
		
		isum = a+(int)c; //c변수의 실수값을 정수로 변환 (소수점 아래 버림)
		System.out.println("a+(int)c= "+ isum);
	
		b=10;
		System.out.println("a/b="+ (a/b)); //정수끼리 나누면 결과도 정수
		System.out.println("a%b="+ (a%b)); //정수끼리 나누기의 나머지
		
		System.out.printf("%d / %d= %d\n",a,b,a/b);
		System.out.printf("%d %% %d= %d\n",a,b,a%b);
		
		//강제 형변환(캐스팅) 예시: 정수끼리 나눗셈 실수로 구하는 처리조건일 때
		//				->정수 1개를 실수로 변환
		
		b=11;
		System.out.printf("%d / %d= %.2f\n",a,b,(double)a/b);//소수점 이하 2자리로 변경(반올림)
		double test=12.3456127456789;
		System.out.println("test = "+ test);
		System.out.printf("test = %f \n", test);
		System.out.printf("test = %.15f\n ", test);
		
		
	}

}
