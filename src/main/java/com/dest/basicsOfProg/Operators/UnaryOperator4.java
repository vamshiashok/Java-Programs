package com.dest.basicsOfProg.Operators;

public class UnaryOperator4 {
	public static void main(String[] args) {
		int a = 37;
		int b = ++a + a++ + a++ + a++;
		System.out.println(a); // returns a = 41
		System.out.println(b);// returns b = 155
	}
}
