package com.destination.Basics.Patterns;
import java.util.Scanner;
/* 
 1 1 1 1 1
 2 2 2 2 2
 3 3 3 3 3
 4 4 4 4 4
 5 5 5 5 5
 */
public class Pattern4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n Value:");
		int num=sc.nextInt();
		for(int i=1;i<=num;i++){
			for(int j=1;j<=num;j++){
				System.out.print(i);
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}
