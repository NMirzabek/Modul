package TwentyToForty;

import java.util.Scanner;

public class TwentyThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a km between two regions: ");
        double s = scanner.nextDouble();

        double speed = 7;

        double time = s / speed;

        System.out.println("Man is the distance between these cities " + time + " passes in an hour.");
    }
}
