package com.dest.oops.code;
// this refers the instance variables in the class
class Dog4{
	private String name;
	private String color;
	private int age;
	private int cost;
	private String breed;
	
	//generic setter
	void setData(String name, String color, int age, int cost, String breed) {
		this.name = name; //this.name instance variable, name local variable - Doubt cleared by Sathya
		this.color = color;
		this.age = age;
		this.cost = cost;
		this.breed = breed;
	}
	//specific setter 
	void setName(String name) {
		this.name = name;
	}
	void setColor(String color) {
		this.color = color;
	}
	void setAge(int age) {
		this.age = age;
	}
	void setCost(int cost) {
		this.cost = cost;
	}
	void setBreed(String breed) {
		this.breed = breed;
	}
	//generic getter
	void getData() {
		System.out.println(name);
		System.out.println(color);
		System.out.println(age);
		System.out.println(cost);
		System.out.println(breed);
	}
	//specific getter
	String getName() {
		return name;
	}
	String getColor() {
		return color;
	}
	int getAge() {
		return age;
	}
	int getCost() {
		return cost;
	}
	String getBreed() {
		return breed;
	}
}
public class Launch2 {
	public static void main(String[] args) {
		Dog4 d1 = new Dog4();
		d1.setData("Sunny", "White", 6, 5000, "GR");
		d1.getData();
		System.out.println("-------------------------");
		Dog4 d2 = new Dog4();
		d2.setName("Rocky");
		d2.setColor("Black");
		d2.setAge(8);
		d2.setCost(10000);
		d2.setBreed("Pet Bull");
		System.out.println(d2.getName());
		System.out.println(d2.getColor());
		System.out.println(d2.getAge());
		System.out.println(d2.getCost());
		System.out.println(d2.getBreed());
	}
}
