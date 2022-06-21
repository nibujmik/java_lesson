package koreait.day09a;

public class AnimalTest {

	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.act();
		animal.print();
		System.out.println("-------------------------");
		
		Dog dog= new Dog();
		dog.run();
		dog.print();  //상속
		System.out.println("-------------------------");
		
		Crow crow= new Crow();
		crow.fly();
		crow.print();
		
		System.out.println(":::::::::::::::::::");
		Animal temp= dog;		//자식 객체는 부모클래스 타입으로 참조할 수 있음 자식클래스는 부모클래스타입으로 자동캐스팅)
		temp.print();
//		temp.run();				//부모타입 변수로는 자식 메소드 실행 못함
		temp=crow;
		temp.print();
		System.out.println("-------------------------");
		Animal puppy = new Dog();  //자식객체는 부모클래스 타입으로 참조할 수 있음
		puppy.print();
		
		Dog puddle = (Dog)puppy;	//Animal 타입을 Dog으로 casting(자식 클래스Dog 객체이므로 가능)
		puddle.run();				//puppy변수가 참조하는 객체가 Dog타입일 때만 가능
		puddle.print();
		
	}

}
