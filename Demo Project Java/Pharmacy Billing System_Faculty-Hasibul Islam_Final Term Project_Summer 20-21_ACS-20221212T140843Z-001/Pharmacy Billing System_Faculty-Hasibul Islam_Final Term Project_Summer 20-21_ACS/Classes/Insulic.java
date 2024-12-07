package Classes;
public class Insulic extends InjectionDia{
	private int daysPass; //how many days it will last
	
	public void setDaysPass(int daysPass){
		this.daysPass=daysPass;  //cause insuline must use within a fixed date
	}
	public int getDaysPass(){
		return this.daysPass;
	}
	
	public Insulic(String name,String genericName,String expiryDate,int price,int quantity,int tax,int discount,int sugarLevelDecrease,int needleSize,int daysPass){
		super(name,genericName,expiryDate,price,quantity,tax,discount,sugarLevelDecrease,needleSize);
		this.setDaysPass(daysPass);
	}
	
	
	public void showAll(){
		super.showAll();
		System.out.println("After opening the cap the day it will last: "+getDaysPass());
		
		
	}
	
}