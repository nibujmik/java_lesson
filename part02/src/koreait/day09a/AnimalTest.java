package koreait.day09a;

public class AnimalTest {

	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.act();
		animal.print();
		System.out.println("-------------------------");
		
		Dog dog= new Dog();
		dog.run();
		dog.print();  //���
		System.out.println("-------------------------");
		
		Crow crow= new Crow();
		crow.fly();
		crow.print();
		
		System.out.println(":::::::::::::::::::");
		Animal temp= dog;		//�ڽ� ��ü�� �θ�Ŭ���� Ÿ������ ������ �� ���� �ڽ�Ŭ������ �θ�Ŭ����Ÿ������ �ڵ�ĳ����)
		temp.print();
//		temp.run();				//�θ�Ÿ�� �����δ� �ڽ� �޼ҵ� ���� ����
		temp=crow;
		temp.print();
		System.out.println("-------------------------");
		Animal puppy = new Dog();  //�ڽİ�ü�� �θ�Ŭ���� Ÿ������ ������ �� ����
		puppy.print();
		
		Dog puddle = (Dog)puppy;	//Animal Ÿ���� Dog���� casting(�ڽ� Ŭ����Dog ��ü�̹Ƿ� ����)
		puddle.run();				//puppy������ �����ϴ� ��ü�� DogŸ���� ���� ����
		puddle.print();
		
	}

}
