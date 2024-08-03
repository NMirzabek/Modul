package HundredFiftyToHundredSeventy;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class HundredAndSeventyTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number: ");
        int a = scanner.nextInt();

        System.out.println("Enter number: ");
        int b = scanner.nextInt();

        System.out.println("Enter number: ");
        int c = scanner.nextInt();

        System.out.println("Enter number: ");
        int d = scanner.nextInt();

        Integer[] numbers = {a, b, c, d};


        Arrays.sort(numbers, Collections.reverseOrder());


        System.out.println("decrements of the numbers:");
        for (int num : numbers) {
            System.out.println(num);
        }
    }
}
