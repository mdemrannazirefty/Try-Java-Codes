
public class Main{
	public static void main(String[]args){
		Contact c1=new Contact("MD. EMRAN NAZIR EFTY","247802",22,"01679228352",'M');
		c1.detectMobileOperator();
		Contact c2=new Contact("MD MD","47800",70,"01879228546",'M');
		c2.detectMobileOperator();
		
		AddressBook ab=new AddressBook();
		ab.addContact(c1);
		ab.addContact(c2);
		
		ab.showAllContactInfo();
		
	}
}