package com.capg.sprint1.fms.dao;




import com.capg.sprint1.fms.model.Booking;

public interface BookingDao {
	public boolean addBooking(Booking booking);
	public Booking viewBooking(long bookingId);
	public void  viewBooking1();


	}

