package com.capg.fms.service;


import com.capg.fms.dto.Booking;
import com.capg.fms.exception.BookingException;
public interface BookingService {
	public long addBooking(Booking booking) throws BookingException;
	public Booking viewBookingByBookingId(long bookingId)throws BookingException;
	public Booking  viewBooking()throws BookingException;
	public  boolean validatePhoneNo(long phoneno )throws BookingException;
	public  boolean validateIdNumber(long idNumber) throws BookingException;
	
	
}
