package com.oops.Abstract;
abstract class Plane{
	void takeOff() {
		System.out.println("Plane took off");
	}
	abstract void fly();
	void land() {
		System.out.println("Plane is landed");
	}
}
class CargoPlane extends Plane{
	@Override
	void fly() {
		System.out.println("Cargo Plane is flying");
	}
}
class PassengerPlane extends Plane{
	@Override
	void fly() {
		System.out.println("Passenger Plane is flying");
	}
}
class FighterPlane extends Plane{
	@Override
	void fly() {
		System.out.println("Fighter Plane is flying");
	}
}
class Airport{
	void permit(Plane ref) {
		ref.takeOff();
		ref.fly();
		ref.land();
	}
}
public class LaunchAbstractCode {
	public static void main(String[] args) {
		CargoPlane cp = new CargoPlane();
		PassengerPlane pp = new PassengerPlane();
		FighterPlane fp = new FighterPlane();
		Airport ap = new Airport();
		// Plane p = new Plane();  error cannot instantiate the type plane
		ap.permit(cp);
		System.out.println("===================");
		ap.permit(pp);
		System.out.println("===================");
		ap.permit(fp);
		System.out.println("===================");
	}
}
