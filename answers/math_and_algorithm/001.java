import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int input = scanner.nextInt();
            System.out.println(plus5(input));
        }
        scanner.close();
    }

    public static int plus5(int i) {
        return i + 5;
    }
}
