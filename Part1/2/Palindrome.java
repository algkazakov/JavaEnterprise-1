package homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println("Введите строку:");
        String line = null;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            line = bufferedReader.readLine();
        } catch (IOException ioException) {
            System.out.println(ioException.getMessage());
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException ioException) {
                System.out.println(ioException.getMessage());
            }
        }

        if (line == null) {
            return;
        }

        if (isPalindromeMoreEfficient(improveString(line))) {
            System.out.println("Является палиндромом");
        } else {
            System.out.println("Не палиндром");
        }
    }

    public static String improveString(String string) {
        return string.replaceAll("[^A-Za-zА-Яа-я]", "").toLowerCase();
    }

    public static boolean isPalindrome(String string) {
        return string.equals(new StringBuilder(string).reverse().toString());
    }

    public static boolean isPalindromeMoreEfficient(String string) {
        int length = string.length();
        for (int i = 0; i < length / 2; i++) {
            if (string.charAt(i) != string.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
