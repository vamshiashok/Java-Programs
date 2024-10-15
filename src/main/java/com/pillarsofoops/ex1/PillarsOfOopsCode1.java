package com.pillarsofoops.ex1;

import java.util.Scanner;

abstract class Shapes{
	double area;
	abstract void collectData();
	abstract void calculate();
	void display() {
		System.out.println("The area is = "+area);
	}
}
class Circle extends Shapes{
	private double r;
	private final double pi = 3.14768;
	@Override
	void collectData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter radius");
		r = sc.nextDouble();
	}
	@Override
	void calculate() {
		area = pi * r * r;
	}
}
class Square extends Shapes{
	private double side;
	@Override
	void collectData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter side: ");
		side = sc.nextDouble();
	}
	@Override
	void calculate() {
		area = side * side;
	}
}
class Rectangle extends Shapes{
	private double l,b;
	@Override
	void collectData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length: ");
		l = sc.nextDouble();
		System.out.println("Enter breadth: ");
		b = sc.nextDouble();
	}
	@Override
	void calculate() {
		area = l * b;
	}
}
class Geometry{
	void useShapes(Shapes s) {
		s.collectData();
		s.calculate();
		s.display();
	}
}
public class PillarsOfOopsCode1 {
	public static void main(String[] args) {
		Geometry g = new Geometry();
		System.out.println("Circle Operations");
		Circle c = new Circle();
		g.useShapes(c);
		System.out.println("=======================");
		System.out.println("Square Operations");
		Square s = new Square();
		g.useShapes(s);
		System.out.println("=======================");
		System.out.println("Rectangle Operations");
		Rectangle r = new Rectangle();
		g.useShapes(r);
		
	}
}
