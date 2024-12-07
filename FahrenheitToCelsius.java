import java.util.Scanner;
public class FahrenheitToCelsius
{
	public static void main (String[]args)
{
	Scanner input=new Scanner(System.in);
	double fahrenheit,celsius;
	
	System.out.print("Enter Fahrenheit: ");
	fahrenheit=input.nextDouble();
	
	celsius=(0.5*fahrenheit-32);
	System.out.println("Your fah to cel Is: "+celsius);

}
}




