package com.destination.Basics.Patterns;

import java.util.Scanner;

/*
 Output: if the input is 5 then:
 1	6	11	16	21
 2	7	12	17	22
 3	8	13	18	23
 4	9	14	19	24
 5	10	15	20	25
 */
public class Pattern8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n value: ");
		int n = sc.nextInt();
		for (int i=1; i<=n; i++) {
			int count = i;
			for (int j=1; j<=n; j++) {
				System.out.print(count);
				System.out.print("	");
				count += n;
			}
			System.out.println();
		}
	}
}
