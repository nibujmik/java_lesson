package koreait.test;
//累己磊 : 辫林后
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
		return String.format("弓澜 惑前- %s(1set)", obj);
		
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
