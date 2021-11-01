package Lab1Pack;
/**
 * изучение примитивных типов
 * печать с использованием операторов
 * print println
 *
 * @author A.A. Borodovsky
 * @version 1.0
 */
public class PrimitiveTypes {
    public static void main(String[] args) {
        // объявляем различные типы переменных
        // одновременно инициализируем их
        short s = 12;
        int i = 125;
        long l = 1234567;
        float f = 123.98f;
        double d = 123412.567;
        char c = 'A';
        String str = "Hello";
        boolean b = false;
        System.out.print(" short = " + s);
        System.out.print(" int = " + i);
        System.out.print(" long = " + l);
        System.out.println(" float = " + f);
        System.out.println(" double = " + d);
        System.out.println(" char = " + c);
        System.out.println(" String = " + str);
        System.out.println(" boolean = " + b);
    }
}
