package com.dest.basicsOfProg.Operators;

public class UnaryOperator3 {
	public static void main(String[] args) {
		int a = 37;
		int b = a++ + a++;
		System.out.println(a); // return a = 39
		System.out.println(b);// return b = 75
	}
}
