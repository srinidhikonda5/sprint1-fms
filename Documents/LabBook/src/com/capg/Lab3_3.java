package com.capg;
import java.util.*;

 class ArrayReverse{
	public int rev_no1(int n) {
int rem,rev_no=0;
while(n>0) {
	rem=n%10;
	n=n/10;
	rev_no=rev_no*10+rem;
}
return rev_no;
}}
public class Lab3_3 {
	public static void main(String[] args) {
		ArrayReverse ar=new ArrayReverse();
//		int a[]={456,678}; 
		List<Integer> nums=Arrays.asList(456,890,678,459);
		List<Integer> num1=new ArrayList<>();
		int e=0;
		System.out.println("reverse nums are:");
		for(int n:nums) {
			e=ar.rev_no1(n);
			num1.add(e);

			System.out.print(e+" ");
			}
		Collections.sort(num1);
		System.out.println("\nsorted numbers are");
		for(int i:num1 ) {

			System.out.print(i+" " );
		}
	}
}
