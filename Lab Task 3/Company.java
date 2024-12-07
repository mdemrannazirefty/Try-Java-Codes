import java.util.Scanner;
public class Company
{	
	public static void main(String[]args)
	{
		double x,result;
	
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter Your Weekly Sell: " );
		x=sc.nextDouble();
		
		result= x*0.09+200;
		System.out.println("Week Earning is: " +result+ "$");
	}
	
}