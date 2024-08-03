package OneToTwenty;

import java.util.Scanner;

public class Eight {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter four digits: ");
        int fourDigit = scanner.nextInt();

        int thousand = (fourDigit / 1000) % 10;
        int ten = (fourDigit / 10) % 10;

        System.out.println("result = " +thousand * ten);

        //Nine
        System.out.println(ten);
    }
}
