package com.destination.Basics.Patterns;

import java.util.Scanner;
/* 
 Output:
 #
 #
 #
 #
 #

 */
public class Pattern1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no.of symbols: ");
		int n = sc.nextInt();
		for (int i=1; i<=n; i++) {
			System.out.println("#");
		}
	}
}
