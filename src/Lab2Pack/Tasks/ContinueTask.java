package Lab2Pack.Tasks;

import Lab2Pack.HolidayInput;

import java.util.Scanner;

/**
 * цикл с continue
 * но в качестве условий завершения работы цикла
 * введен день рождения
 */
public class ContinueTask {
    public static void main(String[] args) {
        HolidayInput h = new HolidayInput();
        h.getHoliday();
        int sum = 0;
        int number = 0;
        while (number < 20) {
            number++;
            if (number == h.getDay() || number == h.getMonth()) continue;
            sum += number;
            System.out.println("number = " + number + " sum = " + sum);
        }
        System.out.println("The sum is " + sum);
    }
}
