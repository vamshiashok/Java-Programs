package com.dest.BasicofProg.ConditionalStatements;
import java.util.Scanner;
public class ConditinalStatements {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("--------- if - else if - else -------");
		System.out.println("Enter the age of the candidate: ");
		int age = sc.nextInt();
		// if condition
		if (age < 18) {
			System.out.println("You are just a kid, don't think about the marriage.");
		}
		// else if condition
		else if(age > 60) {
			System.out.println("You are already a senior citizen, don't have too much of desires.");
		}
		// else condition
		else {
			System.out.println("Eligible for marriage.");
		}
		
		System.out.println("--------- Nested if else --------");
		int accno = 111;
		int pwd = 222;
		int new_acc;
		int new_pwd;
		System.out.println("Enter the account number: ");
		new_acc = sc.nextInt();
		System.out.println("Enter the password: ");
		new_pwd = sc.nextInt();
		// nested if else
		if (accno == new_acc) {
			if (pwd == new_pwd) {
				System.out.println("Valid Customer");
			}else {
				System.out.println("Invalid Password.");
			}
		}else {
			System.out.println("Invalid Account Number.");
		}
		
		System.out.println("------- Switch Case --------");
		System.out.println("Enter Num1: ");
		int num1 = sc.nextInt();
		System.out.println("Enter Num2: ");
		int num2 = sc.nextInt();
		
		System.out.println("Enter your choice: \n"
				+ "1. Addition\n"
				+ "2. Subtraction\n"
				+ "3. Multiplication\n"
				+ "4. Division\n");
		int choice = sc.nextInt();
		switch(choice) {
		case 1:{
			System.out.println("Addition is selected and result is shown below:");
			System.out.println(num1 + num2);
			break;
		}
		case 2:{
			System.out.println("Subtraction is selected and result is shown below:");
			System.out.println(num1 - num2);
			break;
		}
		case 3:{
			System.out.println("Multiplication is selected and result is shown below:");
			System.out.println(num1 * num2);
			break;
		}
		case 4:{
			System.out.println("Division is selected and result is shown below:");
			System.out.println(num1 / num2);
			break;
		}
		default:{
			System.out.println("Wrong choice");
			break;
		}
		}
		
	}
}
