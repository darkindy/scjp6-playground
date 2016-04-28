package com.accenture.andreipietrusel.scjp6playground.operators;

public class TrickyEquality {
	
	public static void main(String...args){
		Integer i1 = 1;
		Integer i2 = new Integer(1);
		int i3 = 1;
		Byte b1 = 1;
		Long g1 = 1L;
		
		System.out.println(i1 == i2); // false
		System.out.println(i1 == i3); // true
//		System.out.println(i1 == g1); // does not compile, different class hierarchies
	}

}