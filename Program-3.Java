import java.util.Scanner;

public class OddSeriesPattern {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        int a = sc.nextInt();

        int limit;

        // Decide how many odd numbers to print
        if (a % 2 == 0) {
            limit = a - 1;
        } else {
            limit = a;
        }

        for (int i = 1; i <= limit; i++) {
            System.out.print((2 * i - 1));
            if (i < limit) {
                System.out.print(", ");
            }
        }
    }
}
