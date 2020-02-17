package com.capg;

class Cubes{
	public int findsum(int n) {
		int sum=0,rem;
		while(n>0) {
			rem=n%10;
			n=n/10;
			sum=sum+rem*rem*rem;
		}
		return sum;
	}
}
public class Lab4_1 {
public static void main(String[] args) {
	Cubes c=new Cubes();
	int k=c.findsum(123);
	System.out.println(k);
}
}
