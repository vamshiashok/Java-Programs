package com.dest.oops.code;
class Dog2{
	private String name;
	private int age;
	private String color;
	private int cost;
	private String breed;

	//specific setter
	void setName(String a) {
		name = a;
	}
	void setAge(int b) {
		age = b;
	}
	void setColor(String c) {
		color = c;
	}
	void setCost(int d) {
		cost = d;
	}
	void setBreed(String e) {
		breed = e;
	}

	//specific getter
	String getName() {
		return name;
	}
	int getAge() {
		return age;
	}
	String getColor() {
		return color;
	}
	int getCost() {
		return cost;
	}
	String getBreed() {
		return breed;
	}
}
public class EncapsulationEx2 {
	public static void main(String[] args) {
		Dog2 d2 = new Dog2();
		d2.setName("Tillu");
		d2.setAge(10);
		d2.setColor("White");
		d2.setCost(8000);
		d2.setBreed("Pet Bull");
		System.out.println(d2.getName());
		System.out.println(d2.getAge());
		System.out.println(d2.getColor());
		System.out.println(d2.getCost());
		System.out.println(d2.getBreed());
	}
}
