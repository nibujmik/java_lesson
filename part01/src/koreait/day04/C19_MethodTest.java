package koreait.day04;

public class C19_MethodTest {

	public static void main(String[] args) {
		System.out.println("1.");
		methodA();///메소드 호출
		System.out.println("2.");
		
		methodB(11,33); //11,33은 인자
		methodB(929,111);
		//methodB(929,11.1); 오류: 매개변수 형식 오류
		
		System.out.println("3.");
		methodC(929,12.1);
		methodC(929,121); //오류 아님: 자동캐스팅(형변환)
		
		System.out.println("4.");
		methodD(); //반환값이 있는 메소드지만 main 메소드에서 반환값 저장을 안함
		System.out.println("return = "+methodD());//반환값을 받아서 출력하는 예시
		int temp = methodD(); //반환값을 받아서 변수에 저장하는 예시
		System.out.println("return = "+temp);
		
		System.out.println("5.");
		System.out.println(methodE(12,13.3));
		double temp2 = methodE(15,13.1);
		System.out.println(temp2);
		
		System.out.println("6.");
		System.out.println(methodF('i',4));
		
		char ch='a';
		int val= 3;
		ch=methodF(ch,val);
		System.out.println("return= "+ch);
	}
		
	//static인 main 에서 실행할 메소드는 도일하게 static
	//메소드 선언
	public static void methodA() {
		System.out.println("##첫번째 메소드 정의 연습입니다.##");
		
	}
	public static void methodB(int a, int b) {//int a, int b는 인자값을 전달 받는 매개변수(지역변수)
		System.out.println("##두번째 메소드 정의 연습입니다.##");
		System.out.println("전달 받은 값 a = "+a+", b = "+b);
	}
	public static void methodC(int a, double b) {
		System.out.println("##세번째 메소드 정의 연습입니다.##");
		System.out.println("전달 받은 값 a = "+a+", b = "+b);
	}
	public static int methodD() {  //반환값이 있는 형식 : 반환값은 int, 반드시 return이 필요
		 System.out.println("##네번째 메소드 정의 연습입니다.##");
		 return 999;
	}
	public static double methodE(int a, double b) {
		System.out.println("##다섯번째 메소드 정의 연습입니다.##");
		return a+b;// 인자로 전달 받은 값으로 실행하고 처리결과 리턴
	}
		public static char methodF(char ch, int size) {
			System.out.println("##여섯번째 메소드 정의 연습입니다.##");
			return (char) (ch +  size);
	}
	}


