
public class Main {
	public static void main(String args[]){
	
	Account a1=new Account("MD. EMRAN NAZIR EFTY","47802",10000);
	a1.show();
	Account a2=new Account("JOBAIR ISLAM","47800",15000);
	a2.show();
	
	a1.deposit(50);
	a2.deposit(60);
	a1.show();
	a2.show();

	a1.withdraw(100);
	a2.withdraw(100);
	//a1.transfer(100, a2);

	a1.show();
	a2.show();
	a2.addTransaction(a1, a2, 5000);
	a2.showAllTranscation();
		
		
	
	}

}
