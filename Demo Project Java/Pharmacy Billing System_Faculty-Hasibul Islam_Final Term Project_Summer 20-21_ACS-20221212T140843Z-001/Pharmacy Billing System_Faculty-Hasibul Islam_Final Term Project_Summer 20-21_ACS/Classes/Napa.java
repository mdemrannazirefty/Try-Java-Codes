package Classes;

public class Napa extends Medicines{
	private String pregrancyCategory;
	private String sideEffects;
	
	public void setPregrancyCategory(String pregrancyCategory){
		this.pregrancyCategory=pregrancyCategory;
	}
	public String getPregranyCategory(){
		return this.pregrancyCategory;
	}
	
	public void setSideEffects(String sideEffects){
		this.sideEffects=sideEffects;
	}
	public String getSideEffects(){
		return this.sideEffects;
	}	
	
	public Napa(String name,String genericName,String expiryDate,int price,int quantity,int tax,int discount,
	String pregrancyCategory,String sideEffects){
		super(name,genericName,expiryDate,price,quantity,tax,discount);
		this.setPregrancyCategory(pregrancyCategory);
		this.setSideEffects(sideEffects);
	}
	public void showAll(){
		super.showAll();
		System.out.println("Pregrancy Category: "+getPregranyCategory());
		System.out.println("Side Effect: "+getSideEffects());
	}
	
	
	
}