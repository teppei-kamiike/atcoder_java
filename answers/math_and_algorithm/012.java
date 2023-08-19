package atcoder_java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            long num = scanner.nextLong();
            if (isPrimeNumber(num)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
        scanner.close();
    }

    /**
     * 素数判定
     */
    private static boolean isPrimeNumber(long num) {
        double rootFraction = Math.sqrt(num);
        long root = (long) Math.floor(rootFraction);
        for (int i = 2; i <= root; i++) {
            if (num % i == 0)
                return false;
        }

        return true;
    }

}

