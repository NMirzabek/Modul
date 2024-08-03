package TwentyToForty;

import java.util.Scanner;

public class TwentySix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter seconds: ");
        int seconds = scanner.nextInt();

        double hours = seconds / 3600.0;

        System.out.println("Given seconds " + hours + " is equals to this hour");
    }
}
