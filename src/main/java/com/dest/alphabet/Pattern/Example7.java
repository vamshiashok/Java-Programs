package com.dest.alphabet.Pattern;

import java.util.Scanner;

public class Example7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n value: ");
		int n = sc.nextInt();
		for (int i=1; i<=n; i++) {
			for (int j=1; j<=n; j++) {
					if(j%2 == 1) {
						System.out.print("1 ");
					}else {
						System.out.print("0 ");
					}
			}
			System.out.println();
		}
	}
}
