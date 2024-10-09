package com.dest.Basics.Variables;

class Dog{
	//Instance variables
	String name;
	String color;
	int age;
	int cost;
	//Create a method to allocate some data to the instance variables.
	void allocateData() {
		name = "Rocky";
		color = "Brown";
		age = 5;
		cost = 5000;
	}
	//create a method to display the allocated data in the console.
	void dislay() {
		System.out.println("Name of the Dog: " + name);
		System.out.println("Color of the Dog: " + color);
		System.out.println("Age of the Dog: " + age);
		System.out.println("Cost of the Dog: " + cost);
	}
}
public class InstanceVariables {
	//Main method
	public static void main(String[] args) {
		/* 1. Instance Variables are created inside the class.
		 * 2. It represents has part(properties).
		 * 3. Variables are present inside the Heap Memory.
		 * 4. Instance Variables will get the default values by JVM.
		 * 5. Can be accessible anywhere inside the class where it is created.
		 * 6. Can be accessible anywhere using object reference.
		 */
		Dog d = new Dog();// creating the object of the class Dog
		System.out.println("Default Values by JVM.");
		d.dislay();// printing the default values.
		System.out.println("---------------------------");
		System.out.println("Allocated Data to Variables");
		d.allocateData();// allocating the data to the instance variable by calling the method allocateData()
		d.dislay();// printing the allocated data.
		System.out.println("---------------------------");
		System.out.println("Changing the Allocated values using Object reference.");
		//change the allocated values using the object reference
		d.name = "Sunny";
		d.color = "White";
		d.age = 10;
		d.cost = 10000;
		d.dislay();// printing the above changed data.
	}
}
