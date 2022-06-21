package koreait.day10;

import koreait.day09a.Animal;
import koreait.day09a.Crow;
import koreait.day09a.Dog;

public class AnimalTest4 {

	//Animal 클래스 isDog, isCrow 테스트 : 메소드 인자 Object 
	public static void main(String[] args) {
		
		Animal animal = new Dog();
		Dog puddle = new Dog();
		Crow crow = new Crow();
		Animal animal2 = new Crow();
		
		//메소드 인자로 object 타입 객체를 받는 메소드
		System.out.println(Animal.isCrow(puddle));		//f
		System.out.println(Animal.isDog(puddle));		//t	
		System.out.println(Animal.isDog("동물"));			//f
		System.out.println(Animal.isDog(1));			//f
		System.out.println(Animal.isCrow(animal));		//f
		System.out.println(Animal.isCrow(crow));		//t
		System.out.println(Animal.isCrow(animal2));		//t
		System.out.println(Animal.isCrow("까마귀"));		//f
		
		
	}

}
