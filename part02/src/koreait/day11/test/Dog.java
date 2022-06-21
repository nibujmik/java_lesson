package koreait.day11.test;

public class Dog extends Animal {
	
	protected int legs;
	
	public Dog() {
		System.out.println("새로운 동물가족은 dog");
		type=Animal.DOG;
	}
	public void run() {
		setName("강아지");
		setColor("brown");
		System.out.println("특징: 달리기");
		
	}
	@Override
	public void act() {
		System.out.println("Animal 행동: 하루에 2번 산책하기");
	}

	public String eat(Object object) {
		return "먹이는"+object+"입니다";
	}
}
