package HundredAndThirty;

import java.util.Scanner;

public class HundredAndTen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i = 2;

        while (i <= 9) {
            int j = 1;

            System.out.println(i);
            while (j <= 9) {
                System.out.println(i + " x " + j + " = " + (i * j));
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
