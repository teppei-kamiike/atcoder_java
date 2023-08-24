import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Integer[] list = new Integer[n];

        for (int i = 0; i < list.length; i++) {
            list[i] = Integer.parseInt(scanner.nextLine());
        }

        list = Stream.of(list).sorted(Comparator.reverseOrder()).toArray(Integer[]::new);

        int counter = 1;
        int topDiameter = list[0];
        for (int i = 1; i < n; i++) {
            if (topDiameter != list[i]) {
                counter++;
                topDiameter = list[i];
            }
        }
        System.out.println(counter);

        scanner.close();

    }

}