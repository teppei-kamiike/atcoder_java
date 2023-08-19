package atcoder_java;

import java.util.Scanner;

// 1h45m 時点で完成（Time is up）
// 可読性がかなり低いコードとなった

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int i = 0;
        int[][] list = new int[n][2];
        for (int j = 0; j < n; j++) {
            String[] s = scanner.nextLine().split(" ");
            list[i][0] = Integer.parseInt(s[0]);
            list[i][1] = Integer.parseInt(s[1]);
            i++;
        }
        scanner.close();

        int maxTaste = list[0][1];
        int maxTasteIceNum = list[0][0];
        int index = 0;
        for (int j = 1; j < n; j++) {
            if (maxTaste < list[j][1]) {
                maxTaste = list[j][1];
                maxTasteIceNum = list[j][0];
                index = j;
            }
        }

        int totalMaxtaste = maxTaste;
        for (int j = 0; j < n; j++) {
            if (index == j)
                continue;
            if (maxTasteIceNum == list[j][0]) {
                if (maxTaste < list[j][1]) {
                    if (totalMaxtaste < (maxTaste / 2) + list[j][1]) {
                        totalMaxtaste = maxTaste / 2 + list[j][1];
                    }

                } else {
                    if (totalMaxtaste < maxTaste + (list[j][1] / 2)) {
                        totalMaxtaste = maxTaste + (list[j][1] / 2);
                    }
                }
            } else {
                if (totalMaxtaste < maxTaste + list[j][1]) {
                    totalMaxtaste = maxTaste + list[j][1];
                }
            }
        }

        System.out.println(totalMaxtaste);
    }

}
