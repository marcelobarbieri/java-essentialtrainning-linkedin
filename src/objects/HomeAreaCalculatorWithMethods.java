package objects;

import java.util.Scanner;

public class HomeAreaCalculatorWithMethods {

    static Scanner scanner;

    public static void main(String[] args) {

        /*
        Rectangle kitchen = new Rectangle(200,400);
        Rectangle bathroom = new Rectangle(300,700);
        */

        scanner = new Scanner(System.in);

        Rectangle kitchen = getRoom();
        Rectangle bathroom = getRoom();

        scanner.close();

        double area = calculateTotalArea(kitchen,bathroom);
        System.out.println("The total area is: " + area);
    }

    public static double calculateTotalArea(Rectangle rectangle1, Rectangle rectangle2) {
        return rectangle1.calculateArea() + rectangle2.calculateArea();
    }

    public static Rectangle getRoom() {

        System.out.println("Enter the length of your room:");
        double length = scanner.nextDouble();

        System.out.println("Enter the width of your room");
        double width = scanner.nextDouble();

        return new Rectangle(length, width);
    }
}
