package com.capg.sprint1.fms.service;



import com.capg.sprint1.fms.dao.BookingDao;
import com.capg.sprint1.fms.dao.BookingDaoImpl;
import com.capg.sprint1.fms.model.Booking;


public class BookingServiceImpl  implements BookingService{
	BookingDao bookingdao = new BookingDaoImpl();
	
	public boolean addBooking(Booking booking) {
		return bookingdao.addBooking(booking);
	}
	
	public void viewBooking1() {
		// TODO Auto-generated method stub
		
	}

	public Booking viewBooking(long bookingId) {	
		return bookingdao.viewBooking(bookingId);
		
	}
	
}
