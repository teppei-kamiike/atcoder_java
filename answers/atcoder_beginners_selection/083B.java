import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] in = scanner.nextLine().split(" ");
        int n = Integer.parseInt(in[0]);
        int a = Integer.parseInt(in[1]);
        int b = Integer.parseInt(in[2]);

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            int remainder = i;
            int digitSum = 0;
            while (10 <= remainder) {
                digitSum += remainder % 10;
                remainder = remainder / 10;
            }
            digitSum += remainder;
            if (a <= digitSum && digitSum <= b) {
                sum += i;
            }
        }
        System.out.println(sum);

        scanner.close();

    }

}