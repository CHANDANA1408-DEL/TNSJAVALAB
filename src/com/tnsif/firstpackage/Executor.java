package com.tnsif.firstpackage;

public class Executor {

	public static void main(String[] args) {
		Person p1=new Person(null, 0, null);
		p1.setPersonName("chandana");
		
		p1.display();
		
		System.out.println(p1.getPersonName());
		
		Person p2=new Person(null, 0, null);
		p2.display();
		
		Person p3=new Person(null, 0, null);
		p3.display();

	}

}
