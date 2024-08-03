package HundredFiftyToHundredSeventy;

import java.util.Scanner;

public class HundredAndFiftyFive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter a year: ");
        int year = scanner.nextInt();

        boolean isLeapYear = isLeapYear(year);

        System.out.println(isLeapYear);
    }
    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;
                } else {
                    return false;
                }
            }  else {
                return false;
            }
        } else {
            return false;
        }
    }
}
