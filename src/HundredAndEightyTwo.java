import java.util.Scanner;

public class HundredAndEightyTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a String: ");
        String str = scanner.nextLine();

        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isDigit(i)) {
                sum += c;
            }
        }
        System.out.println(sum);
        double result = Math.sqrt(sum);

        System.out.println("Result: " + result);
    }
}
