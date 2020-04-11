package com.capg.fms.dto;

public class Booking {
	
		private long bookingId;
		private int noOfPassengers;
		private String passengername;
		private String gender;
		private int age;
		private long phoneno;
		private long idNumber;
		public Booking() {
			super();
		}
		public Booking(long bookingId, int noOfPassengers, String passengername, String gender, int age, long phoneno,
				long idNumber) {
			super();
			this.bookingId = bookingId;
			this.noOfPassengers = noOfPassengers;
			this.passengername = passengername;
			this.gender = gender;
			this.age = age;
			this.phoneno = phoneno;
			this.idNumber = idNumber;
		}
		public long getBookingId() {
			return bookingId;
		}
		public void setBookingId(long bookingId) {
			this.bookingId = bookingId;
		}
		public int getNoOfPassengers() {
			return noOfPassengers;
		}
		public void setNoOfPassengers(int noOfPassengers) {
			this.noOfPassengers = noOfPassengers;
		}
		public String getPassengername() {
			return passengername;
		}
		public void setPassengername(String passengername) {
			this.passengername = passengername;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public long getPhoneno() {
			return phoneno;
		}
		public void setPhoneno(long phoneno) {
			this.phoneno = phoneno;
		}
		public long getIdNumber() {
			return idNumber;
		}
		public void setIdNumber(long idNumber) {
			this.idNumber = idNumber;
		}
		
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + age;
			result = prime * result + (int) (bookingId ^ (bookingId >>> 32));
			result = prime * result + ((gender == null) ? 0 : gender.hashCode());
			result = prime * result + (int) (idNumber ^ (idNumber >>> 32));
			result = prime * result + noOfPassengers;
			result = prime * result + ((passengername == null) ? 0 : passengername.hashCode());
			result = prime * result + (int) (phoneno ^ (phoneno >>> 32));
			return result;
		}
		
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Booking other = (Booking) obj;
			if (age != other.age)
				return false;
			if (bookingId != other.bookingId)
				return false;
			if (gender == null) {
				if (other.gender != null)
					return false;
			} else if (!gender.equals(other.gender))
				return false;
			if (idNumber != other.idNumber)
				return false;
			if (noOfPassengers != other.noOfPassengers)
				return false;
			if (passengername == null) {
				if (other.passengername != null)
					return false;
			} else if (!passengername.equals(other.passengername))
				return false;
			if (phoneno != other.phoneno)
				return false;
			return true;
		}
		
		public String toString() {
			return "Booking [bookingId=" + bookingId + ", noOfPassengers=" + noOfPassengers + ", passengername="
					+ passengername + ", gender=" + gender + ", age=" + age + ", phoneno=" + phoneno + ", idNumber="
					+ idNumber + "]";
		}
		
}