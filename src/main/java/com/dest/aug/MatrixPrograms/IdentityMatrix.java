package com.dest.aug.MatrixPrograms;
import java.util.Scanner;

class MatrixOps1{
	int mat[][];
	int size;
	Scanner sc = new Scanner(System.in);
	
	void createMatrix() {
		System.out.println("Enter the size: ");
		size = sc.nextInt();
		mat = new int[size][size];
		System.out.println("Matrix is successfully created.");
		System.out.println("-------------------------------");
	}
	
	void collectMatrixData() {
		System.out.println("Collecting data for Matrix...");
		for (int i=0; i<size; i++) {
			for (int j=0; j<size; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		System.out.println("Matrix data is collected.");
		System.out.println("--------------------------");
	}
	
	void checkIdentity() {
		System.out.println("Checking the given matrix is identity or not\n");
		for (int i=0; i<size; i++) {
			for (int j=0; j<size; j++) {
				if (i==j) {
					if(mat[i][j] != 1) {
						System.out.println("Oops!,The given matrix is not an Identity Matrix");
						System.exit(0);
					}	
				}
				else {
					if (mat[i][j] != 0) {
						System.out.println("Oops!,The given matrix is not an Identity Matrix");
						System.exit(0);
					}
				}
			}
		}
		System.out.println("Yahoo!, The given matrix is an Identity Matrix");
		System.exit(0);
	}
}
public class IdentityMatrix {
	public static void main(String[] args) {
		MatrixOps1 mo1 = new MatrixOps1();
		mo1.createMatrix();
		mo1.collectMatrixData();
		mo1.checkIdentity();
	}
}
