package koreait.test;
//�ۼ��� : ���ֺ�
public class Bike extends Product {
	private int speed;
	
	public Bike() {
		
	}
	
	public Bike (int price, String prdName, int speed) {
		this.price=price;
		this.prdName=prdName;
		this.speed=speed;
		
	}
	
	public String ride() {
	
		return "����� �̰��� �ü� "+speed+"km�� Ż �� �ֽ��ϴ�.";
	}

	public String sell(Object obj) {
		return String.format("�߰� ���� ��� - %d %% ����", obj);
		
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	@Override
	public String toString() {
		return "Bike [speed=" + speed + ", price=" + price + ", prdName=" + prdName 
				+ "]";
	}

	
	
}
