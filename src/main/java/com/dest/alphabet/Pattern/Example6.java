package com.dest.alphabet.Pattern;
/*
 1 1 1 1 1
 0 0 0 0 0
 1 1 1 1 1
 0 0 0 0 0
 1 1 1 1 1
 */
import java.util.Scanner;

public class Example6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n value: ");
		int n = sc.nextInt();
		for (int i=1; i<=n; i++) {
			for (int j=1; j<=n; j++) {
					if(i%2 == 1) {
						System.out.print("1 ");
					}else {
						System.out.print("0 ");
					}
			}
			System.out.println();
		}
	}
	
}
