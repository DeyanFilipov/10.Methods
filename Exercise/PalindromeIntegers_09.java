package Methods.Exercise;

import java.util.Scanner;

public class PalindromeIntegers_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while (!input.equals("END")) {
            int num = Integer.parseInt(input);
            boolean palindromeChecker = palindromeResult(num);
            if (palindromeChecker) {
                System.out.println(palindromeChecker);
            } else {
                System.out.println(palindromeChecker);
            }
            input = scanner.nextLine();
        }
    }
    public static boolean palindromeResult(int number) {
        String unReversedNumber = String.valueOf(number);
        String reversedNumber = "";
        while (number != 0) {
            int currentNumber = number % 10;
            reversedNumber += String.valueOf(currentNumber);
            number = number / 10;
        }
        if (unReversedNumber.equals(reversedNumber)) {
            return true;
        } else {
            return false;
        }
    }
}