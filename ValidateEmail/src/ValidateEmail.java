import java.util.Scanner;

public class ValidateEmail {
	
	public static void main(String[]args){
		
		String result = "[a-zA-Z0-9@.]";
	
		System.out.print("ENTER YOUR Email:");
		Scanner sc= new Scanner(System.in);
		
        String word = sc.nextLine();
        //boolean result = word.matches("[a-zA-Z0-9@.]");
		
		if (word=="[a-zA-Z0-9 && @ &&.)"
		{
			System.out.println("Valid Email");
		}

		else 
		{
			System.out.println("Invalid Email");
		}
	}
}