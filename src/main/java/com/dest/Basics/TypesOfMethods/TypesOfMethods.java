package com.dest.Basics.TypesOfMethods;

public class TypesOfMethods {
	// Type 1: Method with No Input and No Output
	void add() {
		System.out.println("Type1: Method with No Input and No Output");
		int a = 10, b = 20, c = a + b;
		System.out.println(c);
	}	
	// Type 2: Method with input and no output
	void add2(int a2, int b2) {
		System.out.println("Type2: Method with Input and No Output");
		int c2 = a2 + b2;
		System.out.println(c2);
	}
	// Type 3: Method with No Input but has an Output
	int add3() {
		System.out.println("Type3: Method with No Input but has an Output");
		int a = 2, b = 4, c = a + b;
		return c;
	}
	// Type 4: Method with Input and Output
	int add4(int a4, int b4) {
		System.out.println("Type4: Method with Input and Output");
		int c4 = a4 + b4;
		return c4;
	}
			
	//Main method
	public static void main(String[] args) {
		//create object
		TypesOfMethods c = new TypesOfMethods();
		//calling type1 method
		c.add();
		//calling type2 method by passing parameters
		c.add2(6,4);
		//calling type3 method which is having the return type, so we declare a variable to store that return variable.
		int res3 = c.add3();
		System.out.println(res3);//printing the result
		//calling type4 method which is having the input and output, so we pass the parameters while calling the method and we decalre a variable to store the result.
		int res4 = c.add4(10, 30);
		System.out.println(res4);
	}
}
