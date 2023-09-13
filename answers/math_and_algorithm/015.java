
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] line1 = scanner.nextLine().split(" ");
        int a = Integer.parseInt(line1[0]);
        int b = Integer.parseInt(line1[1]);

        System.out.println(findGratestCommonDivisor(a, b));

        scanner.close();
    }

    public static int findGratestCommonDivisor(int a, int b) {
        // ユークリッド互助法
        if (a == 0)
            return b;
        if (b == 0)
            return a;
        if (a < b) {
            return findGratestCommonDivisor(a, b % a);
        } else {
            return findGratestCommonDivisor(b, a % b);
        }
    }

}