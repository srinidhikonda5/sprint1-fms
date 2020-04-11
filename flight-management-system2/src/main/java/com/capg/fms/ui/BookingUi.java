package com.capg.fms.ui;

import java.util.Scanner;


import com.capg.fms.dto.Booking;
import com.capg.fms.dto.Flight;
import com.capg.fms.exception.BookingException;
import com.capg.fms.service.BookingService;
import com.capg.fms.service.BookingServiceImpl;

public class BookingUi {
	static BookingService bookingservice =new BookingServiceImpl();
	static Scanner in=new Scanner(System.in);
	private static long bookingId;
	public static void main(String[] args) throws BookingException 
	{
		String passengername;
		int age;
		String gender;
	    long phoneno;
		long idNumber;
		int noOfPassengers;
		long flightNumber;
	    String flightModel;
		String carrierName; 
		int seatCapacity=0;
		int choice=0;
while(choice!=5)

		{
			System.out.println("Enter Choice");
            System.out.println("1.addBooking");
			System.out.println("2.viewBookingByBookingId");
			System.out.println("3.viewAllBooking");
			System.out.println("4.Exit");
			 choice=in.nextInt();
			switch(choice)
			{
			case 1:
     try {
	          System.out.println("addBookings");
			System.out.println("Number of Passengers");
				noOfPassengers = in.nextInt();
               System.out.println("seat capacity");
               seatCapacity=in.nextInt();

               
       
				for(int i=0;i<noOfPassengers;i++)
				{
					
					if(noOfPassengers<=seatCapacity)
					{ 
			
					System.out.println("enter bookingid");
					bookingId=in.nextLong();
				System.out.println("Enter Name");
				passengername = in.next()+in.nextLine();
				System.out.println("Enter Age");
				age = in.nextInt();
				System.out.println("Gender");
				gender = in.next()+in.nextLine();
				System.out.println("Enter phone number");
				phoneno = in.nextLong();
				System.out.println("Enter Id number");
				idNumber = in.nextLong();     
				System.out.println("flightnumber");
				flightNumber=in.nextLong();
				System.out.println("flightModel");
				flightModel=in.next();
				System.out.println("carriername");
				carrierName=in.next(); 
				Flight f=new Flight(flightNumber, flightModel, carrierName,  seatCapacity);
				Booking bk = new Booking(bookingId,noOfPassengers, passengername,gender,age,phoneno,idNumber);
				
				System.out.println("Booking Details : bookingId ="+bk.getBookingId()+","+" Passengername = "+bk.getPassengername()+","+" Gender = "+bk.getGender()+","+" Age = "+bk.getAge()+","+" PhoneNo = "+bk.getPhoneno()+","+ " IdNumber = "+bk.getIdNumber()+","
						+"flightname ="+f.getFlightNumber()+","+" flightmodel ="+f.getFlightModel()+","+" carriername ="+f.getCarrierName());
				System.out.println( "ticket has been booked succesfully.");
			

					long newbooking= bookingservice.addBooking(bk);
					System.out.println(passengername+ " your BookingId is " +newbooking);
					}}}
				catch (BookingException e)
				{
	                    System.out.println(e.getMessage());
				}
				
				break;
				
			case 2:
				
				System.out.println("Enter Your BookingId : ");
				long bkid=in.nextInt();
				 try {
					  Booking b= bookingservice.viewBookingByBookingId(bkid);
					  if(b.getBookingId()==bkid)
					  {
				  System.out.println("Booking Details : bookingId ="+b.getBookingId()+","+" Passengername = "+b.getPassengername()+","+" Gender = "+b.getGender()+","+" Age = "+b.getAge()+","+" PhoneNo = "+b.getPhoneno()+","+ " IdNumber = "+b.getIdNumber());
				  
					  }
					  else{
							System.out.println("Sorry No details Found...");
						}
				 }
				 
		  catch(BookingException e) {
				 System.out.println(" BookingId not found");
					  }
			    break;
		
			case 3:
				try {
					  bookingservice.viewBooking();}
			catch(BookingException e) {
				System.out.println(e.getMessage()); 
			}
			    break;
			case 4:
				System.out.println("exit");
				System.exit(0);
				break;
		   default:
				System.out.println("Invalid choice");
			
	
			}
}

	}}
