//Name: MD. EMRAN NAZIR EFTY
//ID: 22-47802-2

public class Account {
	String accName;
	String acid;
	int balance;
	
	public Account() {
	}
	public Account(String accName, String acid, int balance) {
		this.accName = accName;
		this.acid = acid;
		this.balance = balance;
	}
	void deposit(int amount)
	{
		this.balance=balance+amount;
	}
	void Withdraw(int amount)
	{
		this.balance=balance-amount;
	}
	
	public void show(){
		System.out.println("Name Is: "+accName);
		System.out.println("Id IS  : "+acid);
		System.out.println("Account Balance Is: "+balance);
	}
}
