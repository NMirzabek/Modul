import java.util.Scanner;

public class HundredAndSeventyThree {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double number = scanner.nextInt();



        double fourthRoot = Math.pow(number, 1.0 / 4.0);

        double fifthRoot = Math.pow(number, 1.0 / 5.0);

        System.out.println("Fourth root of the number: " + fourthRoot);
        System.out.println("Fifth root of the number: " + fifthRoot);


    }
}
