package com.dest.strings.examples;
class Calculator{
	int add(int a, int b) {
		return a+b;
	}
	int add(int a, int b, int c) {
		return a+b+c;
	}
	float add(float a, float b) {
		return a+b;
	}
	float add(float a, float b, float c) {
		return a+b+c;
	}
	double add(double a, double b) {
		return a+b;
	}
	double add(double a, double b, double c) {
		return a+b+c;
	}
	float add(int a, float b) {
		return a+b;
	}
	float add(float a, int b) {
		return a+b;
	}
	double add(int a, float b, double c) {
		return a+b+c;
	}
}
public class MethodOverloadingEx {
	public static void main(String[] args) {
		Calculator c = new Calculator();
		System.out.println(c.add(10, 10));
		System.out.println(c.add(10.3f, 11.5f));
		System.out.println(c.add(345.879d, 3232.434d));
	}
}
