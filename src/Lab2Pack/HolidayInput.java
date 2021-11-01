package Lab2Pack;

import java.util.Scanner;

/**
 * класс для ввода даты рождения
 * в индивидуальных заданиях
 * что бы записать дату в объект класса вызывается метод getHoliday
 * @author A.A. Borodovsky
 * @version 1.0
 */
public class HolidayInput {
    int day;
    int month;
    int year;
    /**
     * метод который начинает консольный ввод
     * даты рождения
     */
    public void getHoliday(){
        Scanner input = new Scanner(System.in);
        System.out.println("Введите дату своего рождения в формате \"ДД.ММ.ГГ\"");
        String date = input.nextLine();
        day = Integer.parseInt( date.split("\\.")[0]);
        month = Integer.parseInt( date.split("\\.")[1]);
        year = Integer.parseInt( date.split("\\.")[2]);
    }
    public int getDay() {
        return day;
    }
    public int getMonth() {
        return month;
    }
    public int getYear() {
        return year;
    }
}
