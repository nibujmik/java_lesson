package koreait.day12;

import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class C52_MyDictionary {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		TreeMap<String,String> mydic = new TreeMap<String,String>();
        
//        HashMap<String,String> mydic = new HashMap<>();
        String sel,eng,kor = null;
        
		System.out.println("선택기능 1. 단어저장  2. 단어 검색  3. 단어장보기   4. 프로그램 끝내기 ");
		boolean run=true;
		
		while(run) {
			System.out.print("선택 - >");
			sel=sc.nextLine();
			switch(sel) {
			case "1":
				System.out.print("English ->"); 
				eng =sc.nextLine();
				System.out.print("\nKorean ->");
				kor =sc.nextLine();
				
				mydic.put(eng, kor);
				break;
			case "2":
				System.out.print("검색 단어 English-> "); 
				eng =sc.nextLine();
				System.out.println("단어장 검색했습니다. 결과=>"+mydic.get(eng));
				break;
			case "3":
				System.out.println("단어장 전체보기: "+mydic);
				
				break;
			case "4":
				run=false;
				break;
			default:
				System.out.println("잘못 입력된 선택입니다. 1~4입력입니다.");
				break;
			  
		}
		
		
			
	
			

}}}
