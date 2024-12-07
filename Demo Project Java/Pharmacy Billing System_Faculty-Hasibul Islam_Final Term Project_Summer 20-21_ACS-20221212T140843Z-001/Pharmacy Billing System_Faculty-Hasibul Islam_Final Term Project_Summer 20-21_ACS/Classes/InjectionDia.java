package Classes;
public class InjectionDia extends Diamedi{
	private int needleSize;
	
	public void setNeedleSize(int needleSize){
		this.needleSize=needleSize;
	}
	public int getNeedleSize(){
		return needleSize;
	}
	
	public InjectionDia(String name,String genericName,String expiryDate,int price,int quantity,int tax,int discount,int sugarLevelDecrease,int needleSize){
		super(name,genericName,expiryDate,price,quantity,tax,discount,sugarLevelDecrease);
		this.setNeedleSize(needleSize);
	}
	
	public void showAll(){
		super.showAll();
		System.out.println("Needle Size: "+getNeedleSize()+"mm");
		
	}
}