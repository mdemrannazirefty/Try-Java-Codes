import java.util.Scanner;

public class UserMenu {
	public static int main_menu() {

		int selection;
		Scanner input = new Scanner(System.in);

		/***************************************************/

		System.out.println("Choose from these choices");
		System.out.println("-------------------------\n");
		System.out.println("1 - Add Event");
		System.out.println("");
		System.out.println("2 - View Pending Events");
		System.out.println("");
		System.out.println("3 - View Approved Events");
		System.out.println("");
		System.out.println("4 - LOG OUT");
		System.out.println("");
		System.out.print("Enter option: ");
		
		selection = input.nextInt();
		
		input.nextLine();
		
		//input.close();
		return selection;
	}
}
