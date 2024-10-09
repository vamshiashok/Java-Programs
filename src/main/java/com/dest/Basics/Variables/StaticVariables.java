package com.dest.Basics.Variables;
class SampleCode{
	static int a, b, c; //static variables
	int p, q, r; //non-static variables
	//static block 
	static {
		//static variables can be accessed by static blocks
		a = 10;
		b = 20; 
		c = 30;
		//non-static variables cannot be accessed by static blocks
		/*
		 p = 1001;
		 q = 2001;
		 r = 3001; 
		 It will generate an error.
		 */
	}
	//non-static block
	{
		//non-static variables can be accessed by non-static blocks
		p = 100;
		q = 200; 
		r = 300;
		//static variables can be accessed by the non-static blocks
		a = 1001; 
		b = 2001;
		c = 3001;
	}
	//static method
	static void display() {
		//static variables can be accessed by static methods
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		//non-static variables cannot be accessed by static blocks
		/* 
		System.out.println(p);
		System.out.println(q);
		System.out.println(r);
		It will generate error.
		 */
	}
	//non-static method
	void display1() {
		//non-static variables can be accessed by non-static blocks
		System.out.println(p);
		System.out.println(q);
		System.out.println(r);
		//static variables can be accessed by non-static blocks
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}
public class StaticVariables {
	public static void main(String[] args) {
		System.out.println("Hi from main method");
		SampleCode.display();//static methods can be accessed directly using class name instead creating an object
		System.out.println("---------------------");
		//Changing the static variable values using class reference
		System.out.println("Changing the static variable values: ");
		SampleCode.a = 111;
		SampleCode.b = 222;
		SampleCode.c = 333;
		SampleCode.display();//calling the static method
		System.out.println("----------------------");
		SampleCode sc = new SampleCode();//create object of the class SampleCode to call the non-static methods
		System.out.println("Calling the Non-Static Method(can access static & non-static variables");
		sc.display1(); //calling the non-static method.
		System.out.println("----------------------");
		System.out.println("Calling the Static Method again after changing the values");
		sc.display();//calling the static method using object reference, static method don't require any object to call the method
	}
}
