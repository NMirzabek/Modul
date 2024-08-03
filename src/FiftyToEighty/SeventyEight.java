package FiftyToEighty;

import java.util.Scanner;

public class SeventyEight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = scanner.nextInt();

        System.out.println("Enter b number: ");
        int b = scanner.nextInt();

        if (a >= b){
            System.out.println("Error, B should be greater than A");
            return;
        }
        int counter = 0;
        for (int i = a; i <= b; i ++){
            System.out.print(i + " ");
            counter++;
        }

        System.out.println();
        System.out.println("The total number printed: " + counter);
    }
}
