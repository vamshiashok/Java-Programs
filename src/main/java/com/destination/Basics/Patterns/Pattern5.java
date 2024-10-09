package com.destination.Basics.Patterns;

import java.util.Scanner;

/*
 output: if the input is 5 then:
 1 2 3 4 5
 1 2 3 4 5
 1 2 3 4 5
 1 2 3 4 5
 1 2 3 4 5
 */
public class Pattern5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n value: ");
		int n = sc.nextInt();
		for (int i=1; i<=n; i++) {
			for (int j=1; j<=n; j++) {
				System.out.print(j);
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}
