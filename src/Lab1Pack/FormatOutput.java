package Lab1Pack;
/**
 * форматируем данные вывода для разных типов
 * спецификаторы вывода на консоль переменных разных типов
 * используется метод printf
 * %b - booleen (true false)
 * %c - char ('a')
 * %d - decimal integer (200)
 * %f - floating-point number (45.6723)
 * %e - scietific notation
 * %s - string
 *
 * @author A.A. Borodovsky
 * @version 1.0
 */
public class FormatOutput {
    public static void main(String[] args) {
        boolean ans = true;
        char letter = 'b';
        float sum = 45.4789f;
        System.out.printf("\nЭто пример 1 \n ans = %8b", ans);
        System.out.printf("\nЭто пример 2 \n letter = %4c", letter);
        System.out.printf("\nЭто пример 3 \n sum = %5.2f", sum);
        System.out.printf("\nЭто пример 4" +"\n ans = %8b \n letter = %4c \n sum = %5.2f",ans, letter, sum);
        double disc = 2345643.0904504;
        String text = "This is my text";
        System.out.printf("\nЭто пример 5\n disc = %3.10f", disc);
        System.out.printf("\nЭто пример 6\n %-20s \n %S \n %20s \n %-10.4s random text", text,text,text,text);
    }
}
