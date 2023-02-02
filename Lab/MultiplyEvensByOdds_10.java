package Methods.Lab;

import java.util.Scanner;

public class MultiplyEvensByOdds_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        int even = evenSum(Math.abs(num));
        int odd = oddSum(Math.abs(num));
        int total = even * odd;
        System.out.println(total);
    }

    public static int evenSum(int num) {
        String toString = String.valueOf(num);
        int even = 0;
        int odd = 0;
        for (int i = 0; i < toString.length(); i++) {
            int currentNum = Integer.parseInt(String.valueOf(toString.charAt(i)));
            if (currentNum % 2 == 0) {
                even += currentNum;
            } else {
                odd += currentNum;
            }
        }
        return even;
    }

    public static int oddSum(int num) {
        String toString = String.valueOf(num);
        int even = 0;
        int odd = 0;
        for (int i = 0; i < toString.length(); i++) {
            int currentNum = Integer.parseInt(String.valueOf(toString.charAt(i)));
            if (currentNum % 2 == 0) {
                even += currentNum;
            } else {
                odd += currentNum;
            }
        }
        return odd;
    }
}