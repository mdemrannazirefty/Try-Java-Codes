package Classes;
public class Sirap extends Medicines{
	private String childSafe; //is it safe for children or not
	
	public void setChildSafe(String childSafe){
		this.childSafe=childSafe;
	}
	public String getChildSafe(){
		return this.childSafe;
	}
	public Sirap(String name,String genericName,String expiryDate,int price,int quantity,int tax,int discount,String childSafe){
		super(name,genericName,expiryDate,price,quantity,tax,discount);
		this.setChildSafe(childSafe);
	}
	
	public void showAll(){
		super.showAll();
		System.out.println("Child Safe: "+getChildSafe());		
	}
}
