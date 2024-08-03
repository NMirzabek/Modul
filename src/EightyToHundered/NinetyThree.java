package EightyToHundered;

import java.util.Scanner;

public class NinetyThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = scanner.nextInt();

        for (int i = a; i > 0; i--){
            System.out.print(i + " ");
        }
    }
}
