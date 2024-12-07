package Classes;
public class Dip extends Medicines{
	private int alcoholPercentage;
	
	public void setAlcoholPercentage(int alcoholPercentage){
		this.alcoholPercentage=alcoholPercentage;
	}
	public int getAlcoholPercentage(){
		return this.alcoholPercentage;
	}
	
	public Dip(String name,String genericName,String expiryDate,int price,int quantity,int tax,int discount,int alcoholPercentage){
		super(name,genericName,expiryDate,price,quantity,tax,discount);
		this.setAlcoholPercentage(alcoholPercentage);
	}
	
	public void showAll(){
		super.showAll();
		System.out.println("Alcohol Percentage: "+getAlcoholPercentage()+"%");
		
	
	}
}
