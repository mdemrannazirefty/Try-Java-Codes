import Classes.*;
import java.util.*;
import java.lang.System.*;
import java.text.SimpleDateFormat;
import java.io.*;


public class Main{ 
	public static void main(String[] args){
	
	
	
	Scanner sc=new Scanner(System.in);	
	Date date=new Date();

    
	Medicines napa=new Napa("Napa","Paracetamol","12/08/23",10,12,4,10,"A(No risk in controlled human studies)","No Side Effects found");
	Medicines napaExtra=new NapaExtra("Napa Extra","Paracetamol+Caffeine","21/12/24",30,13,2,6,"A(No risk in controlled human studies)","No Side Effects found","Caffeine");
	Medicines sirap=new Sirap("Sirap","Cacl-1","10/06/25",40,5,4,14,"Safe");
	Medicines seclo=new Seclo("Seclo","Omeprazol","15/01/26",50,15,2,9,"B (No risk in other studies)","If we use this medicine long term it could damage our Kidney",5);
	Medicines kidN=new KidN("KidN","Kalkin","15/05/27",55,15,8,1,"Yes");
	Medicines insulic=new Insulic("Insulin","Isophane","08/08/2022",65,15,12,19,5,7,30);
	Medicines injectionDia=new InjectionDia("Injection","Square","09/11/2030",800,6,4,2,8,4);
	Medicines diamedi=new Diamedi("Diamedi","Valmin","03/04/2022",25,10,7,5,3);
	Medicines dayatol=new Dayatol("Dayatol","Milaton","13/12/2031",60,5,8,4);
	Medicines dip=new Dip("Dip","h2h6","25/23/29",36,12,4,20,30);
	
    Shop s=new Shop();
	
	Shop.addMedicines(napa);
	Shop.addMedicines(napaExtra);
	Shop.addMedicines(sirap);
	Shop.addMedicines(seclo);
	Shop.addMedicines(kidN);
	Shop.addMedicines(insulic);
	Shop.addMedicines(injectionDia);
	Shop.addMedicines(diamedi);
	Shop.addMedicines(dayatol);
	Shop.addMedicines(dip);
	
	
	System.out.println("\n             **Welcome to Asheke and Shihab's Pharmacy**");
	System.out.println("             ____________________________________________");
	System.out.println();	
	System.out.println("We offer Napa,Napa Extra,Sirap,Seclo,KidN,Insulin,Injection,Diamedi,Dip.");
	System.out.println("_______________________________________________________________________________");
	boolean i=true;
	while(i){
		System.out.println();
		System.out.println("\nHere are some option for you:");
		System.out.println("1.Add Price or edit the default price of the medicine(Only for admins)");
		System.out.println("2.Remove Medicine (Only for admins)");
		System.out.println("3.Search Medicine");
		System.out.println("4.Show all medicines informations");
		System.out.println("5.Cart & Bill Generation");
		System.out.println("6.Exit");
		System.out.println();
	    System.out.print("Please type the input here:");
		
		int f1=sc.nextInt(); 
		String error=sc.nextLine();
		
	if(f1>0 && f1<7){	
	switch(f1){
			case 1:
			System.out.print("Enter the admin password: ");
			String passwordAdmin=sc.nextLine();
			String a=Shop.getPassword();
			if(passwordAdmin.equals(a)){
			System.out.print("Enter the Medicine name which default price you want to change: ");		
			String pmn=sc.nextLine();
			System.out.print("Enter the price you want to add: ");
			int price=sc.nextInt(); // could occur error 
			Shop.addPrice(pmn,price);
			}
			else{
				System.out.print("Wrong Password");
			}
			break;
			
			case 2:
			System.out.print("Enter the admin password: ");
			String passwordAdmin1=sc.nextLine();
			String aa=Shop.getPassword();
			if(passwordAdmin1.equals(aa)){
			System.out.print("Enter the Medicine name which you want to remove from the list: ");
			String removeMedicine=sc.nextLine();
			Shop.removeMedicines(removeMedicine);
			}
			else
				System.out.println("Wrong Password");
			break;
			
			case 3:
			System.out.print("Enter the Medicine name which you want to search from the list: ");
			String searchMedicine=sc.nextLine();
			Shop.search(searchMedicine);
			break;
			
			case 4:
			System.out.print("\n\nAll Medicine's Informations:");
			Shop.showAllS();
			break;
			
			case 5:		
			boolean t=true; 
			while(t){ 
			System.out.println();
			System.out.println();
			System.out.println("Enter 1 to buy Napa");
			System.out.println("Enter 2 to buy Napa Extra");
			System.out.println("Enter 3 to buy Sirap");
			System.out.println("Enter 4 to buy Seclo");
			System.out.println("Enter 5 to buy KidN");
			System.out.println("Enter 6 to buy Insulin");
			System.out.println("Enter 7 to buy Injection");
			System.out.println("Enter 8 to buy Diamedi");
			System.out.println("Enter 9 to buy Dayatol");
			System.out.println("Enter 10 to buy Dip");
			System.out.println("Enter 11 if you are Done");
			System.out.println();
			System.out.print("Please type the input here: ");
			int option=sc.nextInt();
			if(option<12 && option>0){
			switch(option){
				case 1:
				
				System.out.println("______________________________________________");
				System.out.println();
				System.out.print("Number of Napa you want to buy: ");
				double numNapa=sc.nextInt();				
				double priceNapa=Shop.finalPrice("Napa");
				double discountNapa=Shop.discount("Napa");
				double taxNapa=Shop.tax("Napa");
				double napaBill=Shop.billShop("Napa",priceNapa,numNapa,discountNapa,taxNapa);		    
			    System.out.println("Unit Price: "+priceNapa+" Taka");
			    System.out.println("Discount: "+discountNapa+"%");
			    System.out.println("Tax: "+taxNapa+"%");
				System.out.println("Total price: "+napaBill+" Taka");
				Shop.setTotalBill(napaBill);
			    System.out.println("______________________________________________");
				break;
				case 2:
				
				System.out.println("______________________________________________");
				System.out.print("Number of Napa Extra you want to buy: ");
				double numNapaExtra=sc.nextInt();				
				double priceNapaExtra=Shop.finalPrice("Napa Extra");
				double discountNapaExtra=Shop.discount("Napa Extra");
				double taxNapaExtra=Shop.tax("Napa Extra");
				double napaExtraBill=Shop.billShop("Napa Extra",priceNapaExtra,numNapaExtra,discountNapaExtra,taxNapaExtra);		    
			    System.out.println("Unit Price: "+priceNapaExtra+" Taka");
			    System.out.println("Discount: "+discountNapaExtra+"%");
			    System.out.println("Tax: "+taxNapaExtra+"%");
				System.out.println("Total price: "+napaExtraBill+" Taka");
				Shop.setTotalBill(napaExtraBill);
				System.out.println("______________________________________________");
				
				break;
				
				case 3:
				
				System.out.println("______________________________________________");
				System.out.print("Number of Sirap you want to buy: ");
				double numSirap=sc.nextInt();				
				double priceSirap=Shop.finalPrice("Sirap");
				double discountSirap=Shop.discount("Sirap");
				double taxSirap=Shop.tax("Sirap");
				double sirapBill=Shop.billShop("Sirap",priceSirap,numSirap,discountSirap,taxSirap);		    
			    System.out.println("Unit Price: "+priceSirap+" Taka");
			    System.out.println("Discount: "+discountSirap+"%");
			    System.out.println("Tax: "+taxSirap+"%");
				System.out.println("Total price: "+sirapBill+" Taka");
				Shop.setTotalBill(sirapBill);
				System.out.println("______________________________________________");
				break;
				
				case 4:
				
				System.out.println("______________________________________________");
				System.out.print("Number of Seclo you want to buy: ");
				double numSeclo=sc.nextInt();				
				double priceSeclo=Shop.finalPrice("Seclo");
				double discountSeclo=Shop.discount("Seclo");
				double taxSeclo=Shop.tax("Seclo");
				double secloBill=Shop.billShop("Seclo",priceSeclo,numSeclo,discountSeclo,taxSeclo);		    
			    System.out.println("Unit Price: "+priceSeclo+" Taka");
			    System.out.println("Discount: "+discountSeclo+"%");
			    System.out.println("Tax: "+taxSeclo+"%");
				System.out.println("Total price: "+secloBill+" Taka");
				Shop.setTotalBill(secloBill);
				System.out.println("______________________________________________");
				break;
				
				case 5:
				
				System.out.println("______________________________________________");
				System.out.print("Number of KidN you want to buy: ");
				double numKidN=sc.nextInt();				
				double priceKidN=Shop.finalPrice("KidN");
				double discountKidN=Shop.discount("KidN");
				double taxKidN=Shop.tax("KidN");
				double kidNBill=Shop.billShop("KidN",priceKidN,numKidN,discountKidN,taxKidN);		    
			    System.out.println("Unit Price: "+priceKidN+" Taka");
			    System.out.println("Discount: "+discountKidN+"%");
			    System.out.println("Tax: "+taxKidN+"%");
				System.out.println("Total price: "+kidNBill+" Taka");
				Shop.setTotalBill(kidNBill);
				System.out.println("______________________________________________");
				
				break;
								
				case 6:
				
				System.out.println("______________________________________________");
				System.out.print("Number of Insulin you want to buy: ");
				double numInsulin=sc.nextInt();				
				double priceInsulin=Shop.finalPrice("Insulin");
				double discountInsulin=Shop.discount("Insulin");
				double taxInsulin=Shop.tax("Insulin");
				double insulinBill=Shop.billShop("Insulin",priceInsulin,numInsulin,discountInsulin,taxInsulin);		    
			    System.out.println("Unit Price: "+priceInsulin+" Taka");
			    System.out.println("Discount: "+discountInsulin+"%");
			    System.out.println("Tax: "+taxInsulin+"%");
				System.out.println("Total price: "+insulinBill+" Taka");
				Shop.setTotalBill(insulinBill);
				System.out.println("______________________________________________");
				
				break;
				
				case 7:
				
			    System.out.println("______________________________________________");
				System.out.print("Number of Injection you want to buy: ");
				double numInjection=sc.nextInt();				
				double priceInjection=Shop.finalPrice("Injection");
				double discountInjection=Shop.discount("Injection");
				double taxInjection=Shop.tax("Injection");
				double injectionBill=Shop.billShop("Injection",priceInjection,numInjection,discountInjection,taxInjection);		    
			    System.out.println("Unit Price: "+priceInjection+" Taka");
			    System.out.println("Discount: "+discountInjection+"%");
			    System.out.println("Tax: "+taxInjection+"%");
				System.out.println("Total price: "+injectionBill+" Taka");
				Shop.setTotalBill(injectionBill);
				System.out.println("______________________________________________");
				
				break;
				
				case 8:
				
				System.out.println("______________________________________________");
				System.out.print("Number of Diamedi you want to buy: ");
				double numDiamedi=sc.nextInt();				
				double priceDiamedi=Shop.finalPrice("Diamedi");
				double discountDiamedi=Shop.discount("Diamedi");
				double taxDiamedi=Shop.tax("Diamedi");
				double diamediBill=Shop.billShop("Diamedi",priceDiamedi,numDiamedi,discountDiamedi,taxDiamedi);		    
			    System.out.println("Unit Price: "+priceDiamedi+" Taka");
			    System.out.println("Discount: "+discountDiamedi+"%");
			    System.out.println("Tax: "+taxDiamedi+"%");
				System.out.println("Total price: "+diamediBill+" Taka");
				Shop.setTotalBill(diamediBill);
				System.out.println("______________________________________________");
				
				break;
				
				
				case 9:
				
				
				System.out.println("______________________________________________");
				System.out.print("Number of Dayatol you want to buy: ");
				double numDayatol=sc.nextInt();				
				double priceDayatol=Shop.finalPrice("Dayatol");
				double discountDayatol=Shop.discount("Dayatol");
				double taxDayatol=Shop.tax("Dayatol");
				double dayatolBill=Shop.billShop("Dayatol",priceDayatol,numDayatol,discountDayatol,taxDayatol);		    
			    System.out.println("Unit Price: "+priceDayatol+" Taka");
			    System.out.println("Discount: "+discountDayatol+"%");
			    System.out.println("Tax: "+taxDayatol+"%");
				System.out.println("Total price: "+dayatolBill+" Taka");
				Shop.setTotalBill(dayatolBill);
				System.out.println("______________________________________________");
				
				break;
				
				case 10:
				
				System.out.println("______________________________________________");
				System.out.print("Number of Dip you want to buy: ");
				double numDip=sc.nextInt();				
				double priceDip=Shop.finalPrice("Dip");
				double discountDip=Shop.discount("Dip");
				double taxDip=Shop.tax("Dip");
				double dipBill=Shop.billShop("Dip",priceDip,numDip,discountDip,taxDip);		    
			    System.out.println("Unit Price: "+priceDip+" Taka");
			    System.out.println("Discount: "+discountDip+"%");
			    System.out.println("Tax: "+taxDip+"%");
				System.out.println("Total price: "+dipBill+" Taka");
				Shop.setTotalBill(dipBill);			
				System.out.println("______________________________________________");
				
				break;
				
				case 11:
				System.out.println();
				System.out.println("________________________________________________________________________________");
				System.out.println();			
				System.out.print("Your total bill is: ");
				System.out.print(Shop.getTotalBill());
				System.out.println(" Taka");
				
				double bb=Shop.getTotalBill();
				String ss=String.valueOf(bb);  
				
				System.out.println();
				System.out.println("Time and Date: "+date);
				Shop.setBillZero();				
				System.out.println("****Thanks for shopping with us********");
				System.out.println();				
				System.out.println("Please fill up the form ,it will help us to make our service better: ");
				System.out.println("___________________________________________________________________________________");
				System.out.println();	
				System.out.print("Your name: ");
				String error1=sc.nextLine();
				String customerName=sc.nextLine();
				System.out.println();
				System.out.print("Your Phone number: ");
				String customerPhoneNumber=sc.nextLine();
				System.out.println();
				System.out.print("Your address: ");
				String customerAddress=sc.nextLine();
				System.out.println();
				
				try{
		
		        FileWriter aaa=new FileWriter("C:\\Users\\mdash\\Desktop\\Finalize\\Java project\\Files\\oop1.txt",true);
		        
				aaa.write("\n\n\n");

  			    aaa.write("Customer Name: "+customerName+"\n");
				
		        aaa.write("Customer Phone Number: "+customerPhoneNumber+"\n");
				
		        aaa.write("Customer Address: "+customerAddress+"\n");
		        
				aaa.write("Total bill: "+ss+"\n");
					
				aaa.write("Time and Date: "+date+"\n");
								
				aaa.write("___________________________________________________________________________________");
			    
		        aaa.close();		
	            }
	            catch(Exception p){
		        System.out.print(p);
	            }
				

				
				t=false;
				break;
				
				
			}
			}
			else
				System.out.println("Wrong input, please try again");
			}
			break;
			
			case 6:
			System.out.println("\nThanks for being with us....");
			System.out.println("");
			i=false;
			
        		
			
			
	}	
	}
	else{
		System.out.println("\nInvalid input,please try again");
	}
	
	
	
	
	}
	
}
}