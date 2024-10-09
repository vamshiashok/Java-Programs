package com.dest.JavaPractice.Loops;

public class SampleDoWhileLoop {
	public static void main(String[] args) {
		
		/* Syntax:
		 * initialization;
		 * do{
		 * ----
		 * ---- loop logic
		 * ----
		 * increment/decrement;
		 * }while(condition);
		 * 
		 * Sequence of Execution:
		 * 1. Initialization
		 * 2. Loop logic
		 * 3. Increment / Decrement
		 * 4. Condition
		 */
		int i = 1;
		do {
			System.out.println("Happy Gowri & Ganesha Festival");
			i++;
		}while(i <= 10);
	}
}
