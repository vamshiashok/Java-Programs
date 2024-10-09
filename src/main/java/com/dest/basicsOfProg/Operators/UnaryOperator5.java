package com.dest.basicsOfProg.Operators;

public class UnaryOperator5 {
	public static void main(String[] args) {
		int a = 159;
		int b = a-- + --a + a++ - a-- + ++a - --a - a++ - a-- + a++;
		System.out.println(a);//returns a = 158
		System.out.println(b);//returns b = 158
	}
}
