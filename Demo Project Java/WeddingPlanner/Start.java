import java.util.Scanner;

public class Start {
	WeddingSystem in;

	public Start() {
		this.in = WeddingSystem.getInstance();
	}

	public static void main(String[] args) {
		Start start = new Start();
		start.main_menu();
	}

	public static String[] myVenus;
	public static int count;
	public String username;

	static {
		Start.myVenus = new String[] { "Sena Malancha", "Celebration Hall", "Dhaka Regency Hotel & Resort", "Event 71",
				"White Hall Convention Center" };
		Start.count = 1;
	}

	public void user_menu() {
		
		int selection;
		Scanner input = new Scanner(System.in);

		/***************************************************/
        System.out.println("");
		System.out.println("");
		System.out.println("\t\t\t\t\t\t  ***USER MENU***");
		System.out.println("\t\t\t\t\t\t  Choose from these choices");
		System.out.println("\t\t\t\t\t\t  ----------------------------------");
		System.out.println("\t\t\t\t\t\t  ||  1 - Add Event               ||");          
		System.out.println("\t\t\t\t\t\t  ----------------------------------");
		System.out.println("\t\t\t\t\t\t  ||  2 - View Pending Events     ||");
		System.out.println("\t\t\t\t\t\t  ----------------------------------");
		System.out.println("\t\t\t\t\t\t  ||  3 - View Approved Events    ||");
		System.out.println("\t\t\t\t\t\t  ----------------------------------");
		System.out.println("\t\t\t\t\t\t  ||  4 - LOG OUT                 ||");              
		System.out.println("\t\t\t\t\t\t  ----------------------------------\n");
		System.out.println("");
		System.out.print("\t\t\t\t\t\t    ->Enter option: ");

		selection = input.nextInt();

		input.nextLine();

		switch (selection) {
		case 1:
		
			int n = AddEvent.add();
			if (n > 0 && n < 5) {
				add_event(n);
			} else {
				clearConsole();
				user_menu();
			}
			break;
		case 2:
			this.pending_events();
			break;
		case 3:
			this.approved_projects();
			break;
		case 4:
			this.in.saveToFile();
			clearConsole();
			this.main_menu();
			break;
		default:
			this.in.saveToFile();
			clearConsole();
			this.main_menu();
			break;
		}

		// input.close();
	}

	public void approved_projects() {
		clearConsole();
		String leftAlignFormat = "| %-15s | %-15s | %-15s | %-15s | %-15s | %-15s |%n";

		System.out.format(
				"+-----------------+----------------+----------------+----------------+----------------+----------------+%n");
		System.out.format(
				"| ID              | Package name   |   Owner        | Admin Cost     | Venue          | Planner        |%n");
		System.out.format(
				"+-----------------+----------------+----------------+----------------+----------------+----------------+%n");

		for (int i = 0; i < this.in.myApprovedUserEvents.size(); ++i) {
			final UserEvents temp = this.in.myApprovedUserEvents.get(i);
			if (temp.p != null) {
				if (temp.u.username.equals(this.username) && temp.status == 1) {
					System.out.format(leftAlignFormat, temp.id, temp.e.packageName, temp.u.username, temp.adminCost,
							temp.venue, temp.p.username);
				}
			} else {
				System.out.format(leftAlignFormat, temp.id, temp.e.packageName, temp.u.username, temp.adminCost,
						temp.venue, "NULL");
			}
		}

		System.out.format(
				"+-----------------+----------------+----------------+----------------+----------------+----------------+%n");
		System.out.println("\n\n");
		System.out.println("Want to add venue?(yes or no); ");
		Scanner scanner = new Scanner(System.in);
		String choice = scanner.nextLine();

		if (choice.equalsIgnoreCase("no")) {
			this.user_menu();
		} else if (choice.equalsIgnoreCase("yes")) {
			System.out.println("1. From existing venue");
			System.out.println("2. Custom venue");
			System.out.println("3. Quit");
			System.out.println("Enter your choice");
			int venue_choose = scanner.nextInt();

			if (venue_choose == 1) {
				System.out.println("Enter ID: ");
				int event_id = scanner.nextInt();
				System.out.println("\n\nChoose venue: ");
				for (int i = 0; i < this.in.existingEvents.length; i++) {
					System.out.println(Integer.toString((i + 1)) + " " + this.in.existingEvents[i]);
				}
				int venue_id = scanner.nextInt();
				String venv = this.in.existingEvents[venue_id - 1];
				this.add_venue(event_id, venv);
			} else if (venue_choose == 2) {
				System.out.println("Enter ID: ");
				int event_id = scanner.nextInt();
				scanner.nextLine();
				System.out.println("Venue name: ");
				String venv = scanner.nextLine();
				this.add_venue(event_id, venv);
			} else {
				this.in.saveToFile();
				this.main_menu();
			}
		} else {
			this.in.saveToFile();
			System.exit(0);
		}

		scanner.close();
		// this.user_menu();
	}

	public void add_venue(int event_id, String venv) {
//		System.out.println(event_id);
//		System.out.println(venv);
		try {
			if (event_id == 0 || venv.equals("")) {
				System.out.println("Some Fields Empty !");
				this.approved_projects();
			}
			final UserEvents temp = this.in.getUserEvent(event_id);
			if (temp == null) {
				System.out.println("No Such package exists!");
				this.approved_projects();
			}
			if (temp.setVenue(venv)) {
				System.out.println("Venue Set Successfully!");
				this.in.saveToFile();
				this.user_menu();
			} else {
				System.out.println("Venue already decided");
				this.approved_projects();
			}
		} catch (Exception e) {
			System.out.println("Error Occured!");
			this.approved_projects();
		}
	}

	public void pending_events() {
		clearConsole();
		String leftAlignFormat = "| %-15s | %-15s | %-15s | %-15s |%n";

		System.out.format("+-----------------+--------------------+----------------+----------------+%n");
		System.out.format("| ID              | Package name       | Cost range     | Username       |%n");
		System.out.format("+-----------------+--------------------+----------------+----------------+%n");

		for (int i = 0; i < this.in.myPendingUserEvents.size(); ++i) {
			final UserEvents temp = this.in.myPendingUserEvents.get(i);
			if (temp.u.username.equals(this.username) && temp.status == 0) {
				System.out.format(leftAlignFormat, temp.id, temp.e.packageName, temp.e.costRange, temp.u.username);
			}
		}

		System.out.format("+-----------------+--------------------+----------------+----------------+%n");
		System.out.println("\n\n");
		this.user_menu();
	}

	public void add_event(int num) {
		
		final WeddingSystem in = WeddingSystem.getInstance();
		final UserEvents ue = new UserEvents(in.getEvent(num), in.getUser(username), 0, count++);
		in.myPendingUserEvents.add(ue);
		System.out.println("Successfully added event to Pending Events !");
		this.in.saveToFile();
		this.user_menu();
	}

	public void main_menu() {
		int selection;
		Scanner scanner = new Scanner(System.in);
		System.out.println("");
		System.out.println("");
        System.out.println("\t\t\t\t\t\t\t\t        ######**WELCOME**######");
		System.out.println("\t\t\t\t\t\t\t\t------------------------------------------");
		System.out.println("\t\t\t\t\t\t\t\t------------------------------------------");
		System.out.println("\t\t\t\t\t\t\t\t|| #HAPPY COUPLE WEDDING PLANNER SYSTEM#||");
		System.out.println("\t\t\t\t\t\t\t\t------------------------------------------");
		System.out.println("\t\t\t\t\t\t\t\t------------------------------------------");
		System.out.println("\t\t\t\t\t\t\t\t  ##Choose from these choices##");
		System.out.println("");
		System.out.println("");
		System.out.println("\t\t\t  -----------------                                  ----------------                                                    ----------");
		System.out.println("\t\t\t  ||   Admin     ||                                  ||  Planner   ||                                                    || User ||");
		System.out.println("\t\t\t  -----------------                                  ----------------                                                    ----------");
		System.out.println("");
		System.out.println("");
		System.out.println("\t\t\t ---------------------                             -------------------                                                 ----------------");
		System.out.println("\t\t\t || 1 - Admin login ||                             ||3-Planner Login||                                                 ||5-User Login||");
		System.out.println("\t\t\t ---------------------                             -------------------                                                 ----------------");
		System.out.println("");
		System.out.println("");
		System.out.println("\t\t\t --------------------------                        ----------------------                                              -------------------");
		System.out.println("\t\t\t ||  2 - Admin Reegister ||                        ||4-Planner Register||                                              ||6-User Register||");
		System.out.println("\t\t\t --------------------------                        ----------------------                                              -------------------");
		System.out.println("");
		System.out.println("");
		System.out.println("\t\t\t\t\t\t  ------------------------------");
		System.out.println("\t\t\t\t\t\t    7 - Exit                ");
		System.out.println("\t\t\t\t\t\t  ------------------------------\n");
		System.out.print("\t\t\t\t\t\t\t   ->Enter option: ");

		selection = scanner.nextInt();

		scanner.nextLine();

		switch (selection) {
		case 1:
		    System.out.println("");
			System.out.println("");
			System.out.println("\t\t\t\t\t\t    **ADMIN LOGIN**");
			System.out.println("\t\t\t\t\t\t    ----------------");
			System.out.print("\t\t\t\t\t\t    -> Enter Username: ");
			String username = scanner.nextLine();
			System.out.println("");
			System.out.print("\t\t\t\t\t\t    -> Enter Password: ");
			String password = scanner.nextLine();
			final Admin u = new Admin(username, password);
			if (u.login()) {
				this.username = username;
				this.admin_menu();
			} else {
				System.out.println("\t\t\t\t\t\t    Invalid Username or Password!");
				this.main_menu();
			}
			break;

		case 2:
		    System.out.println("");
			System.out.println("");
			System.out.println("\t\t\t\t\t\t   **ADMIN REGISTER**");
			System.out.println("\t\t\t\t\t\t   ------------------\n");
			System.out.print("\t\t\t\t\t\t    ->Enter username: ");
			username = scanner.nextLine();
			System.out.println("");
			System.out.print("\t\t\t\t\t\t    ->Enter password: ");
			password = scanner.nextLine();
			final Admin user = new Admin(username, password);
			if (user.register()) {
				this.in.saveToFile();
				System.out.println("\t\t\t\t\t\t    Successfully registered as admin\n");
				this.main_menu();
			} else {
				System.out.println("\t\t\t\t\t\t    Invalid input or username is already taken");
			}
			break;
		case 3:
		    System.out.println("");
			System.out.println("");
			System.out.println("\t\t\t\t\t\t    **PLANNER LOGIN**");
			System.out.println("\t\t\t\t\t\t    ------------------\n");
			System.out.print("\t\t\t\t\t\t    ->tEnter username: ");
			username = scanner.nextLine();
			System.out.println("");
			System.out.print("\t\t\t\t\t\t    ->Enter password: ");
			password = scanner.nextLine();
			final Planner up = new Planner(username, password);
			if (up.login(username, password)) {
				this.username = username;
				this.planner_menu();
			} else {
				System.out.println("\t\t\t\t\t\t    Invalid input or username is already taken");
			}
			break;
		case 4:
		    System.out.println("");
			System.out.println("");
			System.out.println("\t\t\t\t\t\t    **PLANNER REGISTER**");
			System.out.println("\t\t\t\t\t\t    ---------------------\n");
			System.out.print("\t\t\t\t\t\t    ->Enter username: ");
			username = scanner.nextLine();
			System.out.println("");
			System.out.print("\t\t\t\t\t\t    ->Enter password: ");
			password = scanner.nextLine();
			final Planner planner = new Planner(username, password);
			if (planner.register(username, password)) {
				this.in.saveToFile();
				System.out.println("\t\t\t\t\t\t    Successfully registered as planner\n");
				this.main_menu();
			} else {
				System.out.println("\t\t\t\t\t\t    Invalid input");
				this.main_menu();
			}
			break;
		case 5:
		    System.out.println("");
			System.out.println("");
			System.out.println("\t\t\t\t\t\t    **USER LOGIN**");
			System.out.println("\t\t\t\t\t\t    ---------------\n");
			System.out.print("\t\t\t\t\t\t    ->Enter username: ");
			username = scanner.nextLine();
			System.out.println("");
			System.out.print("\t\t\t\t\t\t    ->Enter password: ");
			password = scanner.nextLine();
			User us = new User();
			if (us.login(username, password)) {
				this.username = username;
				user_menu();
			} else {
				System.out.println("\t\t\t\t\t\t    Invalid input!");
				this.main_menu();
			}
			break;
		case 6:
		    System.out.println("");
			System.out.println("");
			System.out.println("\t\t\t\t\t\t    **USER REGISTER**");
			System.out.println("\t\t\t\t\t\t    ------------------");
			System.out.print("\t\t\t\t\t\t    ->Enter username: ");
			username = scanner.nextLine();
			System.out.println("");
			System.out.print("\t\t\t\t\t\t    ->Enter password: ");
			password = scanner.nextLine();
			us = new User();
			if (us.register(username, password)) {
				this.in.saveToFile();
				System.out.println("\t\t\t\t\t\t    Successfully registered as User\n");
				this.main_menu();
				main_menu();
			} else {
				System.out.println("\t\t\t\t\t\t    Invalid Username or Password!");
				main_menu();
			}
			break;
		default:
			this.in.saveToFile();
			this.main_menu();
			break;
		}

		scanner.close();
	}

	public void admin_menu() {
		
		int selection;
		Scanner scanner = new Scanner(System.in);
        System.out.println("");
		System.out.println("\t\t\t\t\t\t         **ADMIN MENU**");
		System.out.println("\t\t\t\t\t\t-----------------------------------");
		System.out.println("\t\t\t\t\t\t-----------------------------------");
		System.out.println("\t\t\t\t\t\t##CHOOSE FROM THESE CHOICES##");
		System.out.println("\t\t\t\t\t\t---------------------------------");
		System.out.println("\t\t\t\t\t\t || 1 - View pending projects  ||");
		System.out.println("\t\t\t\t\t\t---------------------------------");
		System.out.println("\t\t\t\t\t\t || 2 - View approved Projects ||");
		System.out.println("\t\t\t\t\t\t---------------------------------");
		System.out.println("\t\t\t\t\t\t || 3 - Search A Project       ||");
		System.out.println("\t\t\t\t\t\t---------------------------------");
		System.out.println("\t\t\t\t\t\t || 4 - Remove All Projects    ||");
		System.out.println("\t\t\t\t\t\t---------------------------------");
		System.out.println("\t\t\t\t\t\t || 5 - Log Out                ||");
		System.out.println("\t\t\t\t\t\t---------------------------------\n");
		System.out.print("\t\t\t\t\t\t  Enter option: ");

		selection = scanner.nextInt();

		switch (selection) {
		case 1:
			this.admin_pending_projects();
			break;
		case 2:
		
			this.admin_view_approved_projects();
			break;
		case 3:
			this.admin_search_project();
			break;
		case 4:
			this.in.myApprovedUserEvents.clear();
			this.in.myPendingUserEvents.clear();
			this.in.saveToFile();
			this.main_menu();
			break;
		default:
			this.in.saveToFile();
			clearConsole();
			this.main_menu();
			break;
		}
	}

	public void admin_search_project() {
		clearConsole();
		String leftAlignFormat = "| %-15s | %-15s | %-15s | %-15s |%n";

		System.out.format("+-----------------+----------------+----------------+----------------+%n");
		System.out.format("| ID              | Package Name   | Owner          | Is Pending     |%n");
		System.out.format("+-----------------+----------------+----------------+----------------+%n");

		for (int i = 0; i < this.in.myPendingUserEvents.size(); ++i) {
			final UserEvents temp = this.in.myPendingUserEvents.get(i);
			if (temp.status == 0) {
				System.out.format(leftAlignFormat, temp.id, temp.e.packageName, temp.u.username, "TRUE");
			}
		}
		for (int i = 0; i < this.in.myApprovedUserEvents.size(); ++i) {
			final UserEvents temp = this.in.myApprovedUserEvents.get(i);
			System.out.format(leftAlignFormat, temp.id, temp.e.packageName, temp.u.username, "FALSE");
		}

		System.out.format("+-----------------+----------------+----------------+----------------+%n");
		System.out.println("\n\n");
		System.out.println("Want to search a project?(yes or no): ");
		Scanner scanner = new Scanner(System.in);
		String choice = scanner.nextLine();

		if (choice.equalsIgnoreCase("no")) {
			this.admin_menu();
		} else if (choice.equalsIgnoreCase("yes")) {
			System.out.print("Enter ID: ");
			int id = scanner.nextInt();

			scanner.nextLine();
			UserEvents temp2 = this.in.getPendingUserEvent(id);
			System.out.println("Search results: \n\n\n");

			System.out.format("+-----------------+----------------+----------------+----------------+%n");
			System.out.format("| ID              | Package Name   | Owner          | Is Pending     |%n");
			System.out.format("+-----------------+----------------+----------------+----------------+%n");
			if (temp2 == null) {
				temp2 = this.in.getUserEvent(id);
				if (temp2 != null) {
					System.out.format(leftAlignFormat, temp2.id, temp2.e.packageName, temp2.u.username, "FALSE");
				} else {
					System.out.println("No Such Project Exists!");
				}
			} else {
				System.out.format(leftAlignFormat, temp2.id, temp2.e.packageName, temp2.u.username, "FALSE");
			}
			System.out.format("+-----------------+----------------+----------------+----------------+%n");

			System.out.print("Want to search a project?(yes or no): ");
			choice = scanner.nextLine();

			if (choice.equalsIgnoreCase("no")) {
				this.admin_menu();
			} else if (choice.equalsIgnoreCase("yes")) {
				this.admin_search_project();
			} else {
				this.in.saveToFile();
				System.exit(0);
			}
		} else {
			this.in.saveToFile();
			System.exit(0);
		}

		scanner.close();
	}

	public void admin_pending_projects() {
		clearConsole();
		String leftAlignFormat = "| %-15s | %-15s | %-15s | %-15s |%n";

		System.out.format("+-----------------+----------------+-------------------+-----------------+%n");
		System.out.format("| ID              | Name           | Cost range        | OwnerName       |%n");
		System.out.format("+-----------------+----------------+-------------------+-----------------+%n");

		for (int i = 0; i < this.in.myPendingUserEvents.size(); ++i) {
			final UserEvents temp = this.in.myPendingUserEvents.get(i);
			if (temp.status == 0) {
				System.out.format(leftAlignFormat, temp.id, temp.e.packageName, temp.e.costRange, temp.u.username);
			}
		}

		System.out.format("+-----------------+----------------+-------------------+-----------------+%n");
		System.out.println("\n\n");
		System.out.print("Want to approve a project?(yes or no): ");
		Scanner scanner = new Scanner(System.in);
		String choice = scanner.nextLine();

		if (choice.equalsIgnoreCase("no")) {
			this.admin_menu();
		} else if (choice.equalsIgnoreCase("yes")) {
			System.out.println("Enter ID: ");
			int id = scanner.nextInt();
			System.out.println("Enter Cost: ");
			int cost = scanner.nextInt();
			final UserEvents ue = this.in.getPendingUserEvent(id);
			if (ue != null) {
				ue.status = 1;
				ue.adminCost = cost;
				this.in.myApprovedUserEvents.add(ue);
				this.in.removePendingUserEvent(id);
				this.in.saveToFile();
				System.out.println("Successfully Approved !");
			} else {
				System.out.println("No Such Project Exists !");
			}

			this.admin_menu();
		} else {
			this.in.saveToFile();
			System.exit(0);
		}

		scanner.close();
	}

	public void admin_view_approved_projects() {
		clearConsole();
		String leftAlignFormat = "| %-15s | %-15s | %-15s | %-15s | %-15s | %-15s |%n";

		System.out.format(
				"+-----------------+------------------+-----------------+-----------------+-----------------+----------------+%n");
		System.out.format(
				"| ID              | Package name     |   Owner         | Admin Cost      | Venue           | Planner        |%n");
		System.out.format(
				"+-----------------+------------------+-----------------+-----------------+-----------------+----------------+%n");

		for (int i = 0; i < this.in.myApprovedUserEvents.size(); ++i) {
			final UserEvents temp = this.in.myApprovedUserEvents.get(i);
			if (temp.p != null) {
				if (temp.status == 1) {
					System.out.format(leftAlignFormat, temp.id, temp.e.packageName, temp.u.username, temp.adminCost,
							 temp.venue,temp.p.username);
				}
			} else {
				System.out.format(leftAlignFormat, temp.id, temp.e.packageName, temp.u.username, temp.adminCost, "NULL",
						temp.venue);
			}
		}

		System.out.format(
				"+-----------------+------------------+-----------------+-----------------+-----------------+----------------+%n");
		System.out.println("\n\n");
		this.admin_menu();
	}

	public void planner_menu() {
		
		int selection;
		Scanner scanner = new Scanner(System.in);
		System.out.println("");
		System.out.println("\t\t\t\t\t\t      **PLANNER MENU**");
		System.out.println("\t\t\t\t\t\t----------------------------------");
		System.out.println("\t\t\t\t\t\t----------------------------------");
		System.out.println("\t\t\t\t\t\t  ##CHOOSE FROM THESE CHOICES##");
		System.out.println("\t\t\t\t\t\t----------------------------------");
		System.out.println("\t\t\t\t\t\t||  1 - View my projects        ||");
		System.out.println("\t\t\t\t\t\t----------------------------------");
		System.out.println("\t\t\t\t\t\t||  2 - Available Projects      ||");
		System.out.println("\t\t\t\t\t\t----------------------------------");
		System.out.println("\t\t\t\t\t\t||  3 - LOG OUT                 ||");
		System.out.println("\t\t\t\t\t\t----------------------------------\n");
		System.out.print("\t\t\t\t\t\tEnter option: ");

		selection = scanner.nextInt();

		switch (selection) {
		case 1:
			this.view_my_projects();
			break;
		case 2:
			this.available_projects();
			break;
		default:
			this.in.saveToFile();
			this.main_menu();
			break;
		}
	}

	public void available_projects() {
		clearConsole();
		String leftAlignFormat = "| %-15s | %-15s | %-15s | %-15s | %-15s |%n";

		System.out.format("+-----------------+----------------+----------------+----------------+----------------+%n");
		System.out.format("| ID              | Package name   |   Owner        | Cost           | Venue          |%n");
		System.out.format("+-----------------+----------------+----------------+----------------+----------------+%n");

		for (int i = 0; i < this.in.myApprovedUserEvents.size(); ++i) {
			final UserEvents temp = this.in.myApprovedUserEvents.get(i);

			if (temp.status == 1 && temp.p == null) {
				System.out.format(leftAlignFormat, temp.id, temp.e.packageName, temp.u.username, temp.adminCost,
						temp.venue);
			}
		}

		System.out.format("+-----------------+----------------+----------------+----------------+----------------+%n");
		System.out.println("\n\n");
		System.out.println("Want to pick a project?(yes or no): ");
		Scanner scanner = new Scanner(System.in);
		String choice = scanner.nextLine();

		if (choice.equalsIgnoreCase("no")) {
			this.planner_menu();
		} else if (choice.equalsIgnoreCase("yes")) {
			System.out.println("Enter ID: ");
			String id = scanner.nextLine();
			try {
				final int idv = Integer.valueOf(id);
				final UserEvents temp = this.in.getUserEvent(idv);
				if (temp != null) {
					final Planner t = this.in.getPlanner(this.username);
					temp.p = t;
					System.out.println("Added Successfully");
					this.in.saveToFile();
				} else {
					System.out.println("Error Occured!");
				}
			} catch (Exception e) {
				System.out.println("Error Occured!");
			}

			this.planner_menu();
		} else {
			this.in.saveToFile();
			System.exit(0);
		}

		scanner.close();
	}

	public void view_my_projects() {
		clearConsole();
		String leftAlignFormat = "| %-15s | %-15s | %-15s | %-15s | %-15s | %-15s |%n";

		System.out.format(
				"+-----------------+----------------+----------------+----------------+----------------+----------------+%n");
		System.out.format(
				"| ID              | Package name   |   Owner        |  Cost          | Planner        | Venue          |%n");
		System.out.format(
				"+-----------------+----------------+----------------+----------------+----------------+----------------+%n");

		for (int i = 0; i < this.in.myApprovedUserEvents.size(); ++i) {
			final UserEvents temp = this.in.myApprovedUserEvents.get(i);

			if (temp.p != null && temp.p.username.equals(this.username) && temp.status == 1) {
				System.out.format(leftAlignFormat, temp.id, temp.e.packageName, temp.u.username, temp.adminCost,
						temp.p.username, temp.venue);
			}
		}

		System.out.format(
				"+-----------------+----------------+----------------+----------------+----------------+----------------+%n");
		System.out.println("\n\n");
		this.planner_menu();
	}

	public final static void clearConsole() {
		try {
			if (System.getProperty("os.name").contains("Windows")) {
				new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			} else {
				Runtime.getRuntime().exec("clear");
				System.out.print("\033\143");
			}
		} catch (Exception ex) {
		}
	}
}
