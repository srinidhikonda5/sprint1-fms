package com.capg.sprint1.fms.dao;

import com.capg.sprint1.fms.model.Booking;
//import java.math.BigInteger;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import com.capg.sprint1.fms.model.Booking;
import com.capg.sprint1.fms.model.Flight;
import com.capg.sprint1.fms.model.User;
import com.capg.sprint1.fms.model.Passenger;

public class BookingDaoImpl  implements  BookingDao{
	Map<Long, Booking> Bookings=new HashMap<>();
	
	Flight flight=new Flight(235667l,"luxurious","abc", 45);
	Flight flight1=new Flight(23678l,"lux","xyz",50);
	public void addsomeBookings() {
		Booking b1=new Booking(45678l, 56389l, LocalDate.now(), 678, flight, 45,
				Arrays.asList(new Passenger(56778l,"nidhi",23 ,5688l,45)));
		Booking b2=new Booking(5678l, 389l, LocalDate.now(), 789, flight1, 50,
				Arrays.asList(new Passenger(8567l,"nandhu",26 ,7898l,50)));
		Bookings.put(b1.getBookingId() , b1);
		Bookings.put(b2.getBookingId() , b2);
	}

	@Override
	public boolean addBooking(Booking booking) 
	{
		if(Bookings.containsKey(booking))
		{return false;}
		Bookings.put(booking.getBookingId(),booking);
			return true;
		}
	@Override
	public void viewBooking1() {
		for(Object i:Bookings) {
			return i.getkey();
		}
	}

	@Override
	 public Booking viewBooking(long bookingId) {
       Booking vb= Bookings.get(bookingId);
        return vb;
	}
}
	