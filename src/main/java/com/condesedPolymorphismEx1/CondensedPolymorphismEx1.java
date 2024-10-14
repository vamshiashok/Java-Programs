package com.condesedPolymorphismEx1;

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
class Airport{
	void permit(Plane ref) {
		ref.takeOff();
		ref.fly();
		ref.land();
	}
}
public class CondensedPolymorphismEx1 {
	public static void main(String[] args) {
		Airport a = new Airport();
		CargoPlane cp = new CargoPlane();
		a.permit(cp);
		cp.carryGoods();
		System.out.println("===================");
		PassengerPlane pp = new PassengerPlane();
		a.permit(pp);
		pp.carryHumans();
		System.out.println("====================");
		FighterPlane fp = new FighterPlane();
		a.permit(fp);
		fp.carryWeapons();
	}
}
