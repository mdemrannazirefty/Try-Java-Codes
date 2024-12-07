import java.util.Scanner;

public class ScannerDemo{
	public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	
	System.out.print("Enter Your Name: " );
	String name=sc.nextLine();
	
	System.out.print("Enter Your Gender: ");
	char gender=sc.next().charAt(0);
	
	System.out.print("Enter Your Age: ");
	int age= sc.nextInt();
	
	System.out.print("Enter Your Mobile Number: ");
	long mobileNo=sc.nextLong();
	
	System.out.print("Enter Your CGPA: ");
	double cgpa=sc.nextDouble();
	
	
	
	System.out.print("Enter Your Blood Group: " );
	String blood=sc.nextLine();
	sc.nextLine();
	
	System.out.print("Enter Your Semester: ");
	char sem=sc.next().charAt(0);
	
	System.out.print("Enter Your Depertment: ");
	String dep=sc.nextLine();
	sc.nextLine();
	
	System.out.print("Enter Your Admit Year: ");
	long ayear=sc.nextLong();
	
	System.out.print("Enter Your Gur Number: ");
	long gnumber=sc.nextLong();
	
	
	System.out.println();
	System.out.println();
	System.out.println("========================================");
	System.out.println("Name Is         : " +name );
	System.out.println("Gender is       : " +gender);
	System.out.println("Age Is          : " +age);
	System.out.println("Mobile Number is: "+mobileNo );
	System.out.println("CGPA Is         : " +cgpa);
	
	System.out.println("Blood Group Is  : " +blood );
	System.out.println("Semester is     : " +sem);
	System.out.println("Depertment Is   : " +dep);
	System.out.println("Admit Year Is   : " +ayear );
	System.out.println("Gurgian Num Is  : " +gnumber);
	System.out.println("========================================");

	}
}