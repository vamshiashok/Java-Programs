package com.hasArealtionship;
class OS{
	double version;
	String name;
	public OS(double version, String name) {
		super();
		this.version = version;
		this.name = name;
	}
	public double getVersion() {
		return version;
	}
	public String getName() {
		return name;
	}
}
class Charger{
	String company;
	double volts;
	public Charger(String company, double volts) {
		super();
		this.company = company;
		this.volts = volts;
	}
	public String getCompany() {
		return company;
	}
	public double getVolts() {
		return volts;
	}
}
class Mobile{
	OS os = new OS(5.7, "Version-5");
	void hasCharger(Charger c) {
		System.out.println(c.getCompany());
		System.out.println(c.getVolts());
	}
}
public class HasARelationshipCode {
	public static void main(String[] args) {
		Mobile m = new Mobile();
		Charger c = new Charger("IQOO", 120);
		System.out.println(m.os.getName());//accessing the os name and version in the mobile class using m
		System.out.println(m.os.getVersion());
		System.out.println("------------------");
		m.hasCharger(c);//we can also get the charger company and volts in the Mobile class too
		System.out.println("-------------------");
		System.out.println("Without enclosing object");
		m=null;
		System.out.println(c.getCompany());// without enclosing object also we can access the aggregate objects
		System.out.println(c.getVolts());
//		System.out.println(m.os.getName());  here m is pointing to null so we can't get the name and version here
//		System.out.println(m.os.getVersion()); we can't access the composite objects because the enclosing object pointing to null
	}
}
