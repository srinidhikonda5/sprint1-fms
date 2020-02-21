package com.capg.fms.ui;

import java.util.Scanner;
import java.util.Set;

import com.capg.fms.dto.Booking;
import com.capg.fms.dto.Flight;
import com.capg.fms.exception.BookingException;
import com.capg.fms.service.BookingService;
import com.capg.fms.service.BookingServiceImpl;

public class BookingUi {
	static BookingService bookingservice =new BookingServiceImpl();
	static Scanner in=new Scanner(System.in);
//	static Booking b=new Booking();
	private static long bookingId;
	public static void main(String[] args) throws Exception 
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
while(choice!=4)

		{
//	       int choice;
	      
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
//	Booking bk1 = new Booking();
//	Flight f1=new Flight();
	
			System.out.println("Number of Passengers");
				noOfPassengers = in.nextInt();
//				bk1.setNoOfPassengers(noOfPassengers);
               System.out.println("seat capacity");
               seatCapacity=in.nextInt();
//               f1.setSeatCapacity(seatCapacity);
       
				for(int i=0;i<noOfPassengers;i++)
				{
					
					if(noOfPassengers<=seatCapacity) { 
//						Flight f=new Flight(flightNumber, flightModel, carrierName,  seatCapacity);
//						Booking bk = new Booking(bookingId,noOfPassengers, passengername,gender,age,  phoneno,idNumber);
						
						
					System.out.println("enter bookingid");
					bookingId=in.nextLong();
//					bk1.setBookingId(bookingId);
					
				System.out.println("Enter Name");
				passengername = in.next()+in.nextLine();
//               bk.setPassengername(passengername);
				System.out.println("Enter Age");
				age = in.nextInt();
//				bk.setAge(age);
				System.out.println("Gender");
				gender = in.next()+in.nextLine();
//				bk.setGender(gender);
				System.out.println("Enter phone number");
				phoneno = in.nextLong();
//				bk.setPhoneno(phoneno);
				System.out.println("Enter Id number");
				idNumber = in.nextLong();     
//				bk.setIdNumber(idNumber);
				System.out.println("flightnumber");
				flightNumber=in.nextLong();
//				f1.setFlightNumber(flightNumber);
				System.out.println("flightModel");
				flightModel=in.next();
//				f1.setFlightModel(flightModel);
				System.out.println("carriername");
				carrierName=in.next(); 
//				f1.setCarrierName(carrierName);
				
				Flight f=new Flight(flightNumber, flightModel, carrierName,  seatCapacity);
				Booking bk = new Booking(bookingId,noOfPassengers, passengername,gender,age,  phoneno,idNumber);

				
				System.out.println("Booking Details : bookingId ="+bk.getBookingId()+","+" Passengername = "+bk.getPassengername()+","+" Gender = "+bk.getGender()+","+" Age = "+bk.getAge()+","+" PhoneNo = "+bk.getPhoneno()+","+ " IdNumber = "+bk.getIdNumber()+","
						+"flightname ="+f.getFlightNumber()+","+" flightmodel ="+f.getFlightModel()+","+" carriername ="+f.getCarrierName());
				System.out.println( "ticket has been booked succesfully.");
			
//				try {
					long newbooking= bookingservice.addBooking(bk);
					System.out.println(passengername+ " your BookingId is " +newbooking);
					}}}
				catch (Exception e)
				{
	                    System.out.println(e.getMessage());
					e.printStackTrace();
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
							
//					  System.out.println("Booking Details :Passengername = "+b.getPassengername()+"Gender = "+b.getGender()+"  Age = "+b.getAge()+  "Phoneno = "+b.getPhoneno()+   "IdNumber = "+b.getIdNumber());
					  }
					  else{
							System.out.println("Sorry No details Found...");
						}
				 }
				 
		  catch(Exception e) {
				 System.out.println("ERROR 404: BookingId not found");
					  }
			    break;
		
			case 3:try {
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
