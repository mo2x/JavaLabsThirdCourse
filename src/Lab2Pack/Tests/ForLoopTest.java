package Lab2Pack.Tests;

/**
 * for - цикл на примерах
 * Example 2 - цикл контролируется по двум переменным!
 *
 * @author A.A. Borodovsky
 * @version 1.0
 */
public class ForLoopTest {
    public static void main(String[] args) {
// Example 1
        float sum = 0;
        for (float x = 0.01f; x <= 1.1f; x = x + 0.01f)
            sum += x;
        System.out.println("The sum is " + sum);
// Example 2
        for (int i = 0, j = 3; (i + j < 4); i++, j++) {
            System.out.println("\nТекущие значения i = " + i + " j = " + j);
            System.out.println("\tСумма i + j = " + (i + j));
        }
    }
}
