package koreait.day08;
//�ۼ���: ���ֺ�
public class Member {

	private String name;
	private String email;
	private int age;
	private int level;
	
	//Ŀ���� ������ : name, email �ʵ� �ʱ�ȭ
	public Member(String name, String email){ //() �ȿ��� ������ �� ���� ���� ���� 
											//������ �޼ҵ�: Ÿ�԰� ���ڰ����� ������ ������ �Ǿ�� �޼ҵ� �����ε�
		this.name=name;
		this.email=email;  
	}
	
	//�⺻(default) ������: ��¹� �߰�
	public Member(){
		System.out.println("name, email, age, level �ʵ�� �⺻���Դϴ�.");
		System.out.println("name= "+this.name); //this�� �޼ҵ带 �����ϴ� ��ü
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
