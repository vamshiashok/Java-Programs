package com.dest.datatypes.wrappercls;

public class StringCode3 {
	public static void main(String[] args) {
		String s1 = new String("krish");
		String s2 = new String("krish");
		
		//check for string content
		if(s1.equals(s2)==true) {
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
