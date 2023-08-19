package atcoder_java;

import java.util.Scanner;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int month = Integer.parseInt(scanner.nextLine());
        if (scanner.hasNext()) {
            String line = scanner.nextLine();
            String[] dayPerMonthStr = line.split(" ");
            int[] dayPerMonth = Stream.of(dayPerMonthStr).mapToInt(Integer::parseInt).toArray();
            int dayPerYear = sum(dayPerMonth);
            outputMiddleOfYear(dayPerMonth, dayPerYear);
        }
        scanner.close();
    }

    private static void outputMiddleOfYear(int[] dayPerMonth, int dayPerYear) {
        int middleDay = (dayPerYear + 1) / 2;
        int tmpSumDays = 0;
        for (int i = 0; i < dayPerMonth.length; i++) {
            if (tmpSumDays + dayPerMonth[i] < middleDay) {
                tmpSumDays += dayPerMonth[i];
            } else {
                int day = middleDay - tmpSumDays;
                System.out.println(i + 1 + " " + day);
                break;
            }
        }

    }

    private static int sum(int[] list) {
        int sum = 0;
        for (int i = 0; i < list.length; i++) {
            sum += list[i];
        }
        return sum;
    }

}