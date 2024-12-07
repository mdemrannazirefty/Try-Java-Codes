public class AccountDetails
{
	int accountNumber;
	String accountHolderName;
	double balance;
	
	public void setAccountNumber(int an)
	{
		accountNumber=an;
	}
	public int getAccountNumber()
	{
		return accountNumber;
	}
	
	public void setAccountHolderName(String ahn)
	{
		accountHolderName=ahn;
	}
	public String getAccountHolderName()
	{
		return accountHolderName;
	}
	
	public void setBalance(double b)
	{
		balance=b;
	}
	public double getBalance()
	{
		return balance;
	}
	
	public void showDetails()
	{
		System.out.println("Account Number Is: " +accountNumber);
		System.out.println("Account Holder Name Is: " +accountHolderName);
		System.out.println("Balance Is: " +balance);
	}
}
	