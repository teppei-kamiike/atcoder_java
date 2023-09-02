import java.util.Scanner;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] line1 = scanner.nextLine().split(" ");
        String[] line2 = scanner.nextLine().split(" ");

        int n = Integer.parseInt(line1[0]);
        int h = Integer.parseInt(line1[1]);
        int x = Integer.parseInt(line1[2]);

        int[] array = Stream.of(line2).mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i < n; i++) {
            if (h + array[i] >= x) {
                System.out.println(i + 1);
                break;
            }
        }

        scanner.close();

    }

}