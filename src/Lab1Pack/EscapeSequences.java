package Lab1Pack;
/**
 * форматирование вывода
 * работа с EscapeSequences
 * \b backspace
 * \t Tab
 * \n Linefeed
 * \f Formfeed
 * \r Carriage Return
 * \\ Backslash
 * \' single Quate
 * \" Double Quate
 *
 * @author A.A. Borodovsky
 * @version 1.0
 */
public class EscapeSequences {
    public static void main(String[] args) {
        System.out.println("\t Hello \"Java\"");
        System.out.print("\n\t Hello 'Java'");
        System.out.print("\b My name is 'Andrey'");
        System.out.print("\n\\ This is only Remark \\");
    }
}
