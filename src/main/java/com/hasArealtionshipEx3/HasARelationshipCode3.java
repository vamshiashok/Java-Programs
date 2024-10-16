package com.hasArealtionshipEx3;

class Heart{
	double hWeight;
	double hBeat;
	public Heart(double hWeight, double hBeat) {
		super();
		this.hWeight = hWeight;
		this.hBeat = hBeat;
	}
	public double gethWeight() {
		return hWeight;
	}
	public double gethBeat() {
		return hBeat;
	}
}
class Brain{
	double bWeight;
	double IQ;
	public Brain(double bWeight, double iQ) {
		super();
		this.bWeight = bWeight;
		IQ = iQ;
	}
	public double getbWeight() {
		return bWeight;
	}
	public double getIQ() {
		return IQ;
	}
}
class Bike{
	String name;
	int model;
	public Bike(String name, int model) {
		super();
		this.name = name;
		this.model = model;
	}
	public String getName() {
		return name;
	}
	public int getModel() {
		return model;
	}
}
class Mobile{
	String name;
	int ram;
	public Mobile(String name, int ram) {
		super();
		this.name = name;
		this.ram = ram;
	}
	public String getName() {
		return name;
	}
	public int getRam() {
		return ram;
	}
}
class Human{
	Heart heart = new Heart(200, 69);
	Brain brain = new Brain(150, 1000);
}
class Student extends Human{
	void hasBike(Bike b) {
		System.out.println(b.getName());
		System.out.println(b.getModel());
	}
	void hasMobile(Mobile m) {
		System.out.println(m.getName());
		System.out.println(m.getRam());
	}
}
public class HasARelationshipCode3 {
	public static void main(String[] args) {
		Student student = new Student();
		Bike b = new Bike("Yamaha", 3);
		Mobile m = new Mobile("Iphone", 16);
		System.out.println("Accesssing Composite object Brain from Student Class object");
		System.out.println("Brain Weight: " + student.brain.getbWeight());
		System.out.println("Brain IQ: " + student.brain.getIQ());
		System.out.println("===================================");
		System.out.println("Accesssing Composite object Heart from Student Class object");
		System.out.println("Heart Weight: " + student.heart.gethWeight());
		System.out.println("Heart Beat: " + student.heart.gethBeat());
		System.out.println("===================================");
		System.out.println("Accessing Aggregate Objects from Student Class Object");
		System.out.println("Bike Name & Model: ");
		student.hasBike(b);
		System.out.println("Mobile Name & RAM: ");
		student.hasMobile(m);
	}
}
