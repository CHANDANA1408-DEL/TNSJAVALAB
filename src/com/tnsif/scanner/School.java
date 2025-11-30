package com.tnsif.scanner;

public class School {
private static int a;
private int b;

public static void m1() {
	//non static members cant be accesed in static method
	System.out.println(a);
}
public void m2() {
	System.out.println(b);
	System.out.println(a);
	m1();	
}
static {
	System.out.println("HI,welcome to static method and variable demo");
	
}
public static void main(String[] args) {
	m1();
	//m2();
	
}

}
