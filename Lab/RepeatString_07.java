package Methods.Lab;

import java.util.Scanner;

public class RepeatString_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputString = scanner.nextLine();
        int n = Integer.parseInt(scanner.nextLine());

        System.out.println(repeatString(inputString, n));
    }
    public static String repeatString(String input, int times) {
        String inputCalc = "";
        for (int i = 1; i <=  times; i++) {
            inputCalc += input;
        }
        return inputCalc;
    }
}
