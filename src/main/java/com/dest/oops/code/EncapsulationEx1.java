package com.dest.oops.code;
class Dog1{
	private String name;
	private int age;
	private String color;
	private int cost;
	private String breed;

	//generic setter
	void setData(String a, int b, String c, int d, String e) {
		name = a;
		age = b;
		color = c;
		cost = d;
		breed = e;
	}

	//generic getter
	void getData() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(color);
		System.out.println(cost);
		System.out.println(breed);
	}
}
public class EncapsulationEx1 {
	public static void main(String[] args) {
		Dog1 d1 = new Dog1();
		d1.setData("Sunny", 3, "Brown", 5000, "Desi");
		d1.getData();
	}
}
