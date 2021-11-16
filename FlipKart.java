package Interface;

public class FlipKart implements OnlineShoping{
	
	
	@Override
	public void login(String userName,String password)
	{
		System.out.println("Login successfully");
	}
	
	@Override
	public void location(String address)
	{
		System.out.println("Add location successfully");
	}
	
	@Override
	public void paymentMethod(int cod,int debit)
	{
		System.out.println("Select your payment method");
	}
	

}
