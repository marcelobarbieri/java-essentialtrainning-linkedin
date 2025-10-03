package gross_calculator;

import java.util.Scanner;

public class GrossPayCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // 1. get the number of hours worked

        int hours = 0;

        System.out.println("How many hours did you work?");
        hours = scanner.nextInt();

        // 2. get the hourly pay rate

        double payRate = 0;

        System.out.println("What is your pay rate?");
        payRate = scanner.nextDouble();

        scanner.close();

        // 3. multiply hours and pay rate

        double grossPay = hours * payRate;

        // 4. display result

        System.out.println("Gross pay: " + grossPay);

    }

}
