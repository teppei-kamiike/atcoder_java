import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] line1 = scanner.nextLine().split(" ");
        int n = Integer.parseInt(line1[0]);
        int d = Integer.parseInt(line1[1]);
        long p = Long.parseLong(line1[2]);
        String[] line2 = scanner.nextLine().split(" ");
        List<Long> fareList = Stream.of(line2).mapToLong(Long::parseLong).boxed().sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        long maxCost = fareList.stream().mapToLong(l -> l).sum();

        long currentMinCost = maxCost;

        int i = 0;
        while (i < n) {
            long tmpCost = 0;
            for (int j = i; j < i + d && j < n; j++) {
                tmpCost += fareList.get(j);
            }
            if (p < tmpCost) {
                currentMinCost -= tmpCost;
                currentMinCost += p;
            }
            i += d;
        }

        System.out.println(currentMinCost);

        scanner.close();
    }

}