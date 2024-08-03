package HundredAndThirty;

import java.util.Scanner;

public class HundredAndTwelve {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 1;

        while (i <= 9) {
            int j = 1;

            System.out.println(i);
            while (j <= 9) {
                System.out.println(i + " x " + j + " = " + (i * j));
                j++;
            }
            System.out.println();
            i+=2;
        }
    }
}
