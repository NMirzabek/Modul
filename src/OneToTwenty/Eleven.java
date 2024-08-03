package OneToTwenty;

import java.util.Scanner;

public class Eleven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter centimetre: ");
        double c = scanner.nextDouble();

        double m = c / 100;

        System.out.println("Metre: " + m);
        scanner.close();
    }
}
