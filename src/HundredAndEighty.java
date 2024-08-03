import java.util.Scanner;

public class HundredAndEighty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = scanner.nextInt();

        double square = Math.pow(num, 2);
        double cube = Math.pow(num, 3);

        System.out.println("Square of the number: " + square);
        System.out.println("Cube of the number: " + cube);
    }
}
