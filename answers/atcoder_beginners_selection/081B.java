import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();
        String[] listStr = scanner.nextLine().split(" ");
        List<Integer> list = Stream.of(listStr).mapToInt(Integer::parseInt).boxed().collect(Collectors.toList());
        int divideCount = 0;
        while (list.stream().allMatch(e -> e % 2 == 0)) {
            list = list.stream().map(e -> e / 2).collect(Collectors.toList());
            divideCount++;
        }
        System.out.println(divideCount);

        scanner.close();

    }

}