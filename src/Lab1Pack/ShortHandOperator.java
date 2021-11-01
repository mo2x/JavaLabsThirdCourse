package Lab1Pack;
/**
 * shortcut operators: анализируем выполнение increment decrement
 * shortcut operators: += -= *= /= %=
 * анализируем разницу в префиксной и постфиксной форме
 * если эти операторы встречаются в выражениях
 * !!! для числовых переменных и типа char
 *
 * @author A.A. Borodovsky
 * @version 1.0
 */
public class ShortHandOperator {
    public static void main(String[] args) {
        int x = 10, y = -45;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("++x = " + ++x);
        System.out.println("y++ = " + y++);
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        x = 0;
        y = 7999;
        int z;
        z = ++x + y;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = ++x + y = " + z);

        x = 89;
        y = -89;
        z = x++ + y;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = x++ + y = " + z);

        int i = 0, j = -1, k = 1, m = -2, n = 2;
        i += 10;
        j -= 11;
        k *= 12;
        m /= 13;
        n %= 14;
        System.out.println(" i += 10 получаем " + i);
        System.out.println(" j -= 11 получаем " + j);
        System.out.println(" k *= 12 получаем " + k);
        System.out.println(" m /= 13 получаем " + m);
        System.out.println(" n %= 14 получаем " + n);
        System.out.println(Math.pow(2, 3));
        System.out.println(Math.sin(2));

        char a = 'a';
        char b = 'b';
        System.out.println(" a += 8 получаем " + (a += 8));
        System.out.println(" b += 1 получаем " + (b += 1));
        x = -10;
        y = x++ + x;
        System.out.println("----- y = " + y);
        System.out.println('3' - '2' + 'm' / 'n');
        x = 10;
        y = 10;
        boolean zz = (y > 10) && (x++ > 10);
        System.out.println("x=" + x);
        x = 10;
        y = 10;
        zz = (y > 10) || (x++ > 10);
        System.out.println("|| x=" + x);
        System.out.println("-24/-5 = " + (-24 % -5));
        System.out.println("-24.2/-5.5 = " + (-24.2 % -5.5));
        System.out.println("'A' + 1 = " + ('A' + 1));
    }
}
