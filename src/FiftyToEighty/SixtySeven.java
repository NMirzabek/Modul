package FiftyToEighty;

import java.util.Scanner;

public class SixtySeven {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a month (1-12): ");
        int month = scanner.nextInt();

        int numberOfDays;

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                numberOfDays = 31;
                break;

            case 4:
            case 6:
            case 9:
            case 11:
                numberOfDays = 30;
                break;

            case 2:
                numberOfDays = 28;
                break;

            default:
                numberOfDays = -1;
        }
        System.out.println(numberOfDays);
    }
}
