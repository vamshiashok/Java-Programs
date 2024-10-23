package com.trywithmultiplecatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Launch3 {

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
			//specific catch blocks
			catch(InputMismatchException ime) {
				System.out.println("Input Mismatch Exception is handled");
			}
			catch(ArithmeticException ae) {
				System.out.println("Arithmetic Exception is handled");
			}
			catch(NegativeArraySizeException nase) {
				System.out.println("Negative Array Size Exception is handled");
			}
			catch(ArrayIndexOutOfBoundsException aiobe) {
				System.out.println("Array Index Out Of Bounds Exception is handled");
			}
			//generic catch block
			catch(Exception e){
				System.out.println("Exception occured in Main is handled");
			}
		}
	}

