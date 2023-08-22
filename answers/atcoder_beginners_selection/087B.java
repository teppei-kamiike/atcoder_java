import java.util.Scanner;

public class Main {

    private static final int COIN500 = 500;
    private static final int COIN100 = 100;
    private static final int COIN50 = 50;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int coin500Num = Integer.parseInt(scanner.nextLine());
        int coin100Num = Integer.parseInt(scanner.nextLine());
        int coin50Num = Integer.parseInt(scanner.nextLine());
        int targetValue = Integer.parseInt(scanner.nextLine());

        int counter = 0;
        for (int i = 0; i <= coin500Num; i++) {
            for (int j = 0; j <= coin100Num; j++) {
                for (int k = 0; k <= coin50Num; k++) {
                    if (i * COIN500 + j * COIN100 + k * COIN50 == targetValue) {
                        counter++;
                    }
                }
            }
        }

        System.out.println(counter);

        scanner.close();

    }

}