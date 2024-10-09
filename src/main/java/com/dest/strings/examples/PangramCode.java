package com.dest.strings.examples;

import java.util.Scanner;

public class PangramCode {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sentence: ");
		String s = sc.nextLine();
		//convert the string to upper-case
		s = s.toUpperCase();
		int arr[] = new int[26];
		for (int i=0; i<arr.length; i++) {
			arr[i] = 0;
		}
		//for 26 alphabets if we found it is an alphabet then store 1 in that alphabet position 
		int temp;
		for (int i=0; i<s.length(); i++) {
			temp = s.charAt(i)-65;
			arr[temp] = 1;
		}
		for (int i=0; i<arr.length; i++) {
			if(arr[i] != 1) {
				System.out.println("Not Pangram");
				System.exit(0);
			}
		}
		System.out.println("Pangram");
		sc.close();
	}
}
