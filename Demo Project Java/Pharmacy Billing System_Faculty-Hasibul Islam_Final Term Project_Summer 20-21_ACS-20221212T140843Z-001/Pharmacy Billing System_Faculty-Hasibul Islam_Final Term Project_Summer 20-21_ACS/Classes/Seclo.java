package Classes;
public class Seclo extends Medicines{
	private String pregrancyCategory;
	private String sideEffects;
	private int needleSize;
	
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
	
	public void setNeedleSize(int needleSize){
		this.needleSize=needleSize;
	}
	public int getNeedleSize(){
		return this.needleSize;
	}
	
	public Seclo(String name,String genericName,String expiryDate,int price,
	int quantity,int tax,int discount,String pregrancyCategory,String sideEffects,int needleSize){
		
		super(name,genericName,expiryDate,price,quantity,tax,discount);
		this.setPregrancyCategory(pregrancyCategory);
		this.setSideEffects(sideEffects);
		this.setNeedleSize(needleSize);
		
		
	}
	
	
	public void showAll(){
		super.showAll();
		System.out.println("Pregrancy Category: "+getPregranyCategory());
		System.out.println("Side Effect: "+getSideEffects());
		System.out.println("Needle Size: "+getNeedleSize()+"mm");
	}
}