package koreait.day04;

public class C20_StringMethod {

	public static void main(String[] args) {
		
		String message = "hello~"; // java.lang.String(기본 패키지 클래스)
		

//		
		int len = message.length();
		char temp = message.charAt(3);	
		boolean isState = message.equals("Hello~");
		
		System.out.println("length()= "+len);
		System.out.println("charAt(3)= "+temp);
		System.out.println("equals(\"Hello~\")="+ isState);
		
		System.out.println("indexOf('e')="+message.indexOf('e')); //1번위치
		System.out.println("indexOf(\"lo\")="+message.indexOf("lo")); // 3번위치
		System.out.println("indexOf(\"ol\")="+message.indexOf("ol")); // -1: 찾는 문자열이 없을 때
		
		String test= "hello~hello~";
		System.out.println("test.indexOf(\"lo\")="+test.indexOf("lo") ); // 3
		System.out.println("test.lastindexOf(\"lo\")="+test.lastIndexOf("lo") ); // 9
		
		System.out.println("substring(2)="+message.substring(2)); //llo~
		System.out.println("substring(2,4)="+message.substring(2,4)); //ll, 2번부터 2개 (4-2)
		//substring에서 지정할 수 있는 숫자는 0부터~6까지(length())까지 그 외의 값을 쓰면 IndexOutOfBounds오류
		
		System.out.println("replace(\"ll\", \"*@\")="+message.replace("ll", "*@")); //치환 he*@o~
		System.out.println("startsWith(\"H\")="+message.startsWith("H")); //false
		System.out.println("endsWith(\"~\")="+message.endsWith("~"));//true
		
		
		
		
	}

}

//message.length();		//public int length()
//message.charAt(0);		// public char charAt(int index)
//
//message.equals("Hello~");//public boolean equals(Object anObject), Object는 모든 타입
						// message가 String 타입이므로  Object는 String으로 해석
////리턴값 형식은?
//message.indexOf('e'); // int 
//message.indexOf("lo");
//message.substring(2); //  String 
//message.substring(2,4); // String 
//message.replace("ll", "*@"); //String 
//
////메소드 오버로딩(overloading) : 메소드 이름과 리턴형식은 같고 인자값의 갯수와 형식이 다르게 정의된 것
