package atcoder_java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String s = scanner.next();
            System.out.println(cutVowel(s));
        }
        scanner.close();
    }

    public static String cutVowel(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!isVowel(c)) {
                sb.append(c);
            }
        }

        return sb.toString();
    }

    public static boolean isVowel(char c) {
        if (c == 'a' || c == 'i' || c == 'u' || c == 'e' || c == 'o')
            return true;
        return false;
    }
}
