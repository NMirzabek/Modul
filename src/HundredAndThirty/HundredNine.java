package HundredAndThirty;

import java.util.Scanner;

public class HundredNine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int N = scanner.nextInt();

        if (Complex(N)) {
            System.out.println(N + " Number is complex");
        } else {
            System.out.println(N + " Number is not complex");
        }


    }

    public static boolean Complex(int number) {

        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0){
                return true;
            }
        }
        return false;
    }
}
