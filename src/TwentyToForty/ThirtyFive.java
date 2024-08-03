package TwentyToForty;

import java.util.Scanner;

public class ThirtyFive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter score you got from exam: ");
        int score = scanner.nextInt();

        String grade = "";
        if (score >= 0 && score <= 54) {
            grade = "2 grade";
        } else if (score >= 55 && score <= 70){
            grade = "3 grade";
        } else if (score >= 71 && score <= 84) {
            grade = "4 grade";
        } else if (score >= 85 && score <= 100) {
            grade = "5 grade";
        } else {
            System.out.println("Invalid score");
        }

        System.out.println(grade);
    }
}
