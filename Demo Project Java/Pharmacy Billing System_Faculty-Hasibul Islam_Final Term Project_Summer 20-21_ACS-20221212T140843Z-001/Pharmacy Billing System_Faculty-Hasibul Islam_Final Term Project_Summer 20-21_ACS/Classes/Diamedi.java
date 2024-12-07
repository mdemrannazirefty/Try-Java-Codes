package Classes;
public class Diamedi extends Medicines{  //diabetics medice it is inherited by InjectionDia and InjectionDia is inherited by insulin
	private int sugarLevelDecrease;
	
	public void setSugarLevelDecrease(int sugarLevelDecrease){
	    this.sugarLevelDecrease=sugarLevelDecrease;
	}
	public int getSugarLevelDecrease(){
		return sugarLevelDecrease;
	}
	public Diamedi(String name,String genericName,String expiryDate,int price,int quantity,int tax,int discount,int sugarLevelDecrease){
		super(name,genericName,expiryDate,price,quantity,tax,discount);
		this.setSugarLevelDecrease(sugarLevelDecrease);
	}
	
	public void showAll(){
		super.showAll();
		System.out.println("Sugar level will decrease approximaitly: "+getSugarLevelDecrease()+"%");
		
	}
}