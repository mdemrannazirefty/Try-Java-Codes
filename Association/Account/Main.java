import java.util.Scanner;
public class Main {
	public static void main(String args[]){
	
	Account a1=new Account("MD. EMRAN NAZIR EFTY","47802",10000);
	a1.show();
	Account a2=new Account("JOBAIR ISLAM","47800",15000);
	a2.show();
	
	Scanner sc=new Scanner(System.in);
	System.out.print("* Transfer Amount IS: ");
	int money=sc.nextInt();
	
	Transfer t=new Transfer() ;
	t.Transfer(money,a1,a2);
	a1.show();
	a2.show();
	}

}
