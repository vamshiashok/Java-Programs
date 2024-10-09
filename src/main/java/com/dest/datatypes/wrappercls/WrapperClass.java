package com.dest.datatypes.wrappercls;

public class WrapperClass {
	public static void main(String[] args) {
		Byte b = new Byte((byte)123);
		System.out.println(b);
		Short s = new Short((short)30000);
		System.out.println(s);
		Integer i = new Integer(46000);
		System.out.println(i);
		Long l = new Long(12345678);
		System.out.println(l);
		
		Float f = new Float(234.987f);
		System.out.println(f);
		Double d = new Double(98765.4321d);
		System.out.println(d);
		
		Character c = new Character('C');
		System.out.println(c);
		String str = new String("Krishna");
		System.out.println(str);
		Boolean b1 = new Boolean(true);
		System.out.println(b1);
	}
}
