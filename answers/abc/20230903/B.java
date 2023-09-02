import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] line1 = scanner.nextLine().split(" ");
        int n = Integer.parseInt(line1[0]);
        boolean[][] painted = new boolean[101][101];

        for (int i = 0; i < n; i++) {
            String[] line = scanner.nextLine().split(" ");
            int a1 = Integer.parseInt(line[0]);
            int a2 = Integer.parseInt(line[1]);
            int b1 = Integer.parseInt(line[2]);
            int b2 = Integer.parseInt(line[3]);
            for (int j = a1 + 1; j <= a2; j++) {
                for (int k = b1 + 1; k <= b2; k++) {
                    painted[j][k] = true;
                }
            }
        }

        int squareCount = 0;
        for (int i = 0; i < 101; i++) {
            for (int j = 0; j < 101; j++) {
                if (painted[i][j]) {
                    squareCount++;
                }
            }
        }

        System.out.println(squareCount);

        scanner.close();
    }

}