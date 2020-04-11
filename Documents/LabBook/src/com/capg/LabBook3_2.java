package com.capg;
import java.util.*;
public class LabBook3_2 {
	public static void main(String[] args) {
		String a[] = {"abc", "sakshi","nidhi","charan"};
				Arrays.sort(a);
		 System.out.println("sorted strings");
		 for(String s:a) {
		 System.out.println(s+" ");}
		 int n=a.length;
		 if(n%2==0) {
			 System.out.println("for even length");
			 for(int j=0;j<n/2;j++) {
				 System.out.println(a[j].toUpperCase());
			 }
			 for(int j=n/2;j<n;j++) {
				 System.out.println(a[j].toLowerCase());
			 }
		 }
		 else {
			 System.out.println("for odd length");
			 for(int j=0;j<(n/2)+1;j++) {
			 System.out.println(a[j].toUpperCase());
		 }
		 for(int j=(n/2)+1;j<n;j++) {
			 System.out.println(a[j].toLowerCase());}	 
	}}}
	