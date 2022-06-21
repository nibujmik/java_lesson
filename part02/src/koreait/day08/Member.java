package koreait.day08;
//작성자: 김주빈
public class Member {

	private String name;
	private String email;
	private int age;
	private int level;
	
	//커스텀 생성자 : name, email 필드 초기화
	public Member(String name, String email){ //() 안에는 실행할 때 전달 받을 인자 
											//생성자 메소드: 타입과 인자갯수를 가지소 구별이 되어야 메소드 오버로딩
		this.name=name;
		this.email=email;  
	}
	
	//기본(default) 생성자: 출력문 추가
	public Member(){
		System.out.println("name, email, age, level 필드는 기본값입니다.");
		System.out.println("name= "+this.name); //this는 메소드를 실행하는 객체
		System.out.println("age= "+this.age);
	}
	public void setAge(int age) {
		this.age=age;
	}
	public int getAge() {
		return age;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public int getLevel() {
		return level;
	}
	public String getEmail() {
		return email;
	}
	public String getName() {
		return name;
	}
}
