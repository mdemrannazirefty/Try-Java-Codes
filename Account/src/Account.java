public class Account{
	private String accName;
	private  String acid;
	private int balance;
	private Transaction[] listOfTransaction=new Transaction[1000];
	public static int totalNumberOfTransaction=0;
	
	Account(){
	}
	Account(String accName,String acid,int balance)
	{
	this.accName=accName;
	this.acid=acid;
	this.balance=balance;
	}
	
	void deposit(int amount)
	{
	this.balance=balance+amount;
	}
	void withdraw(int amount)
	{
	this.balance=balance-amount;
	}
	
	public void transfer(int amount,Account receiver){
		this.balance=balance-amount;
		receiver.balance=receiver.balance+amount;
	}
	
	public void show(){
		
		System.out.println("Account Name Is: "+accName);
		System.out.println("Account Id Is  : "+acid);
		System.out.println("Account Balance: "+balance);
	}
	
public void addTransaction(Account sender, Account receiver, int amount){
        
        for(int i = 0; i < listOfTransaction.length; i++){
            
            if(listOfTransaction[i] == null){
                
                listOfTransaction[i] = new Transaction(sender, receiver, amount);
				totalNumberOfTransaction++;
                return;
                
            }
            
        }
	}

public void showAllTranscation(){
    
    for(int i = 0; i < listOfTransaction.length; i++){
        
        if(listOfTransaction[i] != null){
            
            listOfTransaction[i].showInfo();
            
        }
        
    }
    
}


	
	
	
	
	
	
	
}
