package atcoder_java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            long num = scanner.nextLong();
            List<Long> divisors = findDivisors(num);
            for (Long e : divisors) {
                System.out.println(e);
            }
        }
        scanner.close();
    }

    /**
     * @param n 数値
     * @return 約数の一覧
     */
    public static List<Long> findDivisors(long n) {
        double rootFraction = Math.sqrt(n);

        List<Long> divisors = new ArrayList<>();
        for (int i = 1; i <= rootFraction; i++) {
            if (n % i == 0) {
                divisors.add(Long.valueOf(i));
                if (i != n / i) {
                    divisors.add(n / i);
                }
            }
        }

        return divisors;
    }
}
