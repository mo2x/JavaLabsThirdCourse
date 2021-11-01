package Lab2Pack.Tests;

/**
 * оператор continue не прерывает цикл
 * исключаются только действия в цикле
 * при выполнении данного условия.
 * Пример вычисления суммы чисел.
 *
 * @author A.A. Borodovsky
 * @version 1.0
 */
public class ContinueTest {
    public static void main(String[] args) {
        int sum = 0;
        int number = 0;
        while (number < 20) {
            number++;
            if (number == 10 || number == 11) continue;
            sum += number;
            System.out.println("number = " + number + " sum = " + sum);
        }
        System.out.println("The sum is " + sum);
    }
}
