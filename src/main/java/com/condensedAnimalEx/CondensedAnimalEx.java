package com.condensedAnimalEx;
class Animal{
	void eat() {
		System.out.println("Animal can eat");
	}
	void sleep() {
		System.out.println("Animals can sleep");
	}
}
class Dog extends Animal{
	@Override
	void eat() {
		System.out.println("Dog is eating");
	}
	void bark() {
		System.out.println("Dog is barking");
	}
}
class Cat extends Animal{
	@Override
	void eat() {
		System.out.println("Cat is eating");
	}
	void sound() {
		System.out.println("Cat is meowing");
	}
}
class Forest{
	void Live(Animal ref) {// Parent type reference to the child type objects
		ref.eat();
		ref.sleep();
	}
}
public class CondensedAnimalEx {
	public static void main(String[] args) {
		Forest f = new Forest();
		Dog d12 = new Dog();
		f.Live(d12);//referencing the child class objects using parent class reference
		d12.bark();//calling the specialized methods using object
		System.out.println("===================");
		Cat c12 = new Cat();
		f.Live(c12);//referencing the child class objects using parent class reference
		c12.sound();//calling the specialized methods using object
	}
}
