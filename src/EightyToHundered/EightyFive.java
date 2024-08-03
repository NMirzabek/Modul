package EightyToHundered;

import java.util.Scanner;

public class EightyFive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int counter = 0;
        for (int i = 100; i <= 999; i++){
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i + " ");
                counter++;
            }
        }
        System.out.println("There are these numbers to divide to 3 and 5: " + counter);
    }
}
