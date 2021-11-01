package Lab1Pack;
/**
 * изучение операторов инкремент, декремент
 *
 * @author A.A. Borodovsky
 * @version 1.0
 */
public class IncrementDecrement {
    public static void main(String args[]) {
        int x = 23, y = 4;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("++x = " + ++x);
        System.out.println("y++ = " + y++);
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        x=5;
        y=3;
        double num = ++x/(--y);
        System.out.println(num);
    }
}
