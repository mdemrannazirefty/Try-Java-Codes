public class Transfer {
	private Account sender;
	private Account receiver;
	private int amount;
	//private String additional_Info;
	
	Transfer() {
	}
	Transfer(Account sender, Account receiver, int amount, String additional_Info) {
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
