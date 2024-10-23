package com.trywithsinglecatch;

import java.util.Scanner;

public class Launch1 {
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter num-1: ");
			int num1 = sc.nextInt();//Critical Statement
			System.out.println("Enter num-2: ");
			int num2 = sc.nextInt();//Critical Statement
			int res = num1/num2;//Critical Statement
			System.out.println(res);
			sc.close();
		}
		catch(Exception e) {//generic catch block
			System.out.println("Exception occured in Main is handled");
		}
	}
}
