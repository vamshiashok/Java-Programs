package com.dest.aug.MatrixPrograms;
import java.util.Scanner;

class Array2DOps{
	String arr[][];
	int stu;
	int cls;
	Scanner sc = new Scanner(System.in);
	void createArray() {
		System.out.println("Array creation initiated....");
		System.out.println("Enter class count: ");
		cls = sc.nextInt();
		System.out.println("Enter the student count: ");
		stu = sc.nextInt();
		arr = new String[cls][stu];
		System.out.println("Array is created...");
		System.out.println("--------------------");
	}
	void collectData() {
		System.out.println("Collecting student data");
		for (int i=0; i<arr.length; i++) {
			System.out.println("Inside the class no: " + (i+1));
			for (int j=0; j<arr[i].length; j++) {
				System.out.println("Enter the name of student no: " +  (j+1));
				arr[i][j] = sc.next();
			}
		}
		System.out.println("Array data is collected...");
		System.out.println("--------------------");
	}
	void displayData() {
		System.out.println("Displaying the student data.");
		for (int i=0; i<arr.length; i++) {
			System.out.println("Inside the class no: " + (i+1));
			for (int j=0; j<arr[i].length; j++) {
				System.out.println("The name of student no: " +  (j+1) + " is: " + arr[i][j]);
			}
		}
	}
}
public class Array2DRequirement {
	public static void main(String[] args) {
		Array2DOps a2o = new Array2DOps();
		a2o.createArray();
		a2o.collectData();
		a2o.displayData();
	}
}
