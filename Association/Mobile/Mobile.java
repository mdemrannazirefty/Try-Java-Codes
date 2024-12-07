//Name: MD. EMRAN NAZIR EFTY
//ID: 22-47802-2

public class Mobile {
	String mobileOwnerName;
	String mobileNumber;
	String mobileBalance;
	String mobileOSName;
	boolean lock;
	
	Mobile() {
	}

	public Mobile(String mobileOwnerName, String mobileNumber, String mobileBalance, String mobileOSName,
			boolean lock) {
		
		this.mobileOwnerName = mobileOwnerName;
		this.mobileNumber = mobileNumber;
		this.mobileBalance = mobileBalance;
		this.mobileOSName = mobileOSName;
		this.lock = lock;
	}
	public void showInfo() {
		System.out.println("OwnerName: "+mobileOwnerName);
		System.out.println("Number: "+mobileNumber);
		System.out.println("Balance: "+mobileBalance);
		System.out.println("OSName: "+mobileOSName);
		
		if(lock==true) {
			System.out.println("PHONE IS LOCKED");
		}
		else {
			System.out.println("PHONE IS UNLOCKED");
		}
	}
		
		void recharge(int amount) {
			int blnce=Integer.valueOf(mobileBalance);
			mobileBalance=String.valueOf(blnce+amount);
		}
		
		void callSomeone(int timeDuration) {
			int cost=timeDuration*1;
			mobileBalance=String.valueOf(Integer.valueOf(mobileBalance)-cost);
		}
	
	

}
