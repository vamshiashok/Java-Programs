package com.dest.basicsOfProg.Operators;

public class TernaryOperator {
	public static void main(String[] args) {
		int a = 40, b = 60;
		/* It checks the condition first if a is greater than b,
		 * if true then print a else print b
		 */
		int res = (a > b)? a:b; 
		System.out.println(res);
	}
}
