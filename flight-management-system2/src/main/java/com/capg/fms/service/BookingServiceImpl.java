package com.capg.fms.service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.capg.fms.dao.BookingDao;
import com.capg.fms.dao.BookingDaoImpl;
import com.capg.fms.dto.Booking;
import com.capg.fms.exception.BookingException;

public class BookingServiceImpl implements BookingService {
	BookingDao bookingdao = new BookingDaoImpl();
	
	public static boolean checkMatches(String regex, CharSequence input) {
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(input);
        return m.find() && m.group().equals(input);
    }
	
	public boolean validatePhoneNo(long phoneno) throws BookingException {
		String str = String.valueOf(phoneno);
		boolean flag=false;
		flag= checkMatches("[0-9]{10}",str);
		   return flag;
	}
	
	public boolean validateIdNumber(long idNumber) throws BookingException{
		String str = String.valueOf(idNumber);
		boolean flag=false;
		flag= checkMatches("[0-9]{12}",str);
		   return flag;
	}
		
	public long addBooking(Booking booking) throws BookingException
	{
		 long phonenum=booking.getPhoneno();
		boolean flag=validatePhoneNo(phonenum); 
		long idNumber=booking.getIdNumber();
		boolean flag2=validateIdNumber(idNumber);
		if(!flag) 
		{
			throw new BookingException("Phone no should contain 10 digits only");
		}
		if(!flag2) {
			throw new BookingException("id number should contain 12 digits only");
		}
		return bookingdao.addBooking(booking);    

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
	
}
