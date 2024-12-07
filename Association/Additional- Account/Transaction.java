
public class Transaction {
	private Account sender;
	private Account receiver;
	private int amount;
	private String additional_Info;
	
	public Transaction() {
	}
	public Transaction(Account sender, Account receiver, int amount) {
		this.sender = sender;
		this.receiver = receiver;
		this.amount = amount;
	}
	
	public void showInfo(){

		System.out.println("After Transaction: "+amount);
		System.out.println("Sender: ");
		sender.show();
		System.out.println("Receiver: ");
		receiver.show();
	}

}
