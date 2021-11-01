package Lab3Pack;
/**
 * перегрузка методов
 * имена методов одинаковые, различные сигнатуры
 * количество параметров и их типы отличаются
 * на примере нахождения максимума и минимума
 *
 * @author A.A. Borodovsky
 * @version 1.0
 */
public class TestMethodOverloading {
    /**
     * Main method
     */
    public static void main(String[] args) {
// Вызов метода max метода с двумя int параметрами
        System.out.println("The maximum between 3 and 4 is "
                + max(3, 4));
// Вызов метода max с двумя double параметрами
        System.out.println("The maximum between 3.0 and 5." +
                + max(3.0, 5.4));
// Вызов метода max с int и double параметрами
        System.out.println("The maximum between 3 and 5.4 is "
                + max(3, 5.4));
// Вызов метода max с тремя! double параметрами
        System.out.println("The maximum between 3.0, 5.4, and 10.14 is "
                + max(3.0, 5.4, 10.14));
    }
    /**
     * Возвращает max из двух int значений
     */
    public static int max(int num1, int num2) {
        if (num1 > num2)
            return num1;
        else
            return num2;
    }
    /**
     * Возвращает max из двух double значений
     */
    public static double max(double num1, double num2) {
        if (num1 > num2)
            return num1;
        else
            return num2;
    }
    /**
     * Возвращает max из трех double значений
     * используется обращение к методу с двумя параметрами
     */
    public static double max(double num1, double num2, double num3) {
        return max(max(num1, num2), num3);
    }
}
