package koreait.day10;

public class ConstructorTest {

	public static void main(String[] args) {

		
	}

}

class Product {
	int price;
	
	//����Ʈ �����ڴ� ������ ����
	
	public Product(int price) {
		this.price=price;
	}
}

class Food extends Product{	//product() ����Ʈ ������ �����ϹǷ� ������ ����-> Food()����Ʈ ������ ����
	//Product() ����Ʈ ������ �����ϹǷ� ������ ����
	// -> �ڽ�Ŭ������ Ŀ���һ����ڸ� �����ؼ� �θ� Ŭ����
	//		Ŀ���� �����ڸ� ȣ��
	public Food(int price) {
		super(price);
	}
}

class Electronics extends Product{	//product() ����Ʈ ������ �����ϸ� ����
	
	public Electronics(int price) {
		super(price);		//	super() ����Ʈ ������ ��ſ� Ŀ���� ������ ȣ��
	}
	
}