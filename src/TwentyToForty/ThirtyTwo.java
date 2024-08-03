package TwentyToForty;

import java.util.Scanner;

public class ThirtyTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter four digit number: ");
            int [] number = new int[]{scanner.nextInt()};
            boolean containsThree;

            for (int i = 0; i < number.length; i++) {
                if (number[i] == 3){
                    System.out.println(containsThree = true);
                } else {
                    System.out.println(containsThree = false);
                }
            }

        }
    }
}
