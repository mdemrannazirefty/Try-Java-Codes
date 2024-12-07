package Classes;
public class Shop{
	private static String password="oop1-hasib-sir";
	public static String getPassword(){
		return password;
	}
	private static double totalBill=0 ;
	
	public static void setTotalBill(double a){
		totalBill=a+totalBill;
	}
	
	public static void setBillZero(){
		totalBill=0;
	}
	
	public static double getTotalBill(){
		return totalBill;
	}
	
	private static Medicines[] list=new Medicines[500];	
	private static int index=0;
	
	public static void addMedicines(Medicines m){
		list[index]=m;
		index++;		
	}
	
	public static void showAllS(){
		for(int q=0;q<index;q++){
			if(list[q]!=null){
			System.out.println("\n");
			list[q].showAll();
			System.out.println("______________________________________________");
			System.out.println("\n");
			}			
		}
	}
	
	public static void showMediName(){
		for(int t=0;t<index;t++){
			if(list[t]!=null){
			System.out.println(list[t].getName());
			}			
		}
	}
	
	
	public static void showPrice(){
		for(int t=0;t<index;t++){
			if(list[t]!=null){
			System.out.println(list[t].getName()+": "+list[t].getPrice());
			}			
		}
	}
	
	
	public static void search(String n){
		boolean u=false;
		for(int s=0;s<index;s++){
			if(n.equals(list[s].getName())){
				u=true;
				System.out.println();
				System.out.println("**Medicine Found**");
				System.out.println("Medicine Details: ");
				System.out.println("___________________________________");
				System.out.println();
				list[s].showAll();
				System.out.println();
				System.out.println("___________________________________");
         
			}					
		}
		if(u==false){
			System.out.println();
			System.out.println("**Medicine not found**");
		}
	}
		
	
	public static int find(String n){
		boolean u=false;
		for(int s=0;s<index;s++){
			if(n.equals(list[s].getName())){
				u=true;
                return s;
			}					
		}
		if(u==false){
		}
		return -1;
	}
	
	
	public static void removeMedicines(String k){
	     int r=find(k);
		 if(r>=0){
			list[r]=null;
			System.out.println();
			System.out.println("\nMedicine Deleted");
			System.out.println();
			System.out.println("New Medicines list:");
            System.out.println("___________________");
			System.out.println();
			showMediName();
		 }
		 else
			System.out.println("Medicine not found");
		
	}
	
	public static void addPrice(String k,int s){
	    try{
		int r=find(k);
		 if(r>=0){
			System.out.println();
			System.out.println("Medicine Found,price updated, New price: ");	
			System.out.println("_______________________________________");
			System.out.println();			
			list[r].setPrice(s);
			showPrice();
		 }
		 else{
			System.out.println("Medicine not found");
		 }
		}
	
	    catch(Exception p){
		System.out.println("An Error occured");
	}	
	}
	
	public static int finalPrice(String n){
		boolean u=false;
		int pr=0;
		for(int s=0;s<index;s++){
			if(n.equals(list[s].getName())){
				u=true;
				pr=list[s].getPrice();
                return pr;
			}					
		}
		return pr;
	}
	
	public static int discount(String n){
		boolean u=false;
		int pr=0;
		for(int s=0;s<index;s++){
			if(n.equals(list[s].getName())){
				u=true;
				pr=list[s].getDiscount();
                return pr;
			}					
		}
		return pr;
	}
	
	public static int tax(String n){
		boolean u=false;
		int pr=0;
		for(int s=0;s<index;s++){
			if(n.equals(list[s].getName())){
				u=true;
				pr=list[s].getTax();
                return pr;
			}					
		}
		return pr;
	}
	
	public static double billShop(String n,double priceNapa,double numNapa,double discountNapa,double taxNapa){
		boolean u=false;
		double pr=0;
		for(int s=0;s<index;s++){
			if(n.equals(list[s].getName())){
				u=true;
				pr=list[s].bill(priceNapa,numNapa,discountNapa,taxNapa);
                return pr;
			}					
		}
		return pr;
	}
		
	
}