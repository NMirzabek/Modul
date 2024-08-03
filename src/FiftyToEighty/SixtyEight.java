package FiftyToEighty;

import java.util.Scanner;

public class SixtyEight {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter year old: ");
        int young = scanner.nextInt();

        if (young < 20 || young > 69) {
            System.out.println("Something is wrong!");
        } else {
            String result = "";


            String[] onliklar = {"", "", "yigirma", "o'ttiz", "qirq", "ellik", "oltmish"};
            String[] birliklar = {"", "bir", "ikki", "uch", "to'rt", "besh", "olti", "yetti", "sakkiz", "to'qqiz"};

            int onlik = young / 10;
            int birlik = young % 10;

            if (onlik > 1) {
                result += onliklar[onlik];
                if (birlik > 0) {
                    result += " " + birliklar[birlik];
                }
            }

            System.out.println(result + " yosh");
        }
    }
}
