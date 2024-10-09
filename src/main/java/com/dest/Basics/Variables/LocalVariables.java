package com.dest.Basics.Variables;
class Calculator{
	void add() {
		//local variables
		int a = 10;
		int b = 20;
		int c = a + b;
		System.out.println(c);
	}
	void sub(int a, int b) {
		// a and b are also local variables
		int c = a - b; // local variable
		System.out.println(c);
	}
}
public class LocalVariables {
	public static void main(String[] args) {
		Calculator c = new Calculator();// create object of the class Calculator.
		c.add();//calling add method
		c.sub(20, 5);// calling sub method
	}
}
/* 1. Local Variables are present inside the method, function or block. 
2. Local variables will present as does part(behavior of the object).
3. Local variables are peresent inside the stack memory.
4. Local variables will not get the default values.
5. Local variables can be accessed anywhere inside the method, function or block where it is created.
6. Local variables cannot be accessed from anywhere using object reference.
*/