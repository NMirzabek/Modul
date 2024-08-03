package TwentyToForty;

import java.util.Scanner;

public class TwentyFive {
    public static void main(String[] args) {
        double fileSizeGB = 1.8;
        double speedKBps = 750;


        double fileSizeKB = fileSizeGB * 1024 * 1024;


        double timeInSeconds = fileSizeKB / speedKBps;
        System.out.println("Result: " + timeInSeconds);
    }
}
