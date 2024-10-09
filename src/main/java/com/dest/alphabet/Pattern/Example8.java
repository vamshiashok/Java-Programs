package com.dest.alphabet.Pattern;

import java.util.Scanner;

/*
 - - - - - 1
 */
public class Example8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n value: ");
		int n = sc.nextInt();
		for (int i=1; i<=n; i++) {
			for (int j=n; j>=i; j--) {
				System.out.print("- ");
			}
			for (int j=1; j<=2*i-1; j++) {
				if(j==1 || j==2*i-1 || i==n) {
					System.out.print("1 ");
				}else {
					System.out.print("0 ");
				}
			}
			System.out.println();
		}
		
	}
}
