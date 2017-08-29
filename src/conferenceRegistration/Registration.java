package conferenceRegistration;

public class Registration {

	Integer sessionID;
	String userEmailId;
	Users userDetails;
	Sessions session = new Sessions();

	public boolean chooseSession(Integer selectedSessionID) {
		this.sessionID = selectedSessionID;
		if (selectedSessionID != 0) {
			return false;
		} else {
			return true;
		}

	}

	public void setUserDetails(String userEmailID, String userName, String userMobile) {
		userDetails.feedUserDetails(userEmailID, userName, userMobile);
	}

	public boolean checkExistingRegistration(String userEmailID) 
	{
		
		if(userEmailID!=null) //to check the user exists in the db already
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public void showRegistrationDetails() {
	}

	public void notifyRegistrationConfirmation() {

	}
}