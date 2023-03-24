package com.java17.example;

public class SwitchStatement{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final String b = "B";
		switch (args[0]) {
		case "A" -> System.out.println("Parameter is A");
		case b -> System.out.println("Parameter is B");
		default -> System.out.println("Parameter is unknown");
		}

	}

}
