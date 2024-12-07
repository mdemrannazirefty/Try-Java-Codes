//Name: MD. EMRAN NAZIR EFTY
//ID: 22-47802-2

public class Account {
	public String accName;
	public String acid;
	public int balance;
	//private Transfer[] listOfTransfer=new Transfer[1000];
	
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
	
	void transfe(int amount, Account a1, Account a2){
		a1.balance=a1.balance-amount;
		a2.balance=a2.balance+amount;
	}
	
	void show(){
		System.out.println("Name Is: "+accName);
		System.out.println("Id IS  : "+acid);
		System.out.println("Account Balance Is: "+balance);
	}
}
