package Classes;
public class Medicines{
	private String name;
	private String genericName;
	private String expiryDate;
	private int price;
	private int quantity;
	private int numberOfBuy;
	private int tax;
	private int discount;
	
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return this.name;
	}
	
	public void setGenericName(String genericName){
		this.genericName=genericName;
	}
	public String getGenericName(){
		return this.genericName;
	}
	
	public void setExpiryDate(String expiryDate){
		this.expiryDate=expiryDate;
	}
    public String getExpiryDate(){
		return this.expiryDate;
	}
	
	public void setPrice(int price){
		this.price=price;
	}
	public int getPrice(){
		return this.price;
	}
	public void setQuantity(int quantity){
		this.quantity=quantity;
	}
	public int getQuantity(){
		return this.quantity;
	}
	public void setNumberOfBuy(int numberOfBuy){
		this.numberOfBuy=numberOfBuy;
	}
	public int getNumberOfBuy(){
		return this.numberOfBuy;
	}
	public void setTax(int tax){
		this.tax=tax;
	}
	public int getTax(){
		return this.tax;
	}
	
	public void setDiscount(int discount){
		this.discount=discount;
	}
	public int getDiscount(){
		return this.discount;
	}
	
	
	public Medicines(String name,String genericName,String expiryDate,int price,int quantity,int tax,int discount){
		this.setName(name);
		this.setGenericName(genericName);
		this.setExpiryDate(expiryDate);
		this.setPrice(price);
		this.setQuantity(quantity);
		this.setTax(tax);
		this.setDiscount(discount);
	}
	
	public void showAll(){
	    System.out.println("______________________________________________");	
		System.out.println("Medicine name: "+this.getName());
		System.out.println("Medicine generic name: "+this.getGenericName());
		System.out.println("Medicine expiry date: "+this.getExpiryDate());
		System.out.println("Price: "+this.getPrice());
		System.out.println("Available Quantity: "+this.getQuantity());
		
	}
	
	public double bill(double price,double number,double discount,double tax){
		double k=(price*number);
		double dt=discount/100;
		double ds=k*dt;
		double afterDiscount=k-ds;
		double t=tax/100;
		double taxAmount=afterDiscount*t;
		double total=afterDiscount+taxAmount;		
		return total;
	}
	
	
}