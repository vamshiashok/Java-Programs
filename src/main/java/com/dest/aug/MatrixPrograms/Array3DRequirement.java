package com.dest.aug.MatrixPrograms;
import java.util.Scanner;

class Array3DOps{
	int arr[][][];
	int col;
	int cls;
	int stu;
	Scanner sc = new Scanner(System.in);
	
	void createArray() {
		System.out.println("Array creation initiated...");
		System.out.println("Enter college count: ");
		col = sc.nextInt();
		System.out.println("Enter class count: ");
		cls = sc.nextInt();
		System.out.println("Enter student count: ");
		stu = sc.nextInt();
		arr = new int[col][cls][stu];
		System.out.println("Array is created.");
		System.out.println("-----------------");
	}
	
	void collectData() {
		System.out.println("\nCollecting Student data.");
		for (int i=0; i<arr.length; i++) {
			System.out.println("Inside the college: " + i );
			for (int j=0; j<arr[i].length; j++) {
				System.out.println("Inside the class: " + j);
				for (int k=0; k<arr[i][j].length; k++) {
					System.out.println("Enter the marks of student no: " + (k+1));
					arr[i][j][k] = sc.nextInt(); 
				}
			}
		}
		System.out.println("Array data is collected.");
		System.out.println("------------------------");
	}
	
	void displayData() {
		System.out.println("\nDisplaying the student data.");
		for (int i=0; i<arr.length; i++) {
			System.out.println("Inside the college: " + i );
			for (int j=0; j<arr[i].length; j++) {
				System.out.println("Inside the class: " + j);
				for (int k=0; k<arr[i][j].length; k++) {
					System.out.println("The marks of student no: " + (k+1) + " is: " + arr[i][j][k]);
				}
			}
		}
	}
}
public class Array3DRequirement {
	public static void main(String[] args) {
		Array3DOps a3o = new Array3DOps();
		a3o.createArray();
		a3o.collectData();
		a3o.displayData();
	}
}
