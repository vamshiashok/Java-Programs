package com.dest.aug.MatrixPrograms;
import java.util.Scanner;

class MatrixMul{
	int mat1[][];
	int mat2[][];
	int res[][];
	int size;
	Scanner sc = new Scanner(System.in);
	public void createMatrix() {
		System.out.println("Creating Matrices");
		System.out.println("-----------------");
		System.out.println("Enter the size of the matrix: ");
		size = sc.nextInt();
		mat1 = new int[size][size];
		System.out.println("Matrix-1 is succussfully created!");
		mat2 = new int[size][size];
		System.out.println("Matrix-2 is successfully created!");
		System.out.println("--------------------------------");
	}
	public void collectDataForFirstMatrix() {
		System.out.println("Enter data for Matrix-1");
		for (int i=0; i<size; i++) {
			for (int j=0; j<size; j++) {
				mat1[i][j] = sc.nextInt();
			}
		}
		System.out.println("Matrix-1 data is colleted.");
		System.out.println("--------------------------");
	}
	public void collectDataForSecondMatrix() {
		System.out.println("Enter data for Matrix-2");
		for (int i=0; i<size; i++) {
			for (int j=0; j<size; j++) {
				mat2[i][j] = sc.nextInt();
			}
		}
		System.out.println("Matrix-2 data is collected.");
		System.out.println("---------------------------");
	}
	public void multiplication() {
		res = new int[size][size];
		System.out.println("Resultant matrix is ready for collecting the Multiplication.");
		for (int i=0; i<size; i++) {
			for (int j=0; j<size; j++) {
				//initializing the resultant matrix
				res[i][j] = 0;
				for (int k=0; k<size; k++) {
					res[i][j] = res[i][j]+ (mat1[i][k] * mat2[k][j]);
				}
			}
		}
		System.out.println("Result is collected into the resultant matrix.");
		System.out.println("----------------------------------------------");
	}
	public void display() {
		System.out.println("Printing the resultant matrix.");
		for (int i=0; i<size; i++) {
			for (int j=0; j<size; j++) {
				System.out.print(res[i][j] + "	");
			}
			System.out.println();
		}
	}
}
public class MatrixMultiplication {
	public static void main(String[] args) {
		MatrixMul mm = new MatrixMul();
		mm.createMatrix();
		mm.collectDataForFirstMatrix();
		mm.collectDataForSecondMatrix();
		mm.multiplication();
		mm.display();

	}
}
