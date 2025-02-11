package com.nt.ston;

public class Printer {

	// 1- take private static reference variable of current class type
	private static Printer INSTANCE;

	// 2- take the constructor as private
	private Printer() {
		System.out.println("Printer :: 0 Param Constructor");
	}

	// 3- static factory method having singleton logic
	public static Printer getInstance() {
		if (INSTANCE == null)
			INSTANCE = new Printer();
		return INSTANCE;

	}

	public void printMessage(String msg) {
		System.out.println(msg);
	}
}
