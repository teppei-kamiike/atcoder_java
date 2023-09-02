import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] line1 = scanner.nextLine().split(" ");
        int n = Integer.parseInt(line1[0]);
        int m = Integer.parseInt(line1[1]);
        int p = Integer.parseInt(line1[2]);

        int count = 0;
        for (int i = m; i <= n; i += p) {
            count++;
        }
        System.out.println(count);

        scanner.close();
    }

}