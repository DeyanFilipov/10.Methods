package Methods.Exercise;

import java.util.Scanner;

public class MiddleCharacters_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        System.out.println(calcLength(input));
    }
    public static String calcLength(String text) {
        int count = 0;
        String midChar = "";
        for (int i = 0; i < text.length(); i++) {
            count++;
        }
        if (count % 2 == 0) {
            midChar = evenLength(text);
        } else {
            midChar = oddLength(text);
        }
        return midChar;
    }
    public static String evenLength(String text) {
        int calcMiddle = text.length() - 2;
        int remainCharacters = calcMiddle / 2;
        String midChar = "";

        for (int i = 0; i < remainCharacters + 2; i++) {
            if (i > remainCharacters - 1) {
                midChar += text.charAt(i);
            }
        }
        return midChar;
    }
    public static String oddLength(String text) {
        int calcMiddle = text.length() - 1;
        int remainCharacters = calcMiddle / 2;
        String midChar = "";

        for (int i = 0; i < remainCharacters + 1; i++) {
            if (i == remainCharacters) {
                midChar += text.charAt(i);
            }
        }
        return midChar;
    }
}