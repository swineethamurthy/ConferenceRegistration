package conferenceRegistration;

public class Users {
	String userName;
	String userEmailId;
	String mobileNumber;
	
	public void feedUserDetails(String userEmailID, String userName, String userMobile)
	{
		userName=userName;
		userEmailId=userEmailID;
		mobileNumber=userMobile;
		System.out.println("Updated user Details in database");
	}

}
