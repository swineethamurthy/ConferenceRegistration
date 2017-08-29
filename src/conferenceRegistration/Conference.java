package conferenceRegistration;

import java.sql.*;

public class Conference {
	int conferenceID;
	String conferenceName;
	String description;
	int numberOfDays;
	String venue;
	Date conferenceStartDate;
	Date conferenceEndDate;

	Conference(String conferenceName, String description, int numberOfDays, String venue, Date conferenceStartDate,
			Date conferenceEndDate) {
		conferenceName=conferenceName;
		description=description;
		numberOfDays=numberOfDays;
		venue=venue;
		conferenceStartDate=conferenceStartDate;
		conferenceEndDate=conferenceEndDate;
	}
	
	public void showConferenceDetails() {}
	
}
