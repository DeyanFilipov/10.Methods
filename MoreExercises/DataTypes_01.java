package Methods.MoreExercises;

import java.util.Scanner;

public class DataTypes_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String value = scanner.nextLine();

        Value(input,value);
    }
    public static void Value(String input, String value) {
        switch (input) {
            case "int":
                int currentNum = Integer.parseInt(value);
                isInt(currentNum);
                break;
            case "real":
                double currentDouble = Double.parseDouble(value);
                isDouble(currentDouble);
                break;
            case "string":
                isString(value);
                break;
        }
    }
    public static void isInt(int number) {
        System.out.println(number * 2);
    }
    public static void isDouble(double number) {
        System.out.printf("%.2f", number * 1.5);
    }
    public static void isString (String text) {
        System.out.printf("$%s$", text);
    }
}