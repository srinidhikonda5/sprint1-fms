package com.capg.flight.management.system;

import static org.junit.Assert.*;


import java.util.HashMap;

import org.junit.BeforeClass;
import org.junit.Test;


import com.capg.fms.dao.BookingDao;
import com.capg.fms.dao.BookingDaoImpl;
import com.capg.fms.dto.Booking;
import com.capg.fms.exception.BookingException;
import com.capg.fms.service.BookingService;
import com.capg.fms.service.BookingServiceImpl;

public class BookingTest {

	
	
	static BookingDao bookingdao;
		static BookingService bookingservice =new BookingServiceImpl();
		static HashMap<Long,Booking> hashmap=new HashMap<Long, Booking>();
		
		@BeforeClass
		public static  void setup() {
			bookingdao=new BookingDaoImpl();
		}
		
	   @Test
      	public  void test() throws BookingException {
		Booking booking = new Booking(23345,2,"nidhi","f",21,9959369426l,123456789123l);
		 hashmap.put(booking.getBookingId(),booking);
			long bookingId=booking.getBookingId();
			bookingdao.addBooking(booking);
			assertEquals(bookingId,bookingdao.addBooking(booking));
	}
	   
	   
}


