import java.util.Scanner;

// I read how to solve this problem.
// I couldn't answer myself.

public class Main {

    private static final int billAvalue = 10000;
    private static final int billBvalue = 5000;
    private static final int billCvalue = 1000;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] in = scanner.nextLine().split(" ");
        int n = Integer.parseInt(in[0]);
        int y = Integer.parseInt(in[1]);

        int billAnum = -1;
        int billBnum = -1;
        int billCnum = -1;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                if (n < i + j) {
                    break;
                }
                if (i * billAvalue + j * billBvalue + (n - i - j) * billCvalue == y) {
                    billAnum = i;
                    billBnum = j;
                    billCnum = n - i - j;
                    break;
                }
            }
        }

        System.out.println(billAnum + " " + billBnum + " " + billCnum);
        scanner.close();

    }

}