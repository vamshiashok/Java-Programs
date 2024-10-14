package com.polymorphismEx1;


class Plane{
	void takeOff() {
		System.out.println("Plane is taking off");
	}
	void fly() {
		System.out.println("Plane is flying");
	}
	void land() {
		System.out.println("Plane is landing");
	}
}
class CargoPlane extends Plane{
	@Override
	void fly() {
		System.out.println("Cargo Plane is flying");
	}
	void carryGoods() {
		System.out.println("Cargo Plane carry Goods");
	}
}
class PassengerPlane extends Plane{
	@Override
	void fly() {
		System.out.println("Passenger Plane is flying");
	}
	void carryHumans() {
		System.out.println("Passenger Plane carry Humans");
	}
}
class FighterPlane extends Plane{
	@Override
	void fly() {
		System.out.println("Fighter Plane is flying");
	}
	void carryWeapons() {
		System.out.println("Fighter Plane carry Human");
	}
}
public class PolymorphismEx1 {
	public static void main(String[] args) {
		Plane ref;
		CargoPlane cp = new CargoPlane();
		ref = cp;
		ref.takeOff();
		ref.fly();
		ref.land();
		cp.carryGoods();
		PassengerPlane pp = new PassengerPlane();
		ref = pp;
		ref.takeOff();
		ref.fly();
		ref.land();
		pp.carryHumans();
		FighterPlane fp = new FighterPlane();
		ref = fp;
		ref.takeOff();
		ref.fly();
		ref.land();
		fp.carryWeapons();
	}
}
