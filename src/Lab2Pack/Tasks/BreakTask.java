package Lab2Pack.Tasks;

import Lab2Pack.HolidayInput;
/**
 * вычисления произведений целых чисел от 14 до Nmax.
 * В качестве Nmax взят год+день+месяц
 * Вычисления прервется, как только произведение
 * будет делиться на 79 без остатка.
 */
public class BreakTask {
    public static void main(String[] args) {
        HolidayInput h = new HolidayInput();
        h.getHoliday();
        int data = h.getDay()+h.getMonth()+h.getYear();
        int number = 14;
        long multy = 14;
        while (number<data){
            number++;
            multy *= number;
            if (multy % 79 == 0) break;
        }
        System.out.println("Значение переменной number = " + number);
        System.out.println("Значение переменной multy = " + multy);
    }
}
