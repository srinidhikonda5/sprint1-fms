package com.capg.sprint1.fms.ui;


import java.util.Scanner;

import com.capg.sprint1.fms.dao.BookingDao;
import com.capg.sprint1.fms.dao.BookingDaoImpl;
import com.capg.sprint1.fms.service.BookingService;
import com.capg.sprint1.fms.service.BookingServiceImpl;

public class Bookingui {
	static BookingService bookingservice=new BookingServiceImpl();
	static Scanner in= new Scanner(System.in);
	public static void main(String[] args) {
	for(;;) { 
		int choice;
		System.out.println("Enter your choice : ");
		System.out.println("1 - Booking");
		System.out.println("2 - View Booking");
		System.out.println("3 - Exit");
		
		choice=in.nextInt();
		switch (choice) {
		case 1:
//			bookingservice.addBooking();
			break;
		case 2:
			System.out.println(bookingservice.viewBooking());
			
			break;
		case 3:
			System.exit(0);
			break;
		default:
			System.out.println("Invalid Choice");
			break;
		}
		
		
		
	
}}
}