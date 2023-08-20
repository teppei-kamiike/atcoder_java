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
        long tmp = num;
        long primeFactorCurrentMax = 2;

        // 素数でない場合（まだ割り切れる）に実行
        while (!isPrimeNumber(tmp)) {
            for (long i = primeFactorCurrentMax; i <= num; i++) {
                if (2 != i && (i % 2) == 0)
                    continue; // 2以外の偶数はスキップ
                if (tmp % i == 0) {
                    results.add(i);
                    tmp = tmp / i;
                    primeFactorCurrentMax = i;
                    break;
                }
            }
        }
        // 最後の素因数
        results.add(tmp);

        return results;
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