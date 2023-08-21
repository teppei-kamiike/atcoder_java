package atcoder_java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long num = scanner.nextLong();
        scanner.close();

        List<Long> primeFactors = factorize(num);
        primeFactors.forEach(x -> System.out.print(x + " "));

    }

    /**
     * 素因数分解
     * 
     * @return 素因数のリスト
     */
    public static List<Long> factorize(long num) {
        List<Long> results = new ArrayList<>();
        double root = Math.sqrt(num);
        long tmp = num;

        for (long i = 2; i <= root; i++) {
            while (tmp % i == 0) {
                results.add(i);
                tmp = tmp / i;
            }
        }

        if (tmp >= 2) {
            results.add(tmp);
        }

        return results;
    }

}