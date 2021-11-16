package Interface;

public class Tester {

	public static void main(String[] args) {
		
		GooglePay gp1=new GooglePay();
		gp1.recharge("gayu", 123);
		gp1.electricityBill("gayu", 600);
		gp1.waterBill("gayu", 500);
	}

}
