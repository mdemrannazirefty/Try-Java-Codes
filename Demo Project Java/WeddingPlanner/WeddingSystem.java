import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;
import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class WeddingSystem {
	private static WeddingSystem instance;
	public List<User> myUsers;
	public List<UserEvents> myPendingUserEvents;
	public List<UserEvents> myApprovedUserEvents;
	public List<Admin> myAdmins;
	public List<Planner> myPlanners;
	public Event[] myTotalEvents;
	public String[] existingEvents = { "Sena Malancha", "Celebration Hall", "Dhaka Regency Hotel & Resort", "Event 71",
			"White Hall Convention Center" };

	public WeddingSystem() {
		this.myUsers = new ArrayList<User>();
		this.myPendingUserEvents = new ArrayList<UserEvents>();
		this.myApprovedUserEvents = new ArrayList<UserEvents>();
		this.myAdmins = new ArrayList<Admin>();
		this.myPlanners = new ArrayList<Planner>();
		this.myTotalEvents = new Event[4];
		final int id1 = 1;
		final String[] specs1 = { "Stage Decoration", "Wedding day photography", "Invitation Cards", "Venue Decoration",
				"Flowers (Artificial)", "Lighting (Stage Decoration Only)","Cattering Service" };
		final Event e1 = new Event(id1, "Star Package", specs1, "2-4 Lakh");
		this.myTotalEvents[0] = e1;
		final int id2 = 2;
		final String[] specs2 = { "Stage Decoration(Flowers,lights,furnitures)", "Invitation Card.",
				"Flowers.(Your choice)", "Venue Decoration", "Pre wedding and Wedding Day Photoshoot",
				"Table Decoration","Premium Cattering Service","Assosciates for Wedding" };
		final Event e2 = new Event(id2, "Gold Package", specs2, "5-7 Lakh");
		this.myTotalEvents[1] = e2;
		final int id3 = 3;
		final String[] specs3 = { "Stage Decoration(Flowers,lights,furnitures)", "Invitation Card",
				"Flowers.(Your choice)", "Venue Choice & Decoration",
				"Pre wedding and Wedding Day and Reciption Photoshoot", "Theme choice of decoration",
				"Cattering Service and Personal reception", "Vehicle Decoration","Assosciates for Wedding","Buffet System(Your Choice)" };
		final Event e3 = new Event(id3, "Platinum Package", specs3, "7-8lakh");
		this.myTotalEvents[2] = e3;
		final int id4 = 4;
		final String[] specs4 = { "Venue(Own residence/Outdoor)", "Premium Venue Decoration",
				"Premium invitation card and online invitations", "Personal Jet Booking", "Costume Desginer",
				"Bridal Photoshoot(10-12days)", "Premium Cattering Service(Buffet facilities and Food of 7 countries)",
				"Prebook of Switzerland Tour","And lots more" };
		final Event e4 = new Event(id4, "VIP Package", specs4, "50lakh - 1core");
		this.myTotalEvents[3] = e4;
	}

	public static WeddingSystem getInstance() {
		if (WeddingSystem.instance == null) {
			(WeddingSystem.instance = new WeddingSystem()).loadData();
		}
		return WeddingSystem.instance;
	}

	User getUser(final String username) {
		for (int i = 0; i < this.myUsers.size(); ++i) {
			if (this.myUsers.get(i).username.equals(username)) {
				return this.myUsers.get(i);
			}
		}
		return null;
	}

	Event getEvent(final int id) {
		if (id <= 4) {
			return this.myTotalEvents[id - 1];
		}
		return null;
	}

	UserEvents getPendingUserEvent(final int id) {
		for (int i = 0; i < this.myPendingUserEvents.size(); ++i) {
			if (this.myPendingUserEvents.get(i).id == id) {
				return this.myPendingUserEvents.get(i);
			}
		}
		return null;
	}

	boolean removePendingUserEvent(final int id) {
		for (int i = 0; i < this.myPendingUserEvents.size(); ++i) {
			if (this.myPendingUserEvents.get(i).id == id) {
				this.myPendingUserEvents.remove(i);
				return true;
			}
		}
		return false;
	}

	UserEvents getUserEvent(final int id) {
		for (int i = 0; i < this.myApprovedUserEvents.size(); ++i) {
			if (this.myApprovedUserEvents.get(i).id == id) {
				return this.myApprovedUserEvents.get(i);
			}
		}
		return null;
	}

	Planner getPlanner(final String username) {
		for (int i = 0; i < this.myPlanners.size(); ++i) {
			if (this.myPlanners.get(i).username.equals(username)) {
				return this.myPlanners.get(i);
			}
		}
		return null;
	}

	void saveToFile() {
		try {
			PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("Users.txt", false)));
			for (int i = 0; i < this.myUsers.size(); ++i) {
				out.println(this.myUsers.get(i).username + " " + this.myUsers.get(i).password);
			}
			out.close();
			out = new PrintWriter(new BufferedWriter(new FileWriter("Admins.txt", false)));
			for (int i = 0; i < this.myAdmins.size(); ++i) {
				out.println(this.myAdmins.get(i).username + " " + this.myAdmins.get(i).password);
			}
			out.close();
			out = new PrintWriter(new BufferedWriter(new FileWriter("Planners.txt", false)));
			for (int i = 0; i < this.myPlanners.size(); ++i) {
				out.println(this.myPlanners.get(i).username + " " + this.myPlanners.get(i).password);
			}
			out.close();
			out = new PrintWriter(new BufferedWriter(new FileWriter("PendingUserEvents.txt", false)));
			for (int i = 0; i < this.myPendingUserEvents.size(); ++i) {
				if (this.myPendingUserEvents.get(i).p != null) {
					out.println(this.myPendingUserEvents.get(i).id + " " + this.myPendingUserEvents.get(i).u.username
							+ " " + this.myPendingUserEvents.get(i).p.username + " "
							+ this.myPendingUserEvents.get(i).adminCost + " " + this.myPendingUserEvents.get(i).status
							+ " " + this.myPendingUserEvents.get(i).venue + " " + this.myPendingUserEvents.get(i).e.id);
				} else {
					out.println(this.myPendingUserEvents.get(i).id + " " + this.myPendingUserEvents.get(i).u.username
							+ " -- " + this.myPendingUserEvents.get(i).adminCost + " "
							+ this.myPendingUserEvents.get(i).status + " " + this.myPendingUserEvents.get(i).venue + " "
							+ this.myPendingUserEvents.get(i).e.id);
				}
			}
			out.close();
			out = new PrintWriter(new BufferedWriter(new FileWriter("ApprovedUsers.txt", false)));
			for (int i = 0; i < this.myApprovedUserEvents.size(); ++i) {
				if (this.myApprovedUserEvents.get(i).p == null) {
					out.println(this.myApprovedUserEvents.get(i).id + " " + this.myApprovedUserEvents.get(i).u.username
							+ " -- " + this.myApprovedUserEvents.get(i).adminCost + " "
							+ this.myApprovedUserEvents.get(i).status + " " + this.myApprovedUserEvents.get(i).index
							+ " " + this.myApprovedUserEvents.get(i).e.id);
				} else {
					out.println(this.myApprovedUserEvents.get(i).id + " " + this.myApprovedUserEvents.get(i).u.username
							+ " " + this.myApprovedUserEvents.get(i).p.username + " "
							+ this.myApprovedUserEvents.get(i).adminCost + " " + this.myApprovedUserEvents.get(i).status
							+ " " + this.myApprovedUserEvents.get(i).index + " "
							+ this.myApprovedUserEvents.get(i).e.id);
				}
			}
			out.close();
		} catch (Exception ex) {
		}
	}

	void loadData() {
		try {
			File file = new File("Users.txt");
			BufferedReader br = new BufferedReader(new FileReader(file));
			String st;
			while ((st = br.readLine()) != null) {
//				System.out.println(st);
				final String[] userPass = st.split(" ");
				this.myUsers.add(new User(userPass[0], userPass[1]));
			}
			br.close();
			file = new File("Admins.txt");
			br = new BufferedReader(new FileReader(file));
			while ((st = br.readLine()) != null) {
//				System.out.println(st);
				final String[] userPass = st.split(" ");
				this.myAdmins.add(new Admin(userPass[0], userPass[1]));
			}
			br.close();
			file = new File("Planners.txt");
			br = new BufferedReader(new FileReader(file));
			while ((st = br.readLine()) != null) {
//				System.out.println(st);
				final String[] userPass = st.split(" ");
				this.myPlanners.add(new Planner(userPass[0], userPass[1]));
			}
			br.close();
			file = new File("PendingUserEvents.txt");
			br = new BufferedReader(new FileReader(file));
			while ((st = br.readLine()) != null) {
//				System.out.println(st);
				final String[] userPass2 = st.split(" ");
				final UserEvents temp = new UserEvents(this.getEvent(Integer.valueOf(userPass2[6])),
						this.getUser(userPass2[1]), Integer.valueOf(userPass2[4]), Integer.valueOf(userPass2[0]));
				temp.adminCost = Integer.valueOf(userPass2[3]);
				temp.venue = userPass2[5];
				temp.p = this.getPlanner(userPass2[2]);
				++Start.count;
				this.myPendingUserEvents.add(temp);
			}
			br.close();
			file = new File("ApprovedUsers.txt");
			br = new BufferedReader(new FileReader(file));
			while ((st = br.readLine()) != null) {
//				System.out.println(st);
				final String[] userPass2 = st.split(" ");
				final UserEvents temp = new UserEvents(this.getEvent(Integer.valueOf(userPass2[6])),
						this.getUser(userPass2[1]), Integer.valueOf(userPass2[4]), Integer.valueOf(userPass2[0]));
				temp.adminCost = Integer.valueOf(userPass2[3]);
				if (Integer.valueOf(userPass2[5]) == 100) {
					temp.venue = "--";
				} else {
					temp.index = Integer.valueOf(userPass2[5]);
					temp.venue = Start.myVenus[Integer.valueOf(userPass2[5])];
				}
				temp.p = this.getPlanner(userPass2[2]);
				this.myApprovedUserEvents.add(temp);
				++Start.count;
			}
			br.close();
		} catch (Exception ex) {
		}
	}

	static {
		WeddingSystem.instance = null;
	}
}