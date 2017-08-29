package conferenceRegistration;

public class EmailNotifier {

	public void notifyByEmail(UserRegistration userRegistrationDetails) {
		System.out.println("Emailing the confirmation of  registration of the session "
				+ userRegistrationDetails.sessionName + " for the conference " + userRegistrationDetails.conferenceName
				+ " dated " + userRegistrationDetails.dateofConference + " from "
				+ userRegistrationDetails.startTimeOfSession + " to " + userRegistrationDetails.endTimeOfSession
				+ " at " + userRegistrationDetails.conferenceVenue);
	}

}
