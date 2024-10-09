package com.dest.datatypes.wrappercls;

public class StringCode4 {
	public static void main(String[] args) {
		String s1 = "krish";
		String s2 = "Krish"; //K is capital here
		//check for string content
		//Here the String content is actually different, but it is ignored by equalsIgnoreCase() method.
		if(s1.equalsIgnoreCase(s2)==true) {
			System.out.println("Strings are equal");
		}else {
			System.out.println("Strings are not equal");
		}
		//check for string addresses in the memory
		//Here the strings are created using the literals
		//so it is stored in Constant Pool
		//In constant pool duplicates are not allowed, but here the two string are different in cases. 
		//So Addresses are not equals.
		if(s1==s2) {
			System.out.println("Addresses are equal");
		}else {
			System.out.println("Addresses are not equal");
		}
	}
}
