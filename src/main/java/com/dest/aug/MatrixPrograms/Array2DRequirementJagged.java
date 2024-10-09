package com.dest.aug.MatrixPrograms;
import java.util.Scanner;

class Array2DOpsJagged{
	String arr[][];
	int cls, stu;
	Scanner sc = new Scanner(System.in);
	
	void createArray() {
		System.out.println("Array creation initiated...");
		System.out.println("Enter the class count: ");
		cls = sc.nextInt();
		arr = new String[cls][];
		
		//initiating the jagged array
		//for storing the different count of students in each class
		for (int i=0; i<arr.length; i++) {
			System.out.println("Enter the student count inside the class no " + (i+1));
			stu = sc.nextInt();
			arr[i] = new String[stu];
		}
		System.out.println("Array is created.");
		System.out.println("------------------");
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
public class Array2DRequirementJagged {
	public static void main(String[] args) {
		Array2DOpsJagged a2oj = new Array2DOpsJagged();
		a2oj.createArray();
		a2oj.collectData();
		a2oj.displayData();
	}
}
