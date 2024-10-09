package com.dest.strings.examples;

import java.util.Scanner;

public class SpaceCount {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str = sc.nextLine();
		int spc=0;
		for (int i=0; i<str.length(); i++) {
			//str.charAt(i)==' ' count the space
			//str.charAt(i+1) != ' '  ignores the second space if it have
			if(str.charAt(i)==' ' && str.charAt(i+1) != ' ') {
				spc++;
			}
		}
		System.out.println("The total no.of words: " + (spc+1));
	}
}
