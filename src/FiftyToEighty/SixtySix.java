package FiftyToEighty;

import java.util.Scanner;

public class SixtySix {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number between 1-7: ");
        int weeks = scanner.nextInt();

        String day = "";

        switch (weeks) {
            case 1:
                day = "Monday";
                break;

            case 2:
                day = "Tuesday";
                break;

            case 3:
                day = "Wednesday";
                break;

            case 4:
                day = "Thursday";
                break;

            case 5:
                day = "Friday";
                break;

            case 6:
                day = "Sunday";
                break;

            case 7:
                day = "Saturday";
                break;

            default:
                System.out.println("Invalid number!");
        }
        System.out.println(day);
    }
}
