package com.dest.oops.code;
class Dog3{
	private String name;
	private int age;
	private int cost;
	private String color;
	private String breed;
	
	//generic setter 
	void setData(String name, int age, int cost, String color, String breed) {
		name = name;
		age = age;
		cost = cost;
		color = color;
		breed = breed;
	}
	//specific setter 
	void setName(String name) {
		name = name;
	}
	void setAge(int age) {
		age = age;
	}
	void setCost(int cost) {
		cost = cost;
	}
	void setColor(String color) {
		color = color;
	}
	void setBreed(String breed) {
		breed = breed;
	}
	//generic getter
	void getData() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(cost);
		System.out.println(color);
		System.out.println(breed);
	}
	//specific getter
	String getName() {
		return name;
	}
	int getAge() {
		return age;
	}
	int getCost() {
		return cost;
	}
	String getColor() {
		return color;
	}
	String getBreed() {
		return breed;
	}
}
public class Launch1 {
	public static void main(String[] args) {
		Dog3 d = new Dog3();
		d.setData("Leo", 3, 6000, "Brown", "German Shepherd");
		d.getData();
		System.out.println("-----------------------------------");
		Dog3 d1 = new Dog3();
		d1.setName("Buddy");
		d1.setAge(7);
		d1.setCost(9000);
		d1.setColor("White");
		d1.setBreed("Desi");
		System.out.println(d1.getName());
		System.out.println(d1.getAge());
		System.out.println(d1.getCost());
		System.out.println(d1.getColor());
		System.out.println(d1.getBreed());
	}
}
