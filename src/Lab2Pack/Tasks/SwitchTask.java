package Lab2Pack.Tasks;

import javax.swing.*;

/**
 * перевод балла в оценку
 *
 * @author A.A. Borodovsky
 * @version 2.0
 */
public class SwitchTask {
    public static void main(String[] args) {
        String answer = JOptionPane.showInputDialog(null,
                "Введите балл от 0 до 100",
                "Вариант ответа", JOptionPane.WARNING_MESSAGE);
        int score = Integer.parseInt(answer);
        int tScore = score / 10;
        switch (tScore) {
            case 10, 9 : System.out.println("A"); break;
            case 8 : System.out.println("B"); break;
            case 7 : System.out.println("C"); break;
            case 6 : System.out.println("D"); break;
            default : System.out.println("F"); break;
        }
    }
}
