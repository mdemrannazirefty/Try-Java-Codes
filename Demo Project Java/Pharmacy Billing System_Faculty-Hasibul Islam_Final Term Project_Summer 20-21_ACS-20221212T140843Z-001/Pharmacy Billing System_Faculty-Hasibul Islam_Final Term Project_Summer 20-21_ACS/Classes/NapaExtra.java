package Classes;
public class NapaExtra extends Napa{
	private String extraElement;
	
	public void setExtraElement(String extraElement){
		this.extraElement=extraElement;
	}
	public String getExtraElement(){
		return extraElement;
	}
	public NapaExtra(String name,String genericName,String expiryDate,int price,int quantity,int tax,int discount,
	String pregrancyCategory,String sideEffects,String extraElement){
		super(name,genericName,expiryDate,price,quantity,tax,discount,pregrancyCategory,sideEffects);
		this.setExtraElement(extraElement);
	}
	
	public void showAll(){
		super.showAll();
		System.out.println("Extra Elements: "+getExtraElement());
		
		
	}
	
	
	
}