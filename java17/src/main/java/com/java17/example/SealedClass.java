package com.java17.example;


/**
 * 
 * @author Kashif Rehman
 * Created on 10th Of January,2023.
 *
 * Abstract Class :- is meant to be inherited
 * Final Class :- no class can inherit it
 * Sealed Class : -in between of Abstract and final class
 * 		You want to have inheritance, but not every classes can do it, there should be a limited class which you want to be inherited, 
 * 		we can do this type of restriction by using sealed classes (inherited classes mush use one of the three keywords i.e. final, sealed or non-sealed)
 * 
 * Use Case :- Computer class, you want to only Laptop, Desktop and mobile should only be allowed to inherit Computer class
 */

// sealed keyword with classes
sealed class A permits B,C {
	
}
non-sealed class B extends A { // non-sealed means that any one can extend me (like if D wants to use B)
	
}
final class C extends A {
	
}
class D {
	
}

// sealed keyword with interfaces
/*
 * sealed interface X permits Y {
 * 
 * } sealed interface Y extends X { // final cannot be used with interfaces as
 * we all know, so here for interfaces only two keywords sealed or non-selaed
 * 
 * }
 */

public class SealedClass {

	public static void main(String[] args) {
		

	}

}
