package com.dest.basicsOfProgramming.variables;
class SampleCode
{
	static int a,b,c;//static variables
	int p,q,r;//non-static variables
	
	//static block
	static 
	{
		System.out.println("Hi from static block");
		System.out.println("Initial static variables value");
		//static variables can be accessed by static blocks
		a = 10;
		b = 20;
		c = 30;
		//non-static variables cannot be accessed by static blocks
//		p = 10001;
//		q = 20001;
//		r = 30001;
	}

	//non-static block
	{
		//non-static variables can be accessed by non-static blocks
		p = 100;
		q = 200;
		r = 300;
		//static variables can be accessed by non-static blocks
		a = 1001;
		b = 2001;
		c = 3001;
	}
	
	//static method
	static void display()
	{
		//static variables can be accessed by static methods
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		//non-static variables cannot be accessed by static methods
//		System.out.println(p);
//		System.out.println(q);
//		System.out.println(r);
	}
	
	//non-static method
	void display1()
	{
		//non-static variables can be accessed by non-static methods
		System.out.println(p);
		System.out.println(q);
		System.out.println(r);
		//static variables can be accessed by non-static methods
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}	
}
public class StaticProgramExample
{
	public static void main(String args[])
	{
		System.out.println("Hi from main");
		SampleCode.display();//calling static block Using the class
		System.out.println("---------------");
		System.out.println("Changing the static variables value");
		SampleCode.a = 111;
		SampleCode.b = 222;
		SampleCode.c = 333;
		SampleCode.display();//printing the above changed values
		System.out.println("---------------");
		SampleCode sc = new SampleCode();//creating object for SampleCode class
		System.out.println("Calling Non-static Method, it can print the Static variables too.");
		sc.display1();//calling non-static method using object reference
		System.out.println("---------------");
		sc.display();//calling static method using object reference
	}
}