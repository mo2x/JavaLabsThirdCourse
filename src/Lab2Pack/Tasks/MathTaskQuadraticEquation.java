package Lab2Pack.Tasks;

import java.util.Scanner;

/**
 * вычисление корней квадратного уравнения
 *
 * @author A.A. Borodovsky
 * @version 1.0
 */
public class MathTaskQuadraticEquation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите переменные a,b,с без запятых");
        double a = input.nextInt();
        double b = input.nextInt();
        double c = input.nextInt();
        double discriminant = Math.pow(b,2)-4*a*c;
        System.out.println("корни уравнения " + a + "*x^2+" + b + "*x+" + c + "=0");
        double rez;
        if (discriminant<0){
            System.out.println("нет корней");
        } else if (a!=0){
            rez = ((-b)+Math.sqrt(discriminant))/(2*a);
            System.out.print(rez+" ");
            if (discriminant>0){
                rez = ((-b)-Math.sqrt(discriminant))/(2*a);
                System.out.println(rez+" ");
            }
        } else {
            rez = (-c)/b;
            System.out.println(rez);
        }
    }
}
