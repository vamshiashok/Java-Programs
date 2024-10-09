package com.destination.Basics.Patterns;

import java.util.Scanner;

/*
 1
 2	7
 3	8	13
 4	9	14	19
 5	10	15	20	25
 */
public class Pattern13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n value: ");
		int n = sc.nextInt();
		int count;
		for (int i=1; i<=n; i++) {
			count = i;
			for (int j=1; j<=i; j++) {
				System.out.print(count + "	");
				count+=n;
			}
			System.out.println();
		}
	}
}
