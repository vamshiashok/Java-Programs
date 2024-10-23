package com.trywithsinglecatch;

import java.util.Scanner;

public class Launch2 {
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Division operation started");
			System.out.println("Enter num-1: ");
			int num1 = sc.nextInt();//Critical Statement
			System.out.println("Enter num-2: ");
			int num2 = sc.nextInt();//Critical Statement
			int res = num1/num2;//Critical Statement
			System.out.println(res);
			System.out.println("Division operation completed");
			
			System.out.println("Array operation started");
			System.out.println("Enter the array size: ");
			int n = sc.nextInt();//Critical Statement
			int arr[] = new int[n];//Critical Statement
			
			System.out.println("Enter the position to insert value: ");
			int pos = sc.nextInt();//Critical Statement
			System.out.println("Enter the value: ");
			int val = sc.nextInt();//Critical Statement
			arr[pos]=val;//Critical Statement
			
			System.out.println("Data added");
			System.out.println("Array operation completed");
			sc.close();
		}
		catch(Exception e){
			System.out.println("Exception occured in Main is handled");
		}
	}
}
