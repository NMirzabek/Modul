package EightyToHundered;

import java.util.Scanner;

public class EightySeven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter price of the candle: ");
        int price = scanner.nextInt();

        for (double kg = 1.1; kg < 2.0; kg+=0.1) {
            double totalPrice = kg *price;
            System.out.printf("%.1f kg: %.2f\n", kg, totalPrice);
        }
    }
}
