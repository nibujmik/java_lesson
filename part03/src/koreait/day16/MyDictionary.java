package koreait.day16;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.TreeMap;


public class MyDictionary {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		List<Word> mywords = new ArrayList<>();
		String sel, eng, kor;
		int level;
		
		System.out.println("μ ν κΈ°λ₯ π   1. λ¨μ΄μ μ₯     2. λ¨μ΄κ²μ     3. λ¨μ΄μ₯λ³΄κΈ°  4.λ λ²¨λ‘ κ²μ  5.νλ‘κ·Έλ¨ λλ΄κΈ°");
		boolean run = true;
		while (run) {		//while λ°λ³΅μμ switch λ‘ μ’λ£μ‘°κ±΄μ λμμν¬λ break λ‘ λͺ»ν©λλ€.-> λ³μ μ¬μ©νμ΅λλ€.
			System.out.print("μ ν β->");
			sel = sc.nextLine();
			switch (sel) {
			case "1":		//switchλ¬Έμμ case "λ¬Έμμ΄" νμ κ°λ₯.  ifλ¬Έμμλ sel.equals("1") λ‘ ν΄μΌν©λλ€.
				System.out.print("English -> ");
				eng = sc.nextLine();    //sc.nextInt();
				System.out.print("νκΈ λ» -> ");
				kor = sc.nextLine();
				System.out.println("λ λ²¨-> ");
				level=Integer.parseInt(sc.nextLine());
				mywords.add(new Word(eng, kor,level));		//μ μ₯
				break;
			case "2":
				System.out.print("κ²μ λ¨μ΄ English -> ");
				eng = sc.nextLine();
				for (Word w: mywords) {
					if(w.getEnglish().equals(eng))
						System.out.println("λ¨μ΄μ₯ κ²μνμ΅λλ€. κ²°κ³Ό =>" + w);
				}
				break;
			case "3":
//				System.out.println("λ¨μ΄μ₯ μ μ²΄λ³΄κΈ° :" + mywords);
				all(mywords);			//μ λ ¬νκ³  μΆλ ₯νκΈ°
				
				break;
			case"4":
				System.out.print("κ²μ ν  λ λ²¨ μλ ₯(1~3) -> ");
				int no =Integer.parseInt(sc.nextLine());
				level(mywords,no);
				
				break;
			case "5":
				run=false;	
				break;
			default:
				System.out.println("πβπ¨μλͺ» μλ ₯λ μ νμλλ€.1~4 μλ ₯μλλ€.");
				break;
			}
		}	//while end
		System.out.println("::::  λμ λ¨μ΄μ₯ μ’λ£ν©λλ€. ::::");
		
	} 

	private static void level(List<Word> mywords, int no) {
		for (Word w : mywords) {
			if(w.getLevel()==no)
				System.out.println(w);
			
		}
		
	}

	private static void all(List<Word> mywords) {  //mywordsμ μ°Έμ‘°κ° μ λ¬λ°μ λμΌν κ°μ²΄λ₯Ό κ°λ¦¬ν΄.
		mywords.sort(new Comparator<Word>() {
			@Override
			public int compare(Word o1, Word o2) {
				return o1.getEnglish().compareTo(o2.getEnglish());
			}
		});		
		System.out.println(String.format("%-20s %-20s %10s", "English","Korean","Level"));
		System.out.println("---------------------------------------------------------------");
		for (Word w : mywords) {
			System.out.println(String.format("%-20s %-20s %10d", w.getEnglish(),w.getKorean(),w.getLevel()));
			
		}
	}

}
