package OneToTwenty;

import java.util.Scanner;

public class Seventeen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a capacity of the file in Bite: ");
        long fileSizeInBytes = scanner.nextLong();

        long fileSizeInKilobytes = fileSizeInBytes / 1024;

        System.out.println("Result: " + fileSizeInKilobytes);
    }
}
