package Lab1Pack;
import java.util.Scanner;
/**
 * ввод данных с консоли
 * на примере вычисления длины окружности
 * и площади прямоугольного треугольника
 *
 * @author A.A. Borodovsky
 * @version 1.0
 */
public class ConsoleInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number for radius: ");
        double radius = input.nextDouble();
        double length = 2 * 3.14159 * radius;
        System.out.println("The length for the circle of radius " + radius + " is " + length);
        byte byteType = input.nextByte();
        short shortType = input.nextShort();
        int intType = input.nextInt();
        long longType = input.nextLong();
        char charType = input.next().charAt(0);
        boolean boolType = input.hasNextBoolean();
        float floatType = input.nextFloat();
        System.out.println(" byteType = " + byteType + "\n shortType = " + shortType + "\n intType = " + intType
                + "\n longType = " + longType + "\n charType = " + charType + "\n boolType = " + boolType
                + "\n floatType = " + floatType);
        System.out.println("Enter a legs of triangle");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double Squares = a*b/2;
        System.out.println("Square of triangle = " + Squares);
    }
}
