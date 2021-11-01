package Lab2Pack.Tests;
/**
 * break оператор
 * используется для выхода из цикла
 * в данном случае за пределы цикла!!!
 * Пример суммирования чисел по условию
 *
 * @author A.A. Borodovsky
 * @version 1.0
 */
public class BreakTest{
    public static void main(String[] args) {
        int sum = 0;
        int number = 0;
        while (number < 20) {
            number++;
            sum += number;
// выход из цикла при выполнения условия
            if (sum >= 110) break;
        }
        System.out.println("Значение переменной number = " + number);
        System.out.println("Значение переменной sum = " + sum);
    }
}
