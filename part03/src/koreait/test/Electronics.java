package koreait.test;
//�ۼ��� : ���ֺ�
public class Electronics extends Product {

	private double kwh;
	
public Electronics() {
		
	}
	
	public Electronics (int price, String prdName) {
		this.price=price;
		this.prdName=prdName;
		
		
	}
	public double power(double kwh) {
		
		return kwh*24;
		
	}
	public String sell(Object obj) {
		return String.format("���� ��ǰ- %s(1set)", obj);
		
	}

	public double getKwh() {
		return kwh;
	}

	public void setKwh(double kwh) {
		this.kwh = kwh;
	}

	@Override
	public String toString() {
		return "Electronics [kwh=" + kwh + ", price=" + price + ", prdName=" + prdName + "]";
	}
	
	
	
	
}
