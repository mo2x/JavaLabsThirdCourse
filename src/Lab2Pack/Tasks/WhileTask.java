package Lab2Pack.Tasks;
/**
 * while - оператор цикла
 * На примере вычисления суммы чисел от xMin до xMax
 *
 * @author A.A. Borodovsky
 * @version 1.0
 */

public class WhileTask {
    public static void main(String[] args) {
        int sum = 0;
        int xMin = 11;
        int xMax = 25;
        while (xMin < xMax){
            sum += xMin;
            xMin++;
        }
        System.out.println("Сумма чисел sum = " + sum);
        System.out.println("Последнее число i = " + xMin);
    }
}
