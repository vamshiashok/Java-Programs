package com.destination.Basics.Patterns;

import java.util.Scanner;

/*
 #
 # #
 # - #
 # - - #
 # # # # #
 */
public class Pattern21 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n value: ");
		int n = sc.nextInt();
		for (int i=1; i<=n; i++) {
			for (int j=1; j<=i; j++) {
				/*
				 i==1 means first row
				 j==1 means first column
				 i==(n) means last row
				 j==i means every last element in each row
				 */
				if (i==1 || j==1 || i==(n) || j==i)
					System.out.print("# ");
				else 
					System.out.print("- ");
			}
			System.out.println();
		}
	}
}
