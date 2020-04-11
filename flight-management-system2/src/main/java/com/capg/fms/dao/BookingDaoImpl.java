package com.capg.fms.dao;



import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

import com.capg.fms.dto.Booking;
import com.capg.fms.exception.BookingException;

public class BookingDaoImpl implements BookingDao {
	static HashMap<Long,Booking> hashmap=new HashMap<Long, Booking>();
	
	public long addBooking(Booking booking) 
	{
	        hashmap.put(booking.getBookingId(),booking);
			long bookingId=booking.getBookingId();
			return bookingId;
	    }   
	
	
	public Booking viewBookingByBookingId(long bookingId) throws BookingException {
			Booking b = new Booking();
			if(!hashmap.containsKey(bookingId))
			{
				throw new BookingException("Invalid booking ID");
			}
			b = hashmap.get(bookingId);
			return b;	
	}
	
	
	public Booking viewBooking() {
		Set<Entry<Long,Booking>> setOfEntries = hashmap.entrySet();
		 Iterator<Entry<Long,Booking>> iterator = setOfEntries.iterator();
	    for(Entry<Long,Booking> entry : setOfEntries)
	    {
	        System.out.println("BookingId : "+entry.getKey() +" "+
	                "Details : "+entry.getValue());
		 }
		return null;
	}
}

