package com.capg1.mobile.demo2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("mobile")
public class Mobile {

	@Autowired
	@Qualifier("vodafone")
	Sim sim;
	
	public void makeACall() {
		sim.call();
	}
	
	public void browseInternet() {
		sim.browse();
	}
	
	public void printAllContacts() {
		sim.printAllContacts();
	}
	
	
	
}

///////////////////////////////////////////
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.stereotype.Component;
//
//@Component("mobile")
//public class Mobile {
//		
//		@Autowired
//		@Qualifier("airtel")
//		Sim sim;
//
////		public Mobile() {}
////		public Mobile(Sim sim) {
////			System.out.println("");
////			this.sim=sim;
//////		}
////	  public Sim getSim() {
////			return sim;
////		}
////
////		public void setSim(Sim sim) {
////			System.out.println("Sim Injected through setter");
////			this.sim = sim;
////		}
//
//	public void makeACall() {
//		sim.call();
//	  }
//
//	  public void browseInternet() {  
//		  sim.browse();
//	  }
//	  public void printAllContacts() {
//		  sim.printAllContacts();
//	  }
//	}
//
