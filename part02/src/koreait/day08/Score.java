package koreait.day08;

public class Score {
	private int korean;
	private int english;
	private int science;
	private String grade;
	
	//기본생성자가 숨어 있음. 어떤 코드 일까? 접근한정자는 public
	
	public Score() {
		
	}
	
	void setScience(int science) {
		this.science = science;
	}
	int getScience() {
		return science;
	}
	
	void setKorean(int korean) {
		this.korean=korean;
		//메소드 인자로 전달받은 값을 클래스 전역변수 korean에 저장(대입)
		//this는 setKorean 메소드 실행 객체
	}
	
	int getKorean() {
		return korean;
	}
	void setEnglish(int english) {
		this.english=english;
		
	}
	
	int getEnglish() {
		return english;
	}
	
	void setGrade(String grade) {
		this.grade=grade;
		
	}
	String getGrade() {
		return grade;
	}
	
}
