package Interface;

public interface OnlinePayment {
	
	 public void recharge(String userName,int password);
	 public void electricityBill(String user_id,int amount);
	 public void waterBill(String user_id,int amount);
}
