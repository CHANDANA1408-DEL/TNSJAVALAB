package com.tnsif.Inheritence;

public class Dog extends Mammal{
	void bark() {
		System.out.println("Dog is barking");
	}
	public static void main(String args[]) {
		Dog d=new Dog();//creating object for dog
		d.eat();
		d.bark();
		d.walk();
		
	}

}
