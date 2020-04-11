package com.capg.sprint1.fms.model;

public class Flight {
	   long flightNumber;
        String flightModel;
		String carrierName; 
		int seatCapacity;
		
		public long getFlightNumber() {
			return flightNumber;
		}
		public void setFlightNumber(long flightNumber) {
			this.flightNumber = flightNumber;
		}
		public String getFlightModel() {
			return flightModel;
		}
		public void setFlightModel(String flightModel) {
			this.flightModel = flightModel;
		}
		public String getCarrierName() {
			return carrierName;
		}
		public void setCarrierName(String carrierName) {
			this.carrierName = carrierName;
		}
		public int getSeatCapacity() {
			return seatCapacity;
		}
		public void setSeatCapacity(int seatCapacity) {
			this.seatCapacity = seatCapacity;
		}
		@Override
		public String toString() {
			return "Flight [flightNumber=" + flightNumber + ", flightModel=" + flightModel + ", carrierName="
					+ carrierName + ", seatCapacity=" + seatCapacity + "]";
		}
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((carrierName == null) ? 0 : carrierName.hashCode());
			result = prime * result + ((flightModel == null) ? 0 : flightModel.hashCode());
			result = prime * result + (int) (flightNumber ^ (flightNumber >>> 32));
			result = prime * result + seatCapacity;
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
			Flight other = (Flight) obj;
			if (carrierName == null) {
				if (other.carrierName != null)
					return false;
			} else if (!carrierName.equals(other.carrierName))
				return false;
			if (flightModel == null) {
				if (other.flightModel != null)
					return false;
			} else if (!flightModel.equals(other.flightModel))
				return false;
			if (flightNumber != other.flightNumber)
				return false;
			if (seatCapacity != other.seatCapacity)
				return false;
			return true;
		}
		public Flight(long flightNumber, String flightModel, String carrierName, int seatCapacity) {
			super();
			this.flightNumber = flightNumber;
			this.flightModel = flightModel;
			this.carrierName = carrierName;
			this.seatCapacity = seatCapacity;
		}
		
}