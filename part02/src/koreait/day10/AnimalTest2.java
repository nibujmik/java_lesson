package koreait.day10;

import koreait.day09a.Animal;
import koreait.day09a.Crow;
import koreait.day09a.Dog;

public class AnimalTest2 {

	public static void main(String[] args) {
		Animal ani1 = new Frog();	//��ĳ����(�ڵ���ȯ)<->�ٿ�ĳ����(������ȯ)
		Animal ani2 = new Cat();
		
		Dog puddle = new Dog();
		Crow crow = new Crow();
		
		//�ڽİ�ü�� �����ɶ� ���� �θ�Ŭ���� ��ü�� �����ϸ鼭 �θ�Ŭ���� ������ ���� 
		
		animal(ani1);
//		animal(ani2);
//		animal(puddle);
//		animal(crow);
//		animal(new Frog());

	}
	
	//������
	//����1: �޼ҵ� ����(�Ǵ� ����) Ÿ���� Animal: Animal, Dog, Crow, Frog, Cat
	public static void animal(Animal animal) {
		//����2:
		animal.act();
		animal.print();
		//���ڷ� ���޹��� animal ��ü�� �����ϴ� ���� ��¥ Ÿ�� (�ν��Ͻ� Ÿ��) �˻�:instance
		System.out.println("dog? "+(animal instanceof Dog));	//��ü�������� instanceof Ŭ������
		System.out.println("Crow? "+(animal instanceof Crow));
		System.out.println("Frog? "+(animal instanceof Frog));
		System.out.println("Cat? "+(animal instanceof Cat));
		
		Cat cat; Dog dog; Frog frog; Crow crow;
		if(animal instanceof Cat) {
			cat = (Cat)animal;	//�ٿ�ĳ����: animal ��¥ ��ü�� ���� ���� �Ǵ� ���� ����-> instanceof ���ǽ��ʿ�
			cat.sound();
		}
		if(animal instanceof Dog) {
			dog = (Dog)animal;
			dog.run();
		}
		if(animal instanceof Frog) {
			frog = (Frog)animal;
			frog.jumping();
		}
		if(animal instanceof Crow) {
			crow = (Crow)animal;
			crow.fly();
		}
		animal.print();
	}
}

class Frog extends Animal{
	
	protected String mouth;	//����Ʈ ������+�ٸ� ��Ű�� �ڽ� Ŭ����
	
	public Frog() {
		System.out.println("���ο� ���������� Frog");
	}
	
	public void jumping() {
		setName("������");
		setColor("�ʷ�");
		System.out.println("Ư¡: ����");
	}
	//������ ����: �޼ҵ� �������̵�      
	//          ���θ�Ŭ������ �żҵ带 ������. �� ��, ���ڿ� ����Ÿ���� �����ϰ�
	//annotation �ֳ����̼�: �ڵ�(�Ǵ� ����) �� �� ���� �Ǵ� �ּ�
	public void act() {
//		super.act(); �θ�Ŭ������ act()����
		System.out.println("Animal �ൿ: ���÷� �����ϱ�");
	}

}

class Cat extends Animal {
	
	protected String eyes;
	
	public Cat() {
		System.out.println("���ο� ���������� Cat");
	}
	public void sound() {
		setName("�����");
		setColor("ȭ��Ʈ");
		System.out.println("Ư¡: �߿˾߿�");
		
	}
	@Override
	public void act() {
		System.out.println("Animal �ൿ: ���÷� �߿˾߿��ϱ�");
	}

}