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
        
		System.out.println("���ñ�� 1. �ܾ�����  2. �ܾ� �˻�  3. �ܾ��庸��   4. ���α׷� ������ ");
		boolean run=true;
		
		while(run) {
			System.out.print("���� - >");
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
				System.out.print("�˻� �ܾ� English-> "); 
				eng =sc.nextLine();
				System.out.println("�ܾ��� �˻��߽��ϴ�. ���=>"+mydic.get(eng));
				break;
			case "3":
				System.out.println("�ܾ��� ��ü����: "+mydic);
				
				break;
			case "4":
				run=false;
				break;
			default:
				System.out.println("�߸� �Էµ� �����Դϴ�. 1~4�Է��Դϴ�.");
				break;
			  
		}
		
		
			
	
			

}}}
