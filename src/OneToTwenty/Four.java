package OneToTwenty;

import java.util.Scanner;

public class Four {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a side of the cube: ");
        int a = scanner.nextInt();

        int volume = a * a * a;

        int S = 6 * a * a;

        System.out.println(volume);
        System.out.println(S);
    }
}
