package inheritance;

import objects.Rectangle;

public class InheritanceChecker {

    public static void main(String[] args) {

        // Person person = new Person();
        // Employee employee = new Employee();

        Rectangle rectangle = new Rectangle();
        Square square = new Square();

        square.print();
        square.print("anything else");

    }

}
