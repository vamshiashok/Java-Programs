package com.dest.datatypes.wrappercls;

public class StringCode5 {
	public static void main(String[] args) {
		String s1 = new String("krish");
		String s2 = new String("Krish");//K is capital here
		
		//check for string content
		//It will ignore the cases of the string by equalsIgnoreCase() method
		if(s1.equalsIgnoreCase(s2)==true) {
			System.out.println("String are equal");
		}else {
			System.out.println("Strings are not equal");
		}
		//check for the addresses
		/*
		 * Here we created the strings using object representation, so it can be stored in Non-Constant Pool
		 * In Non-Constant Pool Duplicates are allowed, so the addresses are never be equal.
		 */
		if(s1==s2) {
			System.out.println("Addresses are equal");
		}else {
			System.out.println("Addresses are not equal.");
		}
	}
}
