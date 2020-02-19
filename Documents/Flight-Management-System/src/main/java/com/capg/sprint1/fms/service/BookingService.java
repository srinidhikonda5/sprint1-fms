package com.capg.sprint1.fms.service;

import java.math.BigInteger;

import com.capg.sprint1.fms.model.Booking;
import com.capg.sprint1.fms.model.Passenger;

public interface BookingService {
	 public boolean addBooking(Booking booking);
		public void viewBooking1();
		public Booking viewBooking(long bookingId);

}
