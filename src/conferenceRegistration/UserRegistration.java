package conferenceRegistration;

public class UserRegistration {

	String conferenceName;
	String sessionName;
	String conferenceVenue;
	String sessionVenue;
	String dateofConference;
	String startTimeOfSession;
	String endTimeOfSession;
	String userEmailID;
	String userName;
	String userMobile;

	public void main(String[] args) {
		// TODO Auto-generated method stub
		Sessions sessionDetail = new Sessions();
		Registration registration = new Registration();
		EmailNotifier emailNotify = new EmailNotifier();

		sessionDetail.showSessionAvailability();
		Integer selectedSessionID = 0;
		selectedSessionID = 1; // comes from user input
		boolean registrationRequested = registration.chooseSession(selectedSessionID);

		setUserSelectionDetails(); // get input details from UI

		if (registrationRequested) {
			if (registration.checkExistingRegistration(userEmailID)) {
				System.out.println("The uer has already registered for a session.");
			} else {
				registration.setUserDetails(userEmailID, userName, userMobile); // feed database for registering users
				registration.showRegistrationDetails(); // display confirmation at end of registration
				sessionDetail.updateNumberOfAvailableSeats(registrationRequested); // updating the seat availability on a new registration
				emailNotify.notifyByEmail(this); // notify user by email
			}
		} else {
			System.out.println("No sessions selected");
		}

	}

	public void setUserSelectionDetails() {
		// would be rather got from UI which would be done later
		this.conferenceName = "Conference A";
		this.sessionName = "Session A";
		this.conferenceVenue = "YY Conference center";
		this.sessionVenue = "XYZ Hall";
		this.dateofConference = "23/12/2017";
		this.startTimeOfSession = "9 am";
		this.endTimeOfSession = "6 pm";

	}

}
