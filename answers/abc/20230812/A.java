package atcoder_java;

import java.util.Scanner;

public class Main {

    private static String PI_AFTER_DECIMAL = "1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int input = scanner.nextInt();
            System.out.println(toStringByLength(input));
        }
        scanner.close();
    }

    public static String toStringByLength(int digit) {
        // 小数点も文字列に含まれるが、桁数としてカウントしないため +1 をする。
        String s = PI_AFTER_DECIMAL.substring(0, digit);
        return s;
    }
}
