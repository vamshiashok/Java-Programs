package com.dest.alphabet.Pattern;
/*
A A A A A 
B B B B B 
C C C C C 
D D D D D 
E E E E E 
 */
import java.util.Scanner;

public class Example1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n value: ");
		int n = sc.nextInt();
		char c = 'A';
		for (int i=1; i<=n; i++) {
			for (int j=1; j<=n; j++) {
				System.out.print(c + " ");
			}
			System.out.println();
			c++;
		}
	}
}
