package Classes;
public class KidN extends Medicines{
	private String safeForKidney;
	
	public void setSafeForKidney(String safeForKidney){
		this.safeForKidney=safeForKidney;
	}
	public String getSafeForKidney(){
		return this.safeForKidney;
	}
	public KidN(String name,String genericName,String expiryDate,int price,int quantity,int tax,int discount,String safeForKidney){
		super(name,genericName,expiryDate,price,quantity,tax,discount);
		this.setSafeForKidney(safeForKidney);
	}
	
	public void showAll(){
		super.showAll();
		System.out.println("Safe for Kidney: "+getSafeForKidney());
		
	}
}