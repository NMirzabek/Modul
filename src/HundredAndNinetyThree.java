import java.util.Scanner;

public class HundredAndNinetyThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int N = scanner.nextInt();

        System.out.println("Enter a word: " );
        char ch = scanner.next().charAt(0);

        String result = createString(N,ch);

        System.out.println("Result: " + result);

    }
    public static String createString(int N, char ch) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < N; i++) {
            result.append(ch);
        }
        return result.toString();
    }
}
