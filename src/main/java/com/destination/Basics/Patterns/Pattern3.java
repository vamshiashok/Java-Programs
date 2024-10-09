package com.destination.Basics.Patterns;

import java.util.Scanner;
/* 
 # # # # # 
 # # # # # 
 # # # # # 
 # # # # # 
 # # # # # 
 */
public class Pattern3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n value: ");
		int n = sc.nextInt();
		for (int i=1; i<=n; i++) {//for rows
			for (int j=1; j<=n; j++) {//for columns
				System.out.print("# ");
			}
			System.out.println();
		}
	}
}
