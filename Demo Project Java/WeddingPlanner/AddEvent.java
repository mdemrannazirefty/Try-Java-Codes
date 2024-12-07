import java.util.Scanner;

public class AddEvent {
	public static int add() {
		Scanner scanner = new Scanner(System.in);
		final WeddingSystem in = WeddingSystem.getInstance();
		Event star_package = in.myTotalEvents[0];
        String star_string = "";
        for (int i = 0; i < star_package.specifications.length; ++i) {
        	star_string = star_string + (i + 1) + " " + star_package.specifications[i] + "\n";
        }
        
        Event gold_package = in.myTotalEvents[1];
        String gold_string = "";
        for (int i = 0; i < gold_package.specifications.length; ++i) {
        	gold_string = gold_string + (i + 1) + " " + gold_package.specifications[i] + "\n";
        }
        
        Event platinum_package = in.myTotalEvents[2];
        String platinum_string = "";
        for (int i = 0; i < platinum_package.specifications.length; ++i) {
        	platinum_string = platinum_string + (i + 1) + " " + platinum_package.specifications[i] + "\n";
        }
        
        Event vip_package = in.myTotalEvents[3];
        String vip_string = "";
        for (int i = 0; i < vip_package.specifications.length; ++i) {
        	vip_string = vip_string + (i + 1) + " " + vip_package.specifications[i] + "\n";
        }
		
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("PACKAGES: ");
		System.out.println("(1) STAR PACKAGE");
		System.out.println("----------------------");
		System.out.println("ID: 1");
		System.out.println("Specifications:\n " + star_string);
		System.out.println("Price range: " + star_package.costRange.toString());
		System.out.println("");
		System.out.println("----------------------");
		System.out.println("(2) GOLD PACKAGE");
		System.out.println("----------------------");
		System.out.println("ID: 2");
		System.out.println("Specifications:\n " + gold_string);
		System.out.println("Price range: " + gold_package.costRange.toString());
		System.out.println("");
		System.out.println("----------------------");
		System.out.println("(3) PLATINUM PACKAGE");
		System.out.println("----------------------");
		System.out.println("ID: 3");
		System.out.println("Specifications:\n " + platinum_string);
		System.out.println("Price range: " + platinum_package.costRange.toString());
		System.out.println("");
		System.out.println("----------------------");
		System.out.println("");
		System.out.println("(4) VIP PACKAGE");
		System.out.println("----------------------");
		System.out.println("ID: 4");
		System.out.println("Specifications:\n " + vip_string);
		System.out.println("Price range: " + vip_package.costRange.toString());
		System.out.println("----------------------");
		System.out.println("");
		System.out.print("Enter event no(Enter 5 to exit and 6 to go back): ");
		int selection = scanner.nextInt();
		
		scanner.nextLine();
		
		return selection;
	}
}
