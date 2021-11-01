package Lab3Pack;

import java.util.Scanner;

/**
 * пример метода не возвращающего значение
 * с вводом данных из консоли
 *
 * @author А.А Borodovsky
 * @version 1.0
 */
public class MaxTest {
    /** Main method */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = input.nextInt();
        int j = input.nextInt();
// call method max
        max(i, j);
    }
    /** Print the max between two numbers */
    public static void max(int num1, int num2) {
        int result;
        if (num1 > num2)
            result = num1;
        else
            result = num2;
        System.out.println("The maximum between " + num1 +
                " and " + num2 + " is " + result);
    }
}
