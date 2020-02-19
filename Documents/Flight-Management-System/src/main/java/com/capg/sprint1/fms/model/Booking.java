package com.capg.sprint1.fms.model;

import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;

public class Booking {
	    long bookingId;
	    long userId;
		LocalDate bookingDate;
	    double ticketCost;
		Flight flight;
		int noOfPassengers;
		List<Passenger> passengerList=new ArrayList<Passenger>();
		public long getBookingId() {
			return bookingId;
		}
		public void setBookingId(long bookingId) {
			this.bookingId = bookingId;
		}
		public long getUserId() {
			return userId;
		}
		public void setUserId(long userId) {
			this.userId = userId;
		}
		public LocalDate getBookingDate() {
			return bookingDate;
		}
		public void setBookingDate(LocalDate bookingDate) {
			this.bookingDate = bookingDate;
		}
		public double getTicketCost() {
			return ticketCost;
		}
		public void setTicketCost(double ticketCost) {
			this.ticketCost = ticketCost;
		}
		public Flight getFlight() {
			return flight;
		}
		public void setFlight(Flight flight) {
			this.flight = flight;
		}
		public int getNoOfPassengers() {
			return noOfPassengers;
		}
		public void setNoOfPassengers(int noOfPassengers) {
			this.noOfPassengers = noOfPassengers;
		}
		public List<Passenger> getPassengerList() {
			return passengerList;
		}
		public void setPassengerList(List<Passenger> passengerList) {
			this.passengerList = passengerList;
		}
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((bookingDate == null) ? 0 : bookingDate.hashCode());
			result = prime * result + (int) (bookingId ^ (bookingId >>> 32));
			result = prime * result + ((flight == null) ? 0 : flight.hashCode());
			result = prime * result + noOfPassengers;
			result = prime * result + ((passengerList == null) ? 0 : passengerList.hashCode());
			long temp;
			temp = Double.doubleToLongBits(ticketCost);
			result = prime * result + (int) (temp ^ (temp >>> 32));
			result = prime * result + (int) (userId ^ (userId >>> 32));
			return result;
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Booking other = (Booking) obj;
			if (bookingDate == null) {
				if (other.bookingDate != null)
					return false;
			} else if (!bookingDate.equals(other.bookingDate))
				return false;
			if (bookingId != other.bookingId)
				return false;
			if (flight == null) {
				if (other.flight != null)
					return false;
			} else if (!flight.equals(other.flight))
				return false;
			if (noOfPassengers != other.noOfPassengers)
				return false;
			if (passengerList == null) {
				if (other.passengerList != null)
					return false;
			} else if (!passengerList.equals(other.passengerList))
				return false;
			if (Double.doubleToLongBits(ticketCost) != Double.doubleToLongBits(other.ticketCost))
				return false;
			if (userId != other.userId)
				return false;
			return true;
		}
		public Booking(long bookingId, long userId, LocalDate bookingDate, double ticketCost, Flight flight,
				int noOfPassengers, List<Passenger> passengerList) {
			super();
			this.bookingId = bookingId;
			this.userId = userId;
			this.bookingDate = bookingDate;
			this.ticketCost = ticketCost;
			this.flight = flight;
			this.noOfPassengers = noOfPassengers;
			this.passengerList = passengerList;
		}
	
		
		public Booking() {
			super();
			// TODO Auto-generated constructor stub
		}
		@Override
		public String toString() {
			return "Booking [bookingId=" + bookingId + ", userId=" + userId + ", bookingDate=" + bookingDate
					+ ", ticketCost=" + ticketCost + ", flight=" + flight + ", noOfPassengers=" + noOfPassengers
					+ ", passengerList=" + passengerList + "]";
		}
		
}