package OneToTwenty;

import java.util.Scanner;

public class Two {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a side of the square: ");
        int a = scanner.nextInt();
        int P = 4  * a;
        System.out.println("Perimeter: " +  P);
    }
}
