package Lab2Pack.Tasks;
import java.util.Scanner;

/**
 * перевод балла в оценку
 *
 * @author A.A. Borodovsky
 * @version 1.0
 */
public class Rating {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int score = input.nextInt();
        if (score >= 90){
            System.out.println("A");
        } else if (score >= 80){
            System.out.println("B");
        } else if (score >= 70){
            System.out.println("C");
        } else if (score >= 60){
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }
}
