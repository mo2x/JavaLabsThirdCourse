package Lab2Pack.Tasks;
/**
 * Применение label и continue.
 * Конструкции для label и continue
 *
 * @author V.V. Sidorik
 * @version 1.2 09.02.2017
 */
public class LabelTask {
    public static void main(String[] args) {
        int[] scores = {3, 9, 5, 3, 8, 10, 7, 1, 0, 8};
        outer:
        for (int i = 0; i < 10; i++) {
            if (scores[i] <= 0) break outer;
            if (scores[i] > 5) {
                inner:
                for (int j = 0; j < 3; j++) {
                    if (scores[i] == 10) {
                        System.out.println(" Хороший результат! Ура!!! ");
                        continue inner;
                    }

                    System.out.println("Неплохо! Ура!");

                    continue outer;
                }
            }
            if (scores[i] > 3) System.out.println("Больше практики...");
            else System.out.println("Начнем сначала");
        }
    }
}
