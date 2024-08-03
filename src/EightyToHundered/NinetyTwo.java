package EightyToHundered;

import java.util.Scanner;

public class NinetyTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int a = scanner.nextInt();

        System.out.println("Enter another number: ");
        int b = scanner.nextInt();

        if (a > b) {
            System.out.println("First number must be greater than second number!");
            return;
        }

        for (int i = a + 1; i < b; i++){
            for (int j = 0; j < i; j++) {
                System.out.println(i +  " ");
            }
        }


    }
}
