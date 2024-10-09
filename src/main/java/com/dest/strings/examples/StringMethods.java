package com.dest.strings.examples;

public class StringMethods {
	public static void main(String[] args) {
		String s1 = "Dasari";
		String s2 = "VAMSHI";
		//toUpperCase() & toLowerCase() method
		System.out.println("Converting " + "'" + s1 + "'" + " to UpperCase: " + s1.toUpperCase());
		System.out.println("Converting " + "'" + s2+ "'"  + " to LoweCase: " + s2.toLowerCase());
		String s3 = "Destination Technologies";
		//startsWith() & endsWith() methods
		System.out.println("Check whether the string " +"'" +  s3 + "'" + " starts with 'Dest': " + s3.startsWith("Dest"));
		System.out.println("Check whether the string " +"'" +  s3 + "'" + " ends with 'Technologies': " + s3.endsWith("Technologies"));
		//contains() method
		System.out.println("Check whether the string " + "'" + s3 + "'"+ " contains " + "'" + " nation " + "' : " + s3.contains("nation"));
		//charAt() method
		System.out.println("Print the character at index 0 in the string " + "'" + s2 + "' : " + s2.charAt(0));
		//indexOf() method
		System.out.println("Print the index position of 'A' in the string " + s2 + " : " + s2.indexOf('A'));
		//getClass() method
		System.out.println("Print the class for which the given string " + "'" + s2 + "'" + " belongs to : " + s2.getClass());
		//concat() method
		s1.concat(s2);//since the string is immutable so we can't able to concat it directly, we can forcefully concat it as follows
		System.out.println("Concatenating " + "'" + s1 + "'" + " and " + "'" + s2 + "' : " + s1.concat(s2));//but the original strings can't be altered.
		//hashCode() method
		System.out.println("Printing the Hashcode of the String " + "'" + s1 + "' :" + s1.hashCode());
		//isBlank() method
		String s4 = "";
		System.out.println("Checking the string is blank or not : " + s4.isBlank());//Returns true if blank else false
		String s5 = "     "; 
		System.out.println("Checking the string is blank or not : " + s5.isBlank());//Even though there are white-spaces it returns true only.
		//isEmpty() method
		System.out.println("Checking the string is empty or not : " + s4.isEmpty());//Returns true if empty else false
		System.out.println("Checking the string is empty or not : " + s5.isEmpty());//Returns false, because it contains white-spaces.
		//lastIndexOf() method
		String s6 = "Dasari Vamshi";
		System.out.println("Checking the Last Index of 'a' in the string " + "'" + s6 + "'" + " is: " + s6.lastIndexOf('a'));
		
	}
}
