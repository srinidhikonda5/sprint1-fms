package com.capg.fms.service;

import com.capg.fms.dao.BookingDao;
import com.capg.fms.dao.BookingDaoImpl;
import com.capg.fms.dto.Booking;
import com.capg.fms.exception.BookingException;

public class BookingServiceImpl implements BookingService {
//	Booking b = new Booking();
	BookingDao bookingdao = new BookingDaoImpl();
	
   /* private BookingDao bookingdao; 

	public BookingServiceImpl() {
		
	BookingDao bookingdao = new BookingDaoImpl();
	}
	public boolean validatePhoneNo(long phoneno) throws BookingException {
		String str = String.valueOf(phoneno);
		boolean flag=false;
		flag= str.matches("[0-9]{10}");
	       return flag;
	}*/
	
	public long addBooking(Booking booking) throws BookingException
	{
		//long bookingId = 0;
		//bookingId = bookingdao.addBooking(booking);
	
		/*long phonenum=booking.getPhoneno();
		boolean flag=validatePhoneNo(phonenum); 
		if(!flag) 
		{
			throw new BookingException("Phone no should contain only digits");
		}*/
		return bookingdao.addBooking(booking);    //
	}

	public Booking viewBookingByBookingId(long bookingId) throws BookingException{
		return bookingdao.viewBookingByBookingId(bookingId);
	}

	public Booking viewBooking() throws BookingException {
		if ((bookingdao.viewBooking()) == null) {
			throw new BookingException("No Bookings found");
		}
		return bookingdao.viewBooking();
	}

	

	
	/*public boolean validateIdNumber(long idNumber) {
		String str = String.valueOf(idNumber);
		if (str.matches("[1-9]{1}[0-9]{11}")) {
		}
		return false;
	}

  /* public boolean validateseatCapacity(int noOfPassenger, int flightId) throws BookingException, Exception {
		if (noOfPassenger > bookingdao.viewBookingByBookingId(flightId).getNoOfPassengers()) {
			throw new Exception("no seats available");
		}
		return false;
	}

	public boolean validateSeatCapacity(int seatCapacity) {
		// TODO Auto-generated method stub
		return false;
	} */

}
