package com.dest.datatypes.wrappercls;

public class StringCode2 {
	public static void main(String[] args) {
		String s1 = "krish";
		String s2 = "krish";
		//check for string content
		if(s1.equals(s2)==true) {
			System.out.println("Strings are equal");
		}else {
			System.out.println("Strings are not equal");
		}
		//check for string addresses in the memory
		//Here the strings are created using the literals
		//so it is stored in Constant Pool
		//In constant pool no duplicates are allowed, so it returns the addresses are same for the above string even the strings too same.
		if(s1==s2) {
			System.out.println("Addresses are equal");
		}else {
			System.out.println("Addresses are not equal");
		}
	}
}
