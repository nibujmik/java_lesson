package koreait.test;


//¿€º∫¿⁄ : ±Ë¡÷∫Û
public class ProductTest {

	public static void main(String[] args) {
		//13
		Product[] cart = new Product[10];
		cart[0]=new Bike(123000,"MTB",25);
		cart[3]=new Bike(99000,"ªÔ√µ∏Æ",15);
		cart[1]=new Electronics (35000,"USB");
		cart[5]=new Electronics (117000,"ipad");
		cart[7]=new Electronics (2250000,"LG ≥√¿Â∞Ì");
		
		
	
		
//        //14
		 	for(int i=7; i<8;i++) {
			Electronics elec = (Electronics) cart[i];
			if(elec instanceof Electronics) {
				elec = (Electronics)elec;	
				System.out.println(elec.power(0.9));
				
			}}
//			
//			//16
			for (Product temp : cart) {
				Bike bike;
			if(temp != null) {
			if(temp instanceof Bike) {
				bike = (Bike)temp;	
				System.out.println(bike.ride());
				
			}}}
			
		//15	
			for(int j =0; j<cart.length;j++) {
				if(cart[j]!=null && cart[j].price >= 100000)
					System.out.println(cart[j]);
			
		}
			}}

		
