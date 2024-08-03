import java.util.Scanner;

public class HundredAndEightyFive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        long sum = 1;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                sum *= i;
            }
        }

        System.out.println("Result: " + sum);
    }
}
