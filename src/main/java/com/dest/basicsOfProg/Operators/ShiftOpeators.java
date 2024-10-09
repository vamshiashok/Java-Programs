package com.dest.basicsOfProg.Operators;

public class ShiftOpeators {
	public static void main(String[] args) {
		//left shift 
		int a = 10 << 2; 
		System.out.println(a); // 10 << 2 = 10 * (2^2) = 40
		int b = 10 << 3; 
		System.out.println(b); // 10 << 3 = 10 * (2^3) = 80
		
		//right shift
		int c = 10 >> 2;
		System.out.println(c); // 10 >> 2 = 10 / (2^2) = 2.5 =~ 2
		int d = 10 >> 3;
		System.out.println(d); // 10 >> 3 = 10 / (2^3) = 1.25 =~ 1
	}
}
