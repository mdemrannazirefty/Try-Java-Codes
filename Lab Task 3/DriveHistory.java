import java.util.Scanner;
public class DriveHistory
{
	double milesdriven;
	double gallonsused;
	
	public static void main (String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Miles Drive: ");
		double milesdriven=sc.nextDouble();

		System.out.print("Enter Gallons Used: ");
		double gallonsused=sc.nextDouble();
			
		double display=milesdriven/gallonsused;
		System.out.println("Miles per gallon obtained for each trip: "+display);
	}
	
}