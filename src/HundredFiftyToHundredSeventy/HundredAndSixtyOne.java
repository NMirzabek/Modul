package HundredFiftyToHundredSeventy;

import java.util.Scanner;

public class HundredAndSixtyOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a first site: ");
        double a = scanner.nextDouble();

        System.out.println("Enter a second site: ");
        double b = scanner.nextDouble();

        double c = Math.sqrt((a * a) + (b * b));

        double area = 0.5 * a * b;

        double perimeter = a + b + c;

        System.out.println("Hypotenuse: " + c);
        System.out.println("Surface: " + area);
        System.out.println("Perimeter: " + perimeter);
    }
}
