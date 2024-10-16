package com.hasArelationshipEx2;
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
class Student{
	Heart h1 = new Heart(200, 69);
	Brain b1 = new Brain(150, 1000);
	void hasBike(Bike b) {
		System.out.println(b.getName());
		System.out.println(b.getModel());
	}
	void hasMobile(Mobile m) {
		System.out.println(m.getName());
		System.out.println(m.getRam());
	}
}
public class HasARelationshipCode2 {
	public static void main(String[] args) {
		Student s = new Student();
		Bike b = new Bike("Yamaha MT", 15);
		Mobile m = new Mobile("Realme", 12);
		System.out.println(s.b1.getbWeight());
		System.out.println(s.b1.getIQ());
		System.out.println(s.h1.gethWeight());
		System.out.println(s.h1.gethBeat());
		System.out.println("===================");
		s.hasBike(b);
		s.hasMobile(m);
		System.out.println("===================");
		System.out.println("Without enclosing object");
		s=null;
		System.out.println(b.getName());
		System.out.println(b.getModel());
		System.out.println(m.getName());
		System.out.println(m.getRam());
//		System.out.println(s.b1.getbWeight());
//		System.out.println(s.b1.getIQ());
//		System.out.println(s.h1.gethWeight());
//		System.out.println(s.h1.gethBeat());
	}
}
