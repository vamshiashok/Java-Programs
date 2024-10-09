package com.dest.aug.MatrixPrograms;
import java.util.Scanner;

class MatrixOps{
	int mat1[][];
	int mat2[][];
	int size;
	int res[][];
	Scanner sc = new Scanner(System.in);
	public void createMatrix() {
		System.out.println("Creating the matrices...");
		System.out.println("Enter the size of the matrices: ");
		size = sc.nextInt();
		mat1 = new int[size][size];
		System.out.println("Matrix-1 is created.");
		mat2 = new int[size][size];
		System.out.println("Matrix-2 is created.");
		System.out.println("-----------------------");
	}
	public void collectDataForFirstMatrix() {
		System.out.println("Collecting data for Matrix-1");
		for (int i=0; i<size; i++){//for rows
			for (int j=0; j<size; j++) {//for columns
				mat1[i][j] = sc.nextInt();
			}
		}
		System.out.println("Matrix-1 is created.");
		System.out.println("--------------------");
	}
	public void collectDataForSecondMatrix() {
		System.out.println("Collecting data for Matrix-2");
		for (int i=0; i<size; i++) {
			for (int j=0; j<size; j++) {
				mat2[i][j] = sc.nextInt();
			}
		}
		System.out.println("Matrix-2 is created.");
		System.out.println("----------------------");
		
	}
	public void addition() {
		res = new int[size][size];
		System.out.println("Resultant matrix is ready for collecting the sum...");
		for (int i=0; i<size; i++) {
			for (int j=0; j<size; j++) {
				res[i][j] = mat1[i][j] + mat2[i][j];
			}
		}
		System.out.println("Result is collected into the resultant matrix.");
		System.out.println("------------------------");
		
	}
	public void display() {
		System.out.println("Printing the resultant matrix");
		for (int i=0; i<size; i++) {
			for (int j=0; j<size; j++) {
				System.out.print(res[i][j]+ " ");
			}
			System.out.println();
		}
	}
}
public class MatrixAddition {
	public static void main(String[] args) {
		MatrixOps mo = new MatrixOps();
		mo.createMatrix();
		mo.collectDataForFirstMatrix();
		mo.collectDataForSecondMatrix();
		mo.addition();
		mo.display();
	}
}
