package com.dest.basicsOfProg.Operators;

public class UnaryOperator1 {
	/* 
	 1.  + or - or * / -> mid end
	 2.  variable -> assignment 
	 3.  Increment / Decrement 
	 4.  ; -> dead end
	 */
	public static void main(String[] args) {
		int a = 37;
		int b = a++;
		System.out.println(a);//return a = 38
		System.out.println(b);//return b = 37, here the first one is variable and increment oprator, so as per the rules first it will check for mid end, assignment, increment or decrement, here we got variable i.e assignment so the a value 37 is assigned to b.
		
	}	
}
