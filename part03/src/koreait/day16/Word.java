package koreait.day16;
//enum(열거형타입) -> 상수만 정의한 클래스
public class Word {
	public static int BASIC=1;
	public static int PRACTICAL=2;
	public static int EXPERT=3;
	
	private String english;
	private String korean;
	private int level;
	
	@Override
	public  String toString() {
		
		return english+" "+ korean+ " "+level+"("+(this.level==Word.BASIC? "기초":this.level==Word.PRACTICAL?"활용":"전문가")+")";
	}
	
	public Word() {
		
	}
	
	public Word(String english) {
		this.english = english;
	}
	public Word(String english, String korean) {
		this.english = english;
		this.english = korean;
	}
	public Word(String english, String korean,int level) {
		this.english = english;
		this.korean = korean;
		this.level = level;
	}
	public String getEnglish() {
		return english;
	}
	public void setEnglish(String english) {
		this.english = english;
	}
	public String getKorean() {
		return korean;
	}
	public void setKorean(String korean) {
		this.korean = korean;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
}
