package com.capg.fms.dao;
import com.capg.fms.dto.Booking;
import com.capg.fms.exception.BookingException;

public interface BookingDao {
	public long addBooking(Booking booking) throws BookingException;
	public Booking viewBookingByBookingId(long bookingId) throws BookingException;
	public Booking  viewBooking();
}
