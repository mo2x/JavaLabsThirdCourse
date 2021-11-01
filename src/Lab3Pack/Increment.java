package Lab3Pack;

import java.util.Scanner;

/**
 * демонстрация передачи by value (по значению)
 *
 * @author A.A. Borodovsky
 * @version 1.0
 */
public class Increment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        System.out.println("Before the call, n is " + x);
        increment(x);
        System.out.println("after the call, n is " + x);
    }
    public static void increment(int n) {
        n++;
        System.out.println("n inside the method is " + n);
    }
}