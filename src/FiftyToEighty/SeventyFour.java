package FiftyToEighty;

import java.util.Scanner;

public class SeventyFour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;

        for (int i = 1; i <= 100; i+=2){
            if (i % 3 == 0 && i % 5 != 0 ) {
                sum += i;
            }
        }
        System.out.println("The sum of odd numbers between 1 and 100 that are divisible by 3 but not by 5 is: " + sum);
    }
}
