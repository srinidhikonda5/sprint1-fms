package com.capg1.mobile.demo2;
public interface Sim {

	public void call() ;
	
	public void browse() ;
	
	default void printAllContacts() {
		System.out.println("No contacts found");
	}
}

