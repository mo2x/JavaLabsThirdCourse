package Lab2Pack.Tests;
import java.util.Scanner;

/**
 * пример работы конструкции if
 *
 * @author A.A. Borodovsky
 * @version 1.0
 */
public class IfTestSmall {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите целое значение х");
        int x = input.nextInt();
        System.out.println("Введите целое значение y");
        int y = input.nextInt();
// Вариант 1: one-way
        if (x > y)
            System.out.println(x+" больше "+ y);
// Вариант 2: one-way
        if (x > y) {
            System.out.println(x+" больше "+ y);
            System.out.println("Разность x - y = " + (x - y));
        }
// Вариант 3: two-way
        if (x > y) {
            System.out.println(x+" больше y");
            System.out.println("Разность "+x+" - "+y+" = " + (x - y));
        } else {
            System.out.println(x+" меньше или равно "+ y);
        }
    }
}
