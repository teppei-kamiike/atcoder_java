import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String[] listStr = scanner.nextLine().split(" ");
        List<Integer> cardPoints = Stream.of(listStr).mapToInt(Integer::parseInt).boxed()
                .sorted(Comparator.reverseOrder()).collect(Collectors.toList());

        int diff = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                diff += cardPoints.get(i);
            } else {
                diff -= cardPoints.get(i);
            }
        }
        System.out.println(diff);

        scanner.close();

    }

}