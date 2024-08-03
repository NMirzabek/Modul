package OneToTwenty;

import java.util.Scanner;

public class Eighteen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter seconds: ");
        int n = scanner.nextInt();

        int hour = n / 3600;

        int remainingSeconds = n % 3600;

        int minutes = remainingSeconds / 60;

        System.out.println(hour + " hours " + minutes + " minutes");
    }
}
