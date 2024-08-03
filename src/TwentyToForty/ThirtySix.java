package TwentyToForty;

import java.util.Scanner;

public class ThirtySix {
    public static void main(String[] a){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.println("Enter second number: ");
        int num2 = scanner.nextInt();

        System.out.println("Enter third number: ");
        int num3  = scanner.nextInt();

        if(num1 == num2 && num2 == num3) {
            System.out.println("=");
        } else {
            if (num1 != num2) {
                System.out.println(num1);
            }
            if (num2 != num3) {
                System.out.println(num2);
            }
            if (num1 != num3) {
                System.out.println(num3);
            }
        }
    }
}
