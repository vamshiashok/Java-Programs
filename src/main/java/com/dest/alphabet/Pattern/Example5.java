package com.dest.alphabet.Pattern;

/* 
a b c d e 
f g h i 
j k l 
m n 
o 
 */
import java.util.Scanner;

public class Example5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n value: ");
		int n = sc.nextInt();
		char c = 'a';
		for (int i=1; i<=n; i++) {
			for (int j=n; j>=i; j--) {
				System.out.print(c+ " ");
				c++;
			}
			System.out.println();
		}
	}
}
