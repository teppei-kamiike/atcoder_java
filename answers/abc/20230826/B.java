import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String[] line2 = scanner.nextLine().split(" ");
        int[] array = Stream.of(line2).mapToInt(Integer::parseInt).toArray();

        boolean[] flags = new boolean[1000 + 1];
        for (int i = 0; i < n; i++) {
            flags[array[i]] = true;
        }

        int min = Arrays.stream(array).min().getAsInt();
        for (int i = min; i <= 1000; i++) {
            if (!flags[i]) {
                System.out.println(i);
                break;
            }
        }

        scanner.close();

    }

}