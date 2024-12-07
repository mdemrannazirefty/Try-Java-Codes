
public class AddressBook {
	String ownerName;
	String info;
	Contact[]listOFContact=new Contact[1000];
	static int totalContact=0;
	AddressBook() {
	}
	AddressBook(String ownerName, String info) {
		this.ownerName = ownerName;
		this.info = info;
	}
	
	public void addContact(Contact con){
		listOFContact[totalContact]=con;
		totalContact++;
	}
	
public void showAllContactInfo(){
		
		for(int i=0;i<totalContact;i++){
			System.out.println();
			listOFContact[i].showPersonInfo();
			System.out.println("Total Contact Is:"+totalContact);
		}

}
}