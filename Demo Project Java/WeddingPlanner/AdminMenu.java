package WeddingPlanner;

import java.util.Scanner;

public class AdminMenu {
	
	WeddingSystem weddingSystem;
	
	public AdminMenu() {
        this.weddingSystem = WeddingSystem.getInstance();
    }
	
	public static int admin_menu() {

		int selection;
		Scanner input = new Scanner(System.in);

		/***************************************************/

		System.out.println("Choose from these choices");
		System.out.println("-------------------------\n");
		System.out.println("1 - View Pending Projects");
		System.out.println("");
		System.out.println("2 - View Approved Projects");
		System.out.println("");
		System.out.println("3 - Remove All Projects");
		System.out.println("");
		System.out.println("4 - Search A Project");
		System.out.println("");
		System.out.println("5 - LOG OUT");
		System.out.println("");
		System.out.print("Enter option: ");
		
		selection = input.nextInt();
		
		input.nextLine();
		
		//input.close();
		return selection;
	}
}
