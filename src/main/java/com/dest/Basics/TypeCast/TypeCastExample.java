package com.dest.Basics.TypeCast;
//Type Casting: Process of converting one type of data into another type of data.
public class TypeCastExample {	
	public static void main(String[] args) {
		//implicit type casting
		byte b = 25;
		short s = b;
		int i = s;
		long l = i;
		System.out.println(l);//Automatically done by the compiler.
		//Explicit type casting
		long l1 = 100l;
		int i1 = (int) l1;
		short s1 = (short) i1;
		byte b1 = (byte) s1; //byte ranges from -128 to 127
		System.out.println(b1);//so it return 100
		//Explicit type casting
		short s2 = 130;//short ranges from -32768 to 32767
		byte b2 = (byte) s2;
		System.out.println(b2);// returns -126
		/*
		 * byte ranges from -128 to 127, i.e,.
		 * -128 -127 -126 -125 ..... 0 ..... 125 126 127
		 * here s2 = 130 so, 130 - the highest values in byte is 127 so, 130 - 127 = 3
		 * so it will loop from the highest value to the next 3 places so we will get -126
		 */
	}
}
