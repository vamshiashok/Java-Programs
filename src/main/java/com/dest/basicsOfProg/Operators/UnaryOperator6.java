package com.dest.basicsOfProg.Operators;

public class UnaryOperator6 {
	public static void main(String[] args) {
		int a = 934;
		int b = --a - a-- + a++ + ++a - a-- + --a - a-- - a-- + a++ + a++ + ++a - --a - a-- + a++ + a-- - a++ + a-- - --a + a-- + a++ - a-- - a-- - a++;
		System.out.println(a);//returns a = 929
		System.out.println(b);//returns b = 937
	}
}
