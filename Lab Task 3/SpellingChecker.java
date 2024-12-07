import java.util.Scanner;

public class SpellingChecker
{
    public static void main(String[] args)
	{
		System.out.print("ENTER YOUR WORD:");
		Scanner sc= new Scanner(System.in);
		
        String word = sc.nextLine();
        boolean result = word.matches("[a-zA-Z]+");
		
		if (result= true)
		{
			System.out.println("Correct Sentence");
		}
		else
		{
			System.out.println("Only Letters Are Accepted");
		}
        
    }
}