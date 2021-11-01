package Lab2Pack.Tests;

import java.util.Scanner;
/**
 * Вычисление суммы чисел.
 * do-while цикл.
 *
 * @author A.A. Borodovsky
 * @version 1.0
 */
public class DoWhileTest {
    public static void main(String[] args) {
        int data;
        int sum = 0;
// Создаем объект Scanner
        Scanner input = new Scanner(System.in);
// Вводим данные пока не -1
// Keep reading data until the input is -1
        do {
// Read the next data
            System.out.println("Вводите целое значение (выход, если -1): ");
            data = input.nextInt();
            sum += data;
        } while (data != -1);
        System.out.println("Сумма введенных чисел = " + sum);
    }
}
