package OneToTwenty;

import java.util.Scanner;

public class Five {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter A value: ");
        int A = scanner.nextInt();

        System.out.println("Enter B value: ");
        int B = scanner.nextInt();

        System.out.println("Enter C value: ");
        int C = scanner.nextInt();
        System.out.println("Old values");
        System.out.println(A);
        System.out.println(B);
        System.out.println(C);

        int temp = A ;

        A = B ;

        B = C;

        C = temp;

        System.out.println("New values");
        System.out.println(A);
        System.out.println(B);
        System.out.println(C);
    }
}
