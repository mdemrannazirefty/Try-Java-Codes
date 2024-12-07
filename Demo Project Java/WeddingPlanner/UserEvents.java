public class UserEvents {
	int id;
	Event e;
	User u;
	Planner p;
	int index;
	String venue;
	int adminCost;
	int status;

	public UserEvents() {
		this.p = null;
		this.index = 100;
		this.venue = " ";
	}

	public UserEvents(final Event e1, final User u1, final int s, final int id) {
		this.p = null;
		this.index = 100;
		this.venue = " ";
		this.e = e1;
		this.u = u1;
		this.status = s;
		this.id = id;
	}

	boolean setVenue(final String ven) {
		if (!this.venue.equals(" ")) {
			return false;
		}
		this.venue = ven;
		return true;
	}
}