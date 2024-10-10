package com.dest.oops.code;
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
public class Overriding {
	public static void main(String[] args) {
		CargoPlane cp = new CargoPlane();
		cp.takeOff();
		cp.fly();
		cp.carryGoods();
		System.out.println("============================");
		PassengerPlane pp = new PassengerPlane();
		pp.takeOff();
		pp.fly();
		pp.carryHumans();
		System.out.println("============================");
		FighterPlane fp = new FighterPlane();
		fp.takeOff();
		fp.fly();
		fp.carryWeapons();
	}
}
