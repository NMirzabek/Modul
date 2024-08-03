import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class HundredAndSeventyNine {
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


        java.util.Arrays.sort(numbers);


        System.out.println("increments of the numbers:");
        for (int num : numbers) {
            System.out.println(num);
        }
    }
}
