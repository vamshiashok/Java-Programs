package com.dest.alphabet.Pattern;

import java.util.Scanner;

public class Example2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n value: ");
		int n = sc.nextInt();
		char c;
		for (int i=1; i<=n; i++) {
			c='A';
			for (int j=1; j<=i; j++) {
				System.out.print(c + " ");
				c++;
			}
			System.out.println();
			
		}
	}
}
