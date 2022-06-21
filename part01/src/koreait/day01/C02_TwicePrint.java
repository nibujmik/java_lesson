package koreait.day01;

public class C02_TwicePrint {

	public static void main(String[] args) {
		System.out.println("트와이스");
		System.out.println("이름\t생년월일\t\t나이");
		System.out.println("-------------------------");
		System.out.println("사나\t1996.12.29\t27");
		System.out.println("지효\t1998.02.19\t25");
		System.out.println("미나\t1995.06.07\t28");
		System.out.println("나연\t1994.08.02\t29");
		//12칸 문자열+자리수 지정하지 않은 문자열+ 5칸 정수
		System.out.printf("%-12s%s%5d\n","dayeon","1998.05.28",25);
		System.out.printf("%-12s%s%5d\n","momo","1999.04.23",23);
		System.out.printf("%-12s%s%5d\n","nayeon","1997.06.14",27);
		
		// 연습
		//생년월일을 정수 형식으로 출력
		System.out.println("/////연습/////");
		System.out.printf("%-12s%4d.%02d.%2d%5d\n","dayeon",1998,5,28,25);
		System.out.printf("%-12s%4d.%02d.%2d%5d\n","momo",1999,11,23,23);
		System.out.printf("%-12s%4d.%02d.%2d%5d\n","nayeon",1997,6,14,27);
		//여기까지는 데이터를 직접 리터럴("momo",1998...)로 표현해서 출력
		
		//진도방향: 변수(데이터를 저장하고 있는 기억장소) 사용
		//System.out.printf("%-12s%4d.%02d.%2d%5d\n",name,year,month,day,age);
		
	}

}
