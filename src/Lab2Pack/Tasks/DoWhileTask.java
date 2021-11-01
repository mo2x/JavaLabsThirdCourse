package Lab2Pack.Tasks;

import Lab2Pack.HolidayInput;

import java.util.Scanner;
/**
 * Вычисление суммы чисел если это не день или месяц рождения.
 * do-while цикл.
 *
 * @author A.A. Borodovsky
 * @version 1.0
 */
public class DoWhileTask {
    public static void main(String[] args) {
        HolidayInput h = new HolidayInput();
        h.getHoliday();
        Scanner input = new Scanner(System.in);
        int data;
        int sum = 0;
        do {
            System.out.println("Вводите целое значение (выход, если 0): ");
            data = input.nextInt();
            if ((data!=h.getDay())&&(data!=h.getMonth()))
                sum += data;
        } while (data != 0);
        System.out.println(sum);
    }
}
