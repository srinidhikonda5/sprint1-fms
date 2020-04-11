package com.capg;
import java.util.*;
class Vehicles{
	String type;
	String model_no;
	String model_name;
	String owner_name;
	String owner_details;
	public Vehicles(String type,String model_no,String model_name,String owner_name, String owner_details) {
	this.type=type;
	this.model_no=model_no;
	this.model_name=model_name;
	this.owner_name=owner_name;
	this.owner_details=owner_details;
	}
	public Vehicles() {
		super();
	}
	public String get_type() {
		return type;
	}
	public String retrieve()throws TypeException {
		return "null";
	}
}
////////////////////////////////////////////////////////////////////////////////////////////

class Car extends Vehicles{
	public Car(String type,String model_no,String model_name,String owner_name,String owner_details){
		super(type,model_no, model_name, owner_name,owner_details);
}
	public Car() {
		super();
	}
	public String get_type() {
		return type;
	}
	public void set_type() {
		this.type=type;
	}
	public String retrieve()throws TypeException {
		if(type=="null") {	throw new TypeException(" Error");}
		else {return model_no+model_name+owner_details+owner_name;}
			}
}

class TypeException extends Exception{
	public TypeException(String msg) {
		super(msg);
		}
	}



public class Exp{
	public static void main(String[] args) {
		Car ve=new Car();
		try{ve.retrieve();}
		catch(TypeException e) {
  e.getMessage();
	}
	
}
}