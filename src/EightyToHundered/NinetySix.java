package EightyToHundered;

import java.util.Scanner;

public class NinetySix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;



        while (true){
            System.out.println("Enter a number: ");
            int number = scanner.nextInt();

            if (number < 0) {
                break;
            }


            if (number % 5 == 0) {
                count++;
            }
        }
        System.out.println("5 ga karrali bo'lgan sonlar soni: " + count);

    }
}
