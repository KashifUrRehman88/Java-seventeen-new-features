package com.java17.example;

import java.util.Objects;

/**
 * 
 * @author Kashif Rehman
 * Created on 10th Of January,2023.
 * Purpose is to practice the record classes of java 17 *
 */


public class RecordClass {

	public static void main(String[] args) {

		Alien alien1 = new Alien(1, "Kashif");
		Alien alien2 = new Alien(1, "Kashif");
		Alien alien3 = new Alien();
		
		System.out.println(alien1); // Without ToString method, it will print hash code of object not the actual values
		System.out.println(alien1.equals(alien2)); //  Without out equals/hashCode methods, it will return false because it will compare address in memory, not the actual values
		System.out.println(alien3); 

	}

}


// This type of class in java we called Data Carrier class (it holds some data, used to carry data, not a functional class for any processing)
/* class Alien {
 
	private final int id; private final String name;
 
    public Alien(int id, String name) { this.id = id; this.name = name; }
 
    public int getId() { return id; }
 
    public String getName() { return name; }

	@Override
	public String toString() {
		return "Alien [id=" + id + ", name=" + name + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Alien other = (Alien) obj;
		return id == other.id && Objects.equals(name, other.name);
	}
}
*/  //these all lines i.e. from 29 till 60 can be replaced with record classes feature of java 17
record Alien(int id, String name) { // All variables here are private and final by default, and this class (record) cannot extend any other class, because it extends oracle class
	
	static int num; // record class can have static variable in body
	// int age; //  (instance variable can be declared above as id and name)
	public Alien() {
		this(0,"");
	}
}
