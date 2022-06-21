package koreait.day02;

public class C04_DoubleData {

	public static void main(String[] args) {

		System.out.println("Float 실수데이터------");
		System.out.println("메모리 크기:" + Float.BYTES + "바이트");
		System.out.println("Float 실수의 최소값:" + Float.MIN_VALUE);
		//1.4E-45는 1.4 x 10의 -45승, 3.4028235E38는 10의 38승
		System.out.println("Float 실수의 최대값:" + Float.MAX_VALUE);
		
		System.out.println("Double 실수데이터------");
		System.out.println("메모리 크기:" + Double.BYTES + "바이트");
		System.out.println("Double 실수의 최소값:" + Double.MIN_VALUE);
		System.out.println("Double 실수의 최대값:" + Double.MAX_VALUE);
		
	}

}
