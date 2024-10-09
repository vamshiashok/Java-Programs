package com.dest.BasicsOfPro.ScannerEx;
import java.util.Scanner;
public class ScannerExample {
	public static void main(String[] args) {
		//create object for the Scanner class
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter byte value: ");
		byte b = sc.nextByte();
		System.out.println("The byte value is: " + b);
		System.out.println("Enter short value: ");
		short s = sc.nextShort();
		System.out.println("The short value is: " + s);
		System.out.println("Enter the integer value: ");
		int i = sc.nextInt();
		System.out.println("The integer value is: " + i);
		System.out.println("Enter the long value: ");
		long l = sc.nextLong();
		System.out.println("The long value is: " + l);
		System.out.println("Enter the float value: ");
		float f = sc.nextFloat();
		System.out.println("The float value is: " + f);
		System.out.println("Enter the double value: ");
		double d = sc.nextDouble();
		System.out.println("The double value is: " + d);
		System.out.println("Enter the string value: ");
		String str = sc.next();
		System.out.println("The String value is: " + str);
		System.out.println("Enter the string statement: ");
		String str1 = sc.nextLine();
		System.out.println("The string statement is: " + str1);
	}
	
}
