package Lab2Pack.Tasks;
import Lab2Pack.HolidayInput;

import java.util.Scanner;

/**
 * индивидуальное задание с использованием for
 *
 * @author A.A. Borodovsky
 * @version 1.0
 */
public class IndividualForTask {
    public static void main(String[] args) {
        HolidayInput h = new HolidayInput();
        h.getHoliday();
        int del = h.getDay()+h.getMonth();
        int sum = 0;
        for (int i = 0, j = 200; i < 100 || j < 500; i++ ,j++){
            if ((i % del == 0)&&(i<100)){
                sum+=i;
            }
            if (j % del == 0){
                sum+=j;
            }
        }
        System.out.println(sum);
    }
}
