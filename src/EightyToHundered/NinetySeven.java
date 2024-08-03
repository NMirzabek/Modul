package EightyToHundered;

import java.util.Scanner;

public class NinetySeven {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n = scanner.nextInt();

        int sum = 0;
        int counter = 0;

        for (int i = 0; i <= n; i++){
            sum += i;
            counter++;
        }

        System.out.println("Value: " + sum + " entered numbers: " + counter);
    }
}
