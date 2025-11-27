package com.tnsif.inheritance.hierarchical;

public class HierarchicalDemo {
	public static void main(String[] args) {

        ChildA objA = new ChildA();
        objA.showname();
        objA.featurea();

        System.out.println("----------------");

        ChildB objB = new ChildB();
        objB.showname();
        objB.featureB();
    }

}
