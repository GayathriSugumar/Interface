package Interface;

public class GooglePay implements OnlinePayment{
	
	@Override
	public void recharge(String userName,int password) {
		System.out.println("recharge successfully");
	}
	
	@Override
	 public void electricityBill(String user_id,int amount) {
		System.out.println("payment paid successfully");
	}
	
	@Override
	 public void waterBill(String user_id,int amount) {
		 System.out.println("recharge successfully");
	 }
	
}



