package com.destination.Basics.Patterns;
import java.util.Scanner;
/* 
Output:
# # # # # #
*/
public class Pattern2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no. of Symbols");
		int num=sc.nextInt();
		for(int i=1;i<=num;i++){
			System.out.print("# ");
		}
	}
}
