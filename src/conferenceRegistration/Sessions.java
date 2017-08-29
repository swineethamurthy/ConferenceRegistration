package conferenceRegistration;

import java.sql.*;

public class Sessions {

	Integer dayID;
	Integer sessionID;
	String sessionName;
	String location;
	Integer totalNumberOfSeats;
	Integer bookedSeats;
	Time startTime;
	Time endTime;
	
	Days conferenceDays = new Days();
	
	public  void showSessionAvailability() 
	{
		Integer availableSeats;
		availableSeats=totalNumberOfSeats-bookedSeats;
		if (availableSeats>0)
		{
		System.out.println("Session Name : "+ sessionName + " Available Seats : " + availableSeats);
		}
	}
	
	public  void updateNumberOfAvailableSeats(boolean registrationRequested) {
		bookedSeats=bookedSeats-1;
		System.out.println("Updated database for booked seats");
	}
	public void getSessionDetails()
	{
		
	}

}
