package com.dest.strings.examples;

public class StringClassesEx {
	public static void main(String[] args) {
		String s1 = new String("Dasari");
		String s2 = new String("Vamshi");
		s1.concat(s2);
		System.out.println(s1);//direct changes are not reflected
		s1 = s1.concat(s2);
		System.out.println(s1);//external push gets them merged
		
		//StringBuffer class
		StringBuffer sb1 = new StringBuffer("Ashok");
		StringBuffer sb2 = new StringBuffer("Kumar");
		sb1.append(sb2);
		System.out.println(sb1);
		
		//StringBuilder class
		StringBuilder sbl1 = new StringBuilder("Krishna");
		StringBuilder sbl2 = new StringBuilder("Radha");
		sbl1.append(sbl2);
		System.out.println(sbl1);
	}
}
