import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a number: ");
            int a = scanner.nextInt();
            System.out.println("Enter a number: ");
            int b = scanner.nextInt();
            System.out.println("Enter a number: ");
            int c = scanner.nextInt();

            System.out.println("a + b + c = " + (a + b + c) / 3);
        }
    }
}