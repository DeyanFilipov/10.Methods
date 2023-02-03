package Methods.Exercise;

import java.util.Scanner;

public class AddAndSubtract_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int num3 = Integer.parseInt(scanner.nextLine());

        int addedSum = sumNum(num1, num2);
        int subtractionResult = subtractNum(addedSum, num3);

        System.out.println(subtractionResult);
    }
    public static int sumNum(int first, int second) {
        int result = first + second;
        return result;
    }
    public static int subtractNum(int summedNum, int subtractionNum) {
        return summedNum - subtractionNum;
    }
}
